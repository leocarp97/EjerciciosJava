package com.estancias.controladores;

import com.estancias.entidades.Casa;
import com.estancias.entidades.Comentario;
import com.estancias.servicios.CasaServicio;
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
@RequestMapping("/casa")
public class CasaControlador {

    @Autowired
    CasaServicio casaServicio;

    @Autowired
    ComentarioServicio comentarioServicio;

    @GetMapping("/list-casa")
    public String listarCasas(ModelMap model) {

        List<Casa> casas = casaServicio.listarCasas();

        model.addAttribute("casas", casas);

        return "list-casa";
    }

    @GetMapping("/form-casa")
    public String formulario(ModelMap model) {
        List<Comentario> comentarios = comentarioServicio.listarComentario();

        model.addAttribute("comentarios", comentarios);

        return "form-casa";
    }

    @PostMapping("/form-casa")
    public String guardar(RedirectAttributes attr, @RequestParam String calle, @RequestParam int numero, @RequestParam String codPostal, @RequestParam String ciudad, @RequestParam String pais, @RequestParam String fechaDesde, @RequestParam String fechaHasta, @RequestParam int minDias, @RequestParam int maxDias, @RequestParam double precio, @RequestParam String tipoVivienda, @RequestParam String idDescripcion) {

        try {

            casaServicio.crear(calle, numero, codPostal, ciudad, pais, fechaDesde, fechaHasta, minDias, maxDias, precio, tipoVivienda, idDescripcion);

        } catch (Exception e) {
            attr.addFlashAttribute("error", e.getMessage());
            return "redirect:/casa/form-casa/";
        }
        return "redirect:/casa/list-casa";
    }

    @GetMapping("/editar-casa/{id}")
    public String editar(ModelMap model, @PathVariable String id) throws Exception {
        List<Comentario> comentarios = comentarioServicio.listarComentario();

        model.addAttribute("comentarios", comentarios);

        try {

            Optional<Casa> casa = casaServicio.listarId(id);
            model.addAttribute("casa", casa.get());

            return "edit-casa";
        } catch (Exception e) {
            return "edit-casa";
        }

    }

     @PostMapping("/actualizar-casa")
    public String editar(ModelMap model, @RequestParam String id, @RequestParam String calle, @RequestParam int numero, @RequestParam String codPostal, @RequestParam String ciudad, @RequestParam String pais, @RequestParam String fechaDesde, @RequestParam String fechaHasta, @RequestParam int minDias, @RequestParam int maxDias, @RequestParam double precio, @RequestParam String tipoVivienda, @RequestParam String idDescripcion) throws Exception {

        try {
          
            casaServicio.modificar(id, calle, numero, codPostal, ciudad, pais, fechaDesde, fechaHasta, minDias, maxDias, precio, tipoVivienda, idDescripcion);
            
        } catch (Exception e) {
            return "form-casa";
        }
        return "redirect:/casa/list-casa/";
    }
    
   
    @GetMapping("/eliminar-casa/{id}")
    public String eliminar(@PathVariable String id) {

   casaServicio.eliminarCasa(id);

        return "redirect:/casa/list-casa/";

    }

    @GetMapping("index")
    public String index() {
        return "index";
    } 
    
    
}
