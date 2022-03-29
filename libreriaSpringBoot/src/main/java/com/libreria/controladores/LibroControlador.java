package com.libreria.controladores;

import com.libreria.entidades.Autor;
import com.libreria.entidades.Editorial;
import com.libreria.entidades.Libro;
import com.libreria.servicios.AutorServicio;
import com.libreria.servicios.EditorialServicio;
import com.libreria.servicios.LibroServicio;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/libro")
public class LibroControlador {

    @Autowired
    LibroServicio libroServicio;

    @Autowired
    AutorServicio autorServicio;

    @Autowired
    EditorialServicio editorialServicio;

    @GetMapping("/list-libro")
    public String listarLibros(ModelMap model) {

        List<Libro> libros = libroServicio.listarLibros();

        model.addAttribute("libros", libros);

        return "list-libro";
    }

    @GetMapping("/form-libro")
    public String formulario(ModelMap model) {
        List<Autor> autores = autorServicio.listarAutor();

        model.addAttribute("autores", autores);

        List<Editorial> editoriales = editorialServicio.listarEditorial();

        model.addAttribute("editoriales", editoriales);

        return "form-libro";
    }

    @PostMapping("/form-libro")
    public String guardar(RedirectAttributes attr, @RequestParam String titulo, @RequestParam Integer anio, @RequestParam Integer ejemplares, @RequestParam Integer ejemplaresPrestados, @RequestParam Integer ejemplaresRestantes, @RequestParam String idAutor, @RequestParam String idEditorial) {

        try {

            libroServicio.crear(titulo, anio, ejemplares, ejemplaresPrestados, ejemplaresRestantes, true, idAutor, idEditorial);

        } catch (Exception e) {
            attr.addFlashAttribute("error", e.getMessage());
            return "redirect:/libro/form-libro/";
        }
        return "redirect:/libro/list-libro";
    }

    @GetMapping("/editar-libro/{isbn}")
    public String editar(ModelMap model, @PathVariable String isbn) throws Exception {
        List<Autor> autores = autorServicio.listarAutor();

        model.addAttribute("autores", autores);

        List<Editorial> editoriales = editorialServicio.listarEditorial();

        model.addAttribute("editoriales", editoriales);
        try {

            Optional<Libro> libro = libroServicio.listarId(isbn);
            model.addAttribute("libro", libro.get());

            return "edit-libro";
        } catch (Exception e) {
            return "edit-libro";
        }

    }

    @PostMapping("/actualizar-libro")
    public String editar(ModelMap model, @RequestParam String isbn, @RequestParam String titulo, @RequestParam Integer anio, @RequestParam Integer ejemplares, @RequestParam Integer ejemplaresPrestados, @RequestParam Integer ejemplaresRestantes, @RequestParam String idAutor, @RequestParam String idEditorial) throws Exception {

        try {
            libroServicio.listarId(isbn);
            libroServicio.modificar(isbn, titulo, anio, ejemplares, ejemplaresPrestados, ejemplaresRestantes, true, idAutor, idEditorial);

        } catch (Exception e) {
            return "form-libro";
        }
        return "redirect:/libro/list-libro/";
    }

    @GetMapping("/eliminar-libro/{isbn}")
    public String eliminar(@PathVariable String isbn) {

        libroServicio.eliminarLibro(isbn);

        return "redirect:/libro/list-libro/";

    }

    @GetMapping("index")
    public String index() {
        return "index";
    }

}
