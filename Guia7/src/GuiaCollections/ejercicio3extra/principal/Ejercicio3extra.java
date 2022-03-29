package GuiaCollections.ejercicio3extra.principal;

import GuiaCollections.ejercicio3extra.entidades.Libro;
import GuiaCollections.ejercicio3extra.servicios.LibroServicio;
import java.util.Scanner;

public class Ejercicio3extra {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        LibroServicio ls = new LibroServicio();

        Libro libro = new Libro();
        String opc;
        do {

            libro = ls.crearLibro();
            ls.agregarLibro(libro);

            System.out.println("Desea crear otro libro? S/N");
            opc = leer.next();

        } while (opc.equalsIgnoreCase("s"));

        ls.prestamo(libro);
        ls.mostrarLibros();

    }

}
