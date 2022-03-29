package com.libreria.servicios;

import com.libreria.entidades.Autor;
import com.libreria.entidades.Editorial;
import com.libreria.entidades.Libro;
import com.libreria.repositorios.LibroRepositorio;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class LibroServicio {

    @Autowired
    private LibroRepositorio libroRepositorio;

    @Autowired
    private AutorServicio autorServicio;

    @Autowired
    private EditorialServicio editorialServicio;

    @Transactional(rollbackFor = {Exception.class})
    public Libro crear(String titulo, Integer anio, Integer ejemplares, Integer ejemplaresPrestados, Integer ejemplaresRestantes, boolean alta, String idAutor, String idEditorial) throws Exception {

        validarLibro(titulo, anio, ejemplares);

        Libro libro = new Libro();

        libro.setTitulo(titulo);
        libro.setAnio(anio);
        libro.setEjemplares(ejemplares);
        libro.setEjemplaresPrestados(ejemplaresPrestados);
        libro.setEjemplaresRestantes(ejemplaresRestantes);
        libro.setAlta(alta);

        Autor autor = autorServicio.buscarPorId(idAutor);
        libro.setAutor(autor);

        Editorial editorial = editorialServicio.buscarPorId(idEditorial);
        libro.setEditorial(editorial);
        libroRepositorio.save(libro);

        return libro;

    }

    @Transactional(rollbackFor = {Exception.class})
    public void modificar(String isbn, String titulo, Integer anio, Integer ejemplares, Integer ejemplaresPrestados, Integer ejemplaresRestantes, boolean alta, String idAutor, String idEditorial) throws Exception {

        validarLibro(titulo, anio, ejemplares);

        Optional<Libro> respuesta = libroRepositorio.findById(isbn);

        if (respuesta.isPresent()) {

            Libro libro = respuesta.get();

            libro.setTitulo(titulo);
            libro.setAnio(anio);
            libro.setEjemplares(ejemplares);
            libro.setEjemplaresPrestados(ejemplaresPrestados);
            libro.setEjemplaresRestantes(ejemplaresRestantes);
            libro.setAlta(alta);

            Autor autor = autorServicio.buscarPorId(idAutor);
            libro.setAutor(autor);

            Editorial editorial = editorialServicio.buscarPorId(idEditorial);
            libro.setEditorial(editorial);

            libroRepositorio.save(libro);

        } else {
            throw new Exception("mo se encontro el libro buscado");
        }
    }

    @Transactional(readOnly = true)
    public List<Libro> listarLibros() {

        return libroRepositorio.findAll();
    }

    @Transactional(readOnly = true)
    public Optional<Libro> listarId(String isbn) {
        return libroRepositorio.findById(isbn);
    }

    public void eliminarLibro(String isbn) {

        libroRepositorio.deleteById(isbn);
    }

    public void deshabilitar(String isbn) throws Exception {

        Optional<Libro> respuesta = libroRepositorio.findById(isbn);

        if (respuesta.isPresent()) {

            Libro libro = respuesta.get();
            libro.setAlta(false);

            libroRepositorio.save(libro);
        } else {
            throw new Exception("No se encontro el libro buscado");
        }
    }

    @Transactional(readOnly = true)
    public List<Libro> buscarPorAutor(String nombre) {
        return libroRepositorio.buscarPorAutor(nombre);
    }

    @Transactional(readOnly = true)
    public List<Libro> buscarPorEditorial(String nombre) {
        return libroRepositorio.buscarPorEditorial(nombre);
    }

    public Libro buscarPorId(String isbn) throws Exception {
        Optional<Libro> respuesta = libroRepositorio.findById(isbn);

        if (respuesta.isPresent()) {
            return respuesta.get();
        } else {
            throw new Exception("No se encontro el libro buscado");
        }

    }

    private void validarLibro(String titulo, Integer anio, Integer ejemplares) throws Exception {
        if (titulo == null || titulo.isEmpty()) {
            throw new Exception("El titulo no puede ser nulo");
        }

        if (anio == null) {
            throw new Exception("El año no puede ser nulo");
        }

        if (ejemplares < 0) {
            throw new Exception("Tenes que ingresar ejemplares");
        }

    }

}
