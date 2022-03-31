package com.estancias.controladores;

import com.estancias.entidades.Usuario;
import com.estancias.servicios.UsuarioServicio;
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
@RequestMapping("/usuario")
public class UsuarioControlador {
    
    @Autowired
    UsuarioServicio usuarioServicio;
    
    @GetMapping("/list-usuario")
    public String listarUsuarios(ModelMap model) {
        
        List<Usuario> usuarios = usuarioServicio.listarUsuarios();
        
        model.addAttribute("usuarios", usuarios);
        
        return "list-usuario";
    }
    
    @GetMapping("/form-usuario")
    public String formulario() {
        return "form-usuario";
    }
    
    @PostMapping("/form-usuario")
    public String guardar(ModelMap model, @RequestParam String alias, @RequestParam String email, @RequestParam String clave, @RequestParam String fechaDesde, @RequestParam String fechaHasta) {
        
        try {
            usuarioServicio.crear(alias, email, clave, fechaHasta, fechaHasta);
            
            return "redirect:/usuario/list-usuario";
        } catch (Exception e) {
            
            return "list-usuario";
        }
    }
    
    @GetMapping("/editar-usuario/{id}")
    public String editar(ModelMap model, @PathVariable String id) throws Exception {
        
        try {
            
            Usuario usuario = usuarioServicio.buscarPorId(id);
            model.addAttribute("usuario", usuario);
            
            return "edit-usuario";
        } catch (Exception e) {
            return "edit-usuario";
        }
        
    }
    
    @PostMapping("/actualizar-usuario")
    public String editar(RedirectAttributes attr, @RequestParam String id, @RequestParam String alias, @RequestParam String email, @RequestParam String clave, @RequestParam String fechaDesde, @RequestParam String fechaHasta) throws Exception {
        try {
            
            usuarioServicio.modificar(id, alias, email, clave, fechaHasta, fechaHasta);
            
        } catch (Exception e) {
            attr.addFlashAttribute("error", e.getMessage());
            return "redirect:/usuario/editar-usuario/" + id;
        }
        return "redirect:/usuario/list-usuario";
    }
    
    @GetMapping("/eliminar-usuario/{id}")
    public String eliminar(@PathVariable String id) {
        
        usuarioServicio.eliminarUsuario(id);
        
        return "redirect:/usuario/list-usuario/";
        
    }
    
    @GetMapping("index")
    public String index() {
        return "index";
    }
    
}
