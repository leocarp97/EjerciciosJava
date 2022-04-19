package com.libreria.controladores;

import com.libreria.entidades.Autor;
import com.libreria.servicios.AutorServicio;
import java.util.List;
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
@RequestMapping("/autor")
public class AutorControlador {

    @Autowired
    AutorServicio autorServicio;

    @GetMapping("/list-autor")
    public String listarAutor(ModelMap model) {

        List<Autor> autores = autorServicio.listarAutor();

        model.addAttribute("autores", autores);

        return "list-autor";
    }

    @GetMapping("/form-autor")
    public String formulario() {
        return "form-autor";
    }

    @PostMapping("/form-autor")
    public String guardar(ModelMap model, @RequestParam String nombre) {

        try {
            autorServicio.crear(nombre, true);

            return "redirect:/autor/list-autor";
        } catch (Exception e) {

            return "list-autor";
        }
    }

    @GetMapping("/editar-autor/{id}")
    public String editar(ModelMap model, @PathVariable String id) throws Exception {

        try {

            Autor autor = autorServicio.buscarPorId(id);
            model.addAttribute("autor", autor);

            return "edit-autor";
        } catch (Exception e) {
            return "edit-autor";
        }

    }

    @PostMapping("/actualizar-autor")
    public String editar(RedirectAttributes attr, @RequestParam String id, @RequestParam String nombre) throws Exception {
        try {

            autorServicio.modificar(id, nombre, true);

        } catch (Exception e) {
            attr.addFlashAttribute("error", e.getMessage());
            return "redirect:/autor/editar-autor/" + id;
        }
        return "redirect:/autor/list-autor";

    }

    @GetMapping("/eliminar-autor/{id}")
    public String eliminar(@PathVariable String id) {

        autorServicio.eliminarPorIdAutor(id);

        return "redirect:/autor/list-autor/";

    }
    
     @GetMapping("index")
    public String index(){
        return "index";
    }
}
