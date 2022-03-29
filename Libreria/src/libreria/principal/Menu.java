package libreria.principal;

import libreria.entidades.Autor;
import libreria.entidades.Editorial;
import libreria.entidades.Libro;
import libreria.servicios.AutorServicio;
import libreria.servicios.EditorialServicio;
import libreria.servicios.LibroServicio;

public class Menu {

    private final LibroServicio libroServicio = new LibroServicio();
    private final EditorialServicio editorialServicio = new EditorialServicio();
    private final AutorServicio autorServicio = new AutorServicio();

    public Menu() {
        //libroServicio.setServicios(editorialServicio, autorServicio);

    }

    public void ejecucion() throws Exception {

        String nombreEditorial = "Mundos";
        boolean alta = true;

        String nombreEditorial2 = "Universos";
        boolean alta2 = true;

        String nombreAutor = "Juan ";
        boolean altaAutor = true;

        String nombreAutor2 = "Fernando";
        boolean altaAutor2 = true;

        String titulo = "Asdds";
        Integer anio = 1997;
        Integer ejemplares = 250;
        Integer ejemplaresPrestados = 50;
        Integer ejemplaresRestantes = 200;
        boolean altaLibro = true;

        String titulo2 = "Asda";
        Integer anio2 = 2015;
        Integer ejemplares2 = 305;
        Integer ejemplaresPrestados2 = 105;
        Integer ejemplaresRestantes2 = 205;
        boolean altaLibro2 = true;

        Editorial e1 = editorialServicio.crear(nombreEditorial, alta);
        Editorial e2 = editorialServicio.crear(nombreEditorial2, alta2);

        Autor a1 = autorServicio.crear(nombreAutor, altaAutor);
        Autor a2 = autorServicio.crear(nombreAutor2, altaAutor2);
       
        try {
            Libro l1 = libroServicio.crear(titulo, anio, ejemplares, ejemplaresPrestados, ejemplaresRestantes, altaLibro, a1, e1);
            Libro l2 = libroServicio.crear(titulo2, anio2, ejemplares2, ejemplaresPrestados2, ejemplaresRestantes2, altaLibro2, a2, e2);
        } catch (Exception e) {
        }

    }

}
