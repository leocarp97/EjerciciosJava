package com.estancias.controladores;


import com.estancias.entidades.Cliente;
import com.estancias.entidades.Usuario;
import com.estancias.servicios.ClienteServicio;
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
@RequestMapping("/cliente")
public class ClienteControlador {


    @Autowired
    ClienteServicio clienteServicio;
    
    @Autowired
    UsuarioServicio usuarioServicio;

    @GetMapping("/list-cliente")
    public String listarClientes(ModelMap model) {

        List<Cliente> clientes = clienteServicio.listarClientes();

        model.addAttribute("clientes", clientes);

        return "list-cliente";
    }

    @GetMapping("/form-cliente")
    public String formulario(ModelMap model) {
        List<Usuario> usuarios = usuarioServicio.listarUsuarios();

        model.addAttribute("usuarios", usuarios);

        return "form-cliente";
    }

    @PostMapping("/form-cliente")
    public String guardar(RedirectAttributes attr, @RequestParam String nombre, @RequestParam String calle, @RequestParam int numero, @RequestParam String codPostal, @RequestParam String ciudad, @RequestParam String pais, @RequestParam String email, @RequestParam(required = false) String idUsuario) {

        try {
            clienteServicio.crear(nombre, calle, numero, codPostal, ciudad, pais, email, idUsuario);

        } catch (Exception e) {
            attr.addFlashAttribute("error", e.getMessage());
            return "redirect:/cliente/form-cliente/";
        }
        return "redirect:/cliente/index";
    }

    @GetMapping("/editar-cliente/{id}")
    public String editar(ModelMap model, @PathVariable String id) throws Exception {
        List<Usuario> usuarios = usuarioServicio.listarUsuarios();

        model.addAttribute("usuarios", usuarios);

        try {

            Optional<Cliente> cliente = clienteServicio.listarId(id);
            model.addAttribute("cliente", cliente.get());

            return "edit-cliente";
        } catch (Exception e) {
            return "edit-cliente";
        }
    }

    @PostMapping("/actualizar-cliente")
    public String editar(ModelMap model, @RequestParam String id, @RequestParam String nombre, @RequestParam String calle, @RequestParam int numero, @RequestParam String codPostal, @RequestParam String ciudad, @RequestParam String pais, @RequestParam String email, @RequestParam String idUsuario) throws Exception {

        try {

            clienteServicio.modificar(id, nombre, calle, numero, codPostal, ciudad, pais, email, idUsuario);

        } catch (Exception e) {
            return "form-cliente";
        }
        return "redirect:/cliente/list-cliente/";
    }

    @GetMapping("/eliminar-cliente/{id}")
    public String eliminar(@PathVariable String id) {

        clienteServicio.eliminarCliente(id);

        return "redirect:/cliente/list-cliente/";

    }

    @GetMapping("index")
    public String index() {
        return "index";
    }

}
