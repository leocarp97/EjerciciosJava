package com.estancias.controladores;

import com.estancias.entidades.Casa;
import com.estancias.entidades.Familia;
import com.estancias.entidades.Usuario;
import com.estancias.servicios.CasaServicio;
import com.estancias.servicios.FamiliaServicio;
import com.estancias.servicios.UsuarioServicio;
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
@RequestMapping("/familia")
public class FamiliaControlador {
    
    @Autowired
    FamiliaServicio familiaServicio;
    
    @Autowired
    UsuarioServicio usuarioServicio;
    
    @Autowired
    CasaServicio casaServicio;
    
    @GetMapping("/list-familia")
    public String listarFamilias(ModelMap model) {
        
        List<Familia> familias = familiaServicio.listarFamilias();
        
        model.addAttribute("familias", familias);
        
        return "list-familia";
    }
    
    @GetMapping("/form-familia")
    public String formulario(ModelMap model) {
        List<Usuario> usuarios = usuarioServicio.listarUsuarios();
        
        model.addAttribute("usuarios", usuarios);
        
        List<Casa> casas = casaServicio.listarCasas();
        
        model.addAttribute("casas", casas);
        
        return "form-familia";
    }
    
    @PostMapping("/form-familia")
    public String guardar(RedirectAttributes attr, @RequestParam String nombre, @RequestParam int edadMin, @RequestParam int edadMax, @RequestParam int numHijos, @RequestParam String email, @RequestParam String idUsuario, @RequestParam String idCasa) {
        
        try {
            
            familiaServicio.crear(nombre, edadMin, edadMax, numHijos, email, idUsuario, idCasa);
            
        } catch (Exception e) {
            attr.addFlashAttribute("error", e.getMessage());
            return "redirect:/familia/form-familia/";
        }
        return "redirect:/familia/list-familia";
    }
    
    @GetMapping("/editar-familia/{id}")
    public String editar(ModelMap model, @PathVariable String id) throws Exception {
        List<Usuario> usuarios = usuarioServicio.listarUsuarios();
        
        model.addAttribute("usuarios", usuarios);
        
        List<Casa> casas = casaServicio.listarCasas();
        
        model.addAttribute("casas", casas);
        try {
            
            Optional<Familia> familia = familiaServicio.listarId(id);
            model.addAttribute("familia", familia.get());
            
            return "edit-familia";
        } catch (Exception e) {
            return "edit-familia";
        }
    }
    
    @PostMapping("/actualizar-familia")
    public String editar(ModelMap model, @RequestParam String id, @RequestParam String nombre, @RequestParam int edadMin, @RequestParam int edadMax, @RequestParam int numHijos, @RequestParam String email, @RequestParam String idUsuario, @RequestParam String idCasa) throws Exception {
        
        try {
            
            familiaServicio.modificar(id, nombre, edadMin, edadMax, numHijos, email, idUsuario, idCasa);
            
        } catch (Exception e) {
            return "form-familia";
        }
        return "redirect:/familia/list-familia/";
    }
    
    @GetMapping("/eliminar-familia/{id}")
    public String eliminar(@PathVariable String id) {
        
        familiaServicio.eliminarFamilia(id);
        
        return "redirect:/familia/list-familia/";
        
    }
    
    @GetMapping("index")
    public String index() {
        return "index";
    }
    
}
