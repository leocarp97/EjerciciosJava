package com.estancias.controladores;

import com.estancias.entidades.Casa;
import com.estancias.entidades.Cliente;
import com.estancias.entidades.Estancia;
import com.estancias.servicios.CasaServicio;
import com.estancias.servicios.ClienteServicio;
import com.estancias.servicios.EstanciaServicio;
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
@RequestMapping("/estancia")
public class EstanciaControlador {

    @Autowired
    EstanciaServicio estanciaServicio;

    @Autowired
    ClienteServicio clienteServicio;

    @Autowired
    CasaServicio casaServicio;

    @GetMapping("/list-estancia")
    public String listarEstancias(ModelMap model) {

        List<Estancia> estancias = estanciaServicio.listarEstancias();

        model.addAttribute("estancias", estancias);

        return "list-estancia";
    }

    @GetMapping("/form-estancia")
    public String formulario(ModelMap model) {
        List<Cliente> clientes = clienteServicio.listarClientes();

        model.addAttribute("clientes", clientes);

        List<Casa> casas = casaServicio.listarCasas();

        model.addAttribute("casas", casas);

        return "form-estancia";
    }

    @PostMapping("/form-estancia")
    public String guardar(RedirectAttributes attr, @RequestParam String huesped, @RequestParam String fechaDesde, @RequestParam String fechaHasta, @RequestParam String idCliente, @RequestParam String idCasa) {

        try {

            estanciaServicio.crear(huesped, fechaDesde, fechaHasta, idCliente, idCasa);

        } catch (Exception e) {
            attr.addFlashAttribute("error", e.getMessage());
            return "redirect:/estancia/form-estancia/";
        }
        return "redirect:/estancia/list-estancia";
    }

    @GetMapping("/editar-estancia/{id}")
    public String editar(ModelMap model, @PathVariable String id) throws Exception {
        List<Cliente> clientes = clienteServicio.listarClientes();

        model.addAttribute("clientes", clientes);

        List<Casa> casas = casaServicio.listarCasas();

        model.addAttribute("casas", casas);
        try {

            Optional<Estancia> estancia = estanciaServicio.listarId(id);
            model.addAttribute("estancia", estancia.get());

            return "edit-estancia";
        } catch (Exception e) {
            return "edit-estancia";
        }
    }

    @PostMapping("/actualizar-estancia")
    public String editar(ModelMap model, @RequestParam String id, @RequestParam String huesped, @RequestParam String fechaDesde, @RequestParam String fechaHasta, @RequestParam String idCliente, @RequestParam String idCasa) throws Exception {

        try {

            estanciaServicio.modificar(id, huesped, fechaDesde, fechaHasta, idCliente, idCasa);

        } catch (Exception e) {
            return "form-estancia";
        }
        return "redirect:/estancia/list-estancia/";
    }

    @GetMapping("/eliminar-estancia/{id}")
    public String eliminar(@PathVariable String id) {

      estanciaServicio.eliminarEstancia(id);

        return "redirect:/estancia/list-estancia/";

    }

    @GetMapping("index")
    public String index() {
        return "index";
    }

}
