
package com.libreria.controladores;


import com.libreria.entidades.Editorial;
import com.libreria.servicios.EditorialServicio;
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
@RequestMapping("/editorial")
public class EditorialControlador {
    
  @Autowired
    EditorialServicio editorialServicio;

    @GetMapping("/list-editorial")
    public String listarAutor(ModelMap model) {

        List<Editorial> editoriales = editorialServicio.listarEditorial();

        model.addAttribute("editoriales", editoriales);

        return "list-editorial";
    }

    @GetMapping("/form-editorial")
    public String formulario() {
        return "form-editorial";
    }

    @PostMapping("/form-editorial")
    public String guardar(ModelMap model, @RequestParam String nombre) {

        try {
           editorialServicio.crear(nombre, true);

            return "redirect:/editorial/list-editorial/";
        } catch (Exception e) {

            return "form-editorial";
        }
    }


    @GetMapping("/editar-editorial/{id}")
    public String editar(ModelMap model, @PathVariable String id) throws Exception {

        try {

            Editorial editorial = editorialServicio.buscarPorId(id);
            model.addAttribute("editorial", editorial);

            return "edit-editorial";
        } catch (Exception e) {
            return "edit-editorial";
        }

    }

    @PostMapping("/actualizar-editorial")
    public String editar(RedirectAttributes attr, @RequestParam String id, @RequestParam String nombre) throws Exception {
        try {

            editorialServicio.modificar(id, nombre, true);

        } catch (Exception e) {
            attr.addFlashAttribute("error", e.getMessage());
            return "redirect:/editorial/editar-editorial/" + id;
        }
        return "redirect:/editorial/list-editorial";

    }
    
    @GetMapping("/eliminar-editorial/{id}")
    public String eliminar(@PathVariable String id) {

        editorialServicio.eliminarEditorial(id);

        return "redirect:/editorial/list-editorial/";

    }
    
     @GetMapping("index")
    public String index(){
        return "index";
    }
}

