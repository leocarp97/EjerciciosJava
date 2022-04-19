package com.libreria.controladores;

import com.libreria.entidades.Usuario;
import com.libreria.enums.Rol;
import com.libreria.servicios.UsuarioServicio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/usuario")
public class UsuarioControlador {

    @Autowired
    UsuarioServicio usuarioServicio;

    @PreAuthorize("hasAnyRole('ROLE_ADMIN')")
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
    public String guardar(ModelMap model, @RequestParam String email, @RequestParam String clave, @RequestParam Rol rol) {

        try {
            usuarioServicio.crear(email, clave, rol);

            return "redirect:/usuario/index";
        } catch (Exception e) {

            return "list-usuario";
        }
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
