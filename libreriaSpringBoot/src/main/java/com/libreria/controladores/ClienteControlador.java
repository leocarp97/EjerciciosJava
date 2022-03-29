package com.libreria.controladores;

import com.libreria.entidades.Cliente;
import com.libreria.servicios.ClienteServicio;
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
@RequestMapping("/cliente")
public class ClienteControlador {

    @Autowired
    ClienteServicio clienteServicio;

    @GetMapping("/list-cliente")
    public String listarClientes(ModelMap model) {

        List<Cliente> clientes = clienteServicio.listarCliente();

        model.addAttribute("clientes", clientes);

        return ("list-cliente");

    }

     @GetMapping("index")
    public String index() {
        return "index";
    }
    
    @GetMapping("/form-cliente")
    public String formulario() {
        return "form-cliente";
    }

    @PostMapping("/form-cliente")
    public String guardar(ModelMap model, @RequestParam Long documento, @RequestParam String nombre, @RequestParam String apellido, @RequestParam String telefono) {

        try {

            clienteServicio.crear(documento, nombre, apellido, telefono, true);

            return "redirect:/cliente/list-cliente";
        } catch (Exception e) {

            return "list-cliente";
        }
    }

    @GetMapping("/editar-cliente/{id}")
    public String editar(ModelMap model, @PathVariable String id) throws Exception {

        try {

            Cliente cliente = clienteServicio.buscarPorId(id);
            model.addAttribute("cliente", cliente);

            return "edit-cliente";
        } catch (Exception e) {
            return "edit-cliente";
        }

    }

    @PostMapping("/actualizar-cliente")
    public String editar(RedirectAttributes attr, @RequestParam String id, @RequestParam Long documento, @RequestParam String nombre, @RequestParam String apellido, @RequestParam String telefono) throws Exception {
        try {

         clienteServicio.modificar(id, documento, nombre, apellido, telefono, true);

        } catch (Exception e) {
            attr.addFlashAttribute("error", e.getMessage());
            return "redirect:/cliente/editar-cliente/" + id;
        }
        return "redirect:/cliente/list-cliente";

    }

    @GetMapping("/eliminar-cliente/{id}")
    public String eliminar(@PathVariable String id) {

     clienteServicio.eliminarCliente(id);

        return "redirect:/cliente/list-cliente/";

    }
    
    
}
