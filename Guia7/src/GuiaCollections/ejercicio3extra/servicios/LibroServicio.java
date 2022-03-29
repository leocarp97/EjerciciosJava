package GuiaCollections.ejercicio3extra.servicios;

import GuiaCollections.ejercicio3extra.entidades.Libro;
import java.util.HashSet;
import java.util.Scanner;

public class LibroServicio {

    private Scanner leer;
    private HashSet<Libro> libreria;

    public LibroServicio() {
        leer = new Scanner(System.in).useDelimiter("\n");
        libreria = new HashSet();
    }

    public Libro crearLibro() {

        System.out.println("Ingrese el titulo del libro");
        String titulo = leer.next();

        System.out.println("Ingrese el nombre del autor");
        String autor = leer.next();

        System.out.println("Ingrese el numero de ejemplares");
        int ejemplares = leer.nextInt();

        System.out.println("Ingrese el numero de ejemplares prestados");
        int ejemplaresPrestados = leer.nextInt();

        Libro libro = new Libro(titulo, autor, ejemplares, ejemplaresPrestados);

        return libro;

    }

    public void agregarLibro(Libro libro) {

        libreria.add(libro);

    }

    public void mostrarLibros() {

        for (Libro libro1 : libreria) {
            System.out.println(libro1);
        }
    }

    public boolean prestamo(Libro libro) {

        System.out.println("Ingrese el titulo del libro a prestar");
        String n = leer.next();

        for (Libro libro1 : libreria) {
            if (libro1.getTitulo().equalsIgnoreCase(n)) {
                if (libro.getEjemplares() > 0) {
                    int a = libro.getEjemplaresPrestados();
                    a++;
                    libro.setEjemplaresPrestados(a);
              
                    return true;
                   
                } else {

                    return false;
                }

            }
        }
return false;
    }

}
