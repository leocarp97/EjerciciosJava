package libreria.principal;

import libreria.servicios.AutorServicio;
import libreria.servicios.EditorialServicio;
import libreria.servicios.LibroServicio;

public class Ejercicio1 {

    public static void main(String[] args) {

        LibroServicio ls = new LibroServicio();
        AutorServicio as = new AutorServicio();
        EditorialServicio es = new EditorialServicio();

        Menu menu = new Menu();

        menu.ejecucion();

        ls.listarLibros().forEach((a) -> System.out.println(a.toString()));

        //System.out.println(as.buscarPorNombre("Juan Carlos"));
        //System.out.println(ls.buscarPorIsbn("355"));
        //System.out.println(ls.buscarPorTitulo("Asd"));
        //System.out.println(ls.buscarPorNombreAutor("Juan Fernando"));
        //System.out.println(ls.buscarPorNombreEditorial("Mundo"));
    }

}
