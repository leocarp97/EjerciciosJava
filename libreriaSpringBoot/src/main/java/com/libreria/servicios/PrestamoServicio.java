package com.libreria.servicios;

import com.libreria.entidades.Cliente;
import com.libreria.entidades.Libro;
import com.libreria.entidades.Prestamo;
import com.libreria.repositorios.ClienteRepositorio;
import com.libreria.repositorios.LibroRepositorio;
import com.libreria.repositorios.PrestamoRepositorio;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PrestamoServicio {

    @Autowired
    PrestamoRepositorio prestamoRepositorio;

    @Autowired
    LibroServicio libroServicio;

    @Autowired
    LibroRepositorio libroRepositorio;

    @Autowired
    ClienteRepositorio clienteRepositorio;

    @Autowired
    ClienteServicio clienteServicio;

    @Transactional(rollbackFor = {Exception.class})
    public Prestamo crear(String fechaPrestamo, String fechaDevolucion, String idLibro, String idCliente) throws Exception {

        Prestamo prestamo = new Prestamo();

        prestamo.setFechaPrestamo(fechaPrestamo);
        prestamo.setFechaDevolucion(fechaDevolucion);
        prestamo.setAlta(true);

        //Libro libro = libroRepositorio.getOne(idLibro);
        System.out.println(idLibro);
        Libro libro = libroServicio.buscarPorId(idLibro);
        prestamo.setLibro(libro);

        //Cliente cliente = clienteRepositorio.getOne(idCliente);
        Cliente cliente = clienteServicio.buscarPorId(idCliente);
        prestamo.setCliente(cliente);

        prestamoRepositorio.save(prestamo);

        return prestamo;

    }

    @Transactional(rollbackFor = {Exception.class})
    public void modificar(String id, String fechaPrestamo, String fechaDevolucion, Boolean alta, String idLibro, String idCliente) throws Exception {

        Optional<Prestamo> respuesta = prestamoRepositorio.findById(id);

        if (respuesta.isPresent()) {
            Prestamo prestamo = respuesta.get();

            prestamo.setFechaPrestamo(fechaPrestamo);
            prestamo.setFechaDevolucion(fechaDevolucion);
            prestamo.setAlta(alta);

            Libro libro = libroServicio.buscarPorId(idLibro);
            prestamo.setLibro(libro);

            Cliente cliente = clienteServicio.buscarPorId(idCliente);
            prestamo.setCliente(cliente);

            prestamoRepositorio.save(prestamo);

        } else {
            throw new Exception("No se encontro el prestamo buscado");
        }

    }

    @Transactional(readOnly = true)
    public List<Prestamo> listarPrestamo() {
        return prestamoRepositorio.findAll();
    }

    public void eliminarPrestamo(String id) {
        prestamoRepositorio.deleteById(id);
    }

    @Transactional(readOnly = true)
    public Optional<Prestamo> listarId(String id) {
        return prestamoRepositorio.findById(id);
    }
    
    
    public void deshabilitar(String id) throws Exception {
        Optional<Prestamo> respuesta = prestamoRepositorio.findById(id);

        if (respuesta.isPresent()) {
            Prestamo prestamo = respuesta.get();

            prestamo.setAlta(false);

            prestamoRepositorio.save(prestamo);

        } else {
            throw new Exception("No se encontro el prestamo buscado");
        }

    }

     public void habilitar(String id) throws Exception {
        Optional<Prestamo> respuesta = prestamoRepositorio.findById(id);

        if (respuesta.isPresent()) {
            Prestamo prestamo = respuesta.get();

            prestamo.setAlta(true);

            prestamoRepositorio.save(prestamo);

        } else {
            throw new Exception("No se encontro el prestamo buscado");
        }

    }
    
    
}
