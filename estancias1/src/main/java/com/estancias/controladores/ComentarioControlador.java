package com.estancias.controladores;

import com.estancias.entidades.Comentario;
import com.estancias.servicios.ComentarioServicio;
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
@RequestMapping("/comentario")
public class ComentarioControlador {

    @Autowired
    ComentarioServicio comentarioServicio;

    @GetMapping("/list-comentario")
    public String listarComentarios(ModelMap model) {

        List<Comentario> comentarios = comentarioServicio.listarComentario();

        model.addAttribute("comentarios", comentarios);

        return "list-comentario";
    }

    @GetMapping("/form-comentario")
    public String formulario() {
        return "form-comentario";
    }

    @PostMapping("/form-comentario")
    public String guardar(RedirectAttributes attr, ModelMap model, @RequestParam String descripcion) {

        try {
            comentarioServicio.crear(descripcion);

            return "redirect:/comentario/list-comentario";
        } catch (Exception e) {
            attr.addFlashAttribute("error", e.getMessage());
            return "list-comentario";
        }
    }

    @GetMapping("/editar-comentario/{id}")
    public String editar(ModelMap model, @PathVariable String id) throws Exception {

        try {

            Optional<Comentario> comentario = comentarioServicio.listarId(id);
            model.addAttribute("comentario", comentario.get());

            return "edit-comentario";
        } catch (Exception e) {
            return "edit-comentario";
        }

    }

    @PostMapping("/actualizar-comentario/{id}")
    public String editar(RedirectAttributes attr, @PathVariable String id, @RequestParam String descripcion) throws Exception {
        try {

            comentarioServicio.modificar(id, descripcion);

        } catch (Exception e) {
            attr.addFlashAttribute("error", e.getMessage());
            return "redirect:/comentario/editar-comentario/" + id;
        }
        return "redirect:/comentario/list-comentario";
    }

    @GetMapping("/eliminar-comentario/{id}")
    public String eliminar(@PathVariable String id) {

        comentarioServicio.eliminarComentario(id);

        return "redirect:/comentario/list-comentario/";

    }

    @GetMapping("index")
    public String index() {
        return "index";
    }

}
