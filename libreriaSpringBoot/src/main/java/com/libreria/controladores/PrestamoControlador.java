package com.libreria.controladores;

import com.libreria.entidades.Cliente;
import com.libreria.entidades.Libro;
import com.libreria.entidades.Prestamo;
import com.libreria.servicios.ClienteServicio;
import com.libreria.servicios.LibroServicio;
import com.libreria.servicios.PrestamoServicio;
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
@RequestMapping("/prestamo")
public class PrestamoControlador {

    @Autowired
    PrestamoServicio prestamoServicio;

    @Autowired
    LibroServicio libroServicio;

    @Autowired
    ClienteServicio clienteServicio;

    @GetMapping("/list-prestamo")
    public String listarLibros(ModelMap model) {

        List<Prestamo> prestamos = prestamoServicio.listarPrestamo();

        model.addAttribute("prestamos", prestamos);

        return "list-prestamo";
    }

    @GetMapping("index")
    public String index() {
        return "index";
    }

    @GetMapping("/form-prestamo")
    public String formulario(ModelMap model) {
        List<Libro> libros = libroServicio.listarLibros();

        model.addAttribute("libros", libros);

        List<Cliente> clientes = clienteServicio.listarCliente();

        model.addAttribute("clientes", clientes);

        return "form-prestamo";
    }

    @PostMapping("/form-prestamo")
    public String guardar(RedirectAttributes attr, @RequestParam String fechaPrestamo, @RequestParam String fechaDevolucion, @RequestParam String idLibro, @RequestParam String idCliente) {

        try {
            prestamoServicio.crear(fechaPrestamo, fechaDevolucion, idLibro, idCliente);
        } catch (Exception e) {
            attr.addFlashAttribute("error", e.getMessage());
            return "redirect:/prestamo/form-prestamo";
        }
        return "redirect:/prestamo/list-prestamo";
    }

    @GetMapping("/editar-prestamo/{id}")
    public String editar(ModelMap model, @PathVariable("id") String id) throws Exception {
        List<Libro> libros = libroServicio.listarLibros();

        model.addAttribute("libros", libros);

        List<Cliente> clientes = clienteServicio.listarCliente();

        model.addAttribute("clientes", clientes);
        try {

            Optional<Prestamo> prestamo = prestamoServicio.listarId(id);
            model.addAttribute("prestamo", prestamo.get());

            return "edit-prestamo";
        } catch (Exception e) {
            return "edit-prestamo";
        }

    }

    @PostMapping("/actualizar-prestamo")
    public String editar(ModelMap model, @RequestParam String id, @RequestParam String fechaPrestamo, @RequestParam String fechaDevolucion, @RequestParam String idLibro, @RequestParam String idCliente) throws Exception {

        try {
            prestamoServicio.modificar(id, fechaPrestamo, fechaDevolucion, true, idLibro, idCliente);

        } catch (Exception e) {
            return "form-prestamo";
        }
        return "redirect:/prestamo/list-prestamo/";
    }

    @GetMapping("/eliminar-prestamo/{id}")
    public String eliminar(@PathVariable String id) throws Exception {

      prestamoServicio.deshabilitar(id);

        return "redirect:/prestamo/list-prestamo/";

    }

    @GetMapping("/habilitar-prestamo/{id}")
    public String habilitar(@PathVariable String id) throws Exception {

      prestamoServicio.habilitar(id);

        return "redirect:/prestamo/list-prestamo/";

    }
    
}
