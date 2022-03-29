package GuiaCollections.ejercicio4.servicios;

import GuiaCollections.ejercicio4.entidades.Pelicula;
import GuiaCollections.ejercicio4.utilidades.Comparadores;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class PeliculaServicio {

    private Scanner leer;
    private ArrayList<Pelicula> pelicula;

    public PeliculaServicio() {
        leer = new Scanner(System.in).useDelimiter("\n");
        pelicula = new ArrayList();
    }

    public Pelicula crearPelicula() {

        Pelicula peli = new Pelicula();

        System.out.println("Ingrese el titulo de la pelicula");
        String titulo = leer.next();
        peli.setTitulo(titulo);

        System.out.println("Ingrese el nombre del director");
        String director = leer.next();
        peli.setDirector(director);
        System.out.println("Ingrese la duracion de la pelicula en horas");
        int duracion = leer.nextInt();

        peli.setDuracion(duracion);

        return peli;

    }

    public void agregarPelicula(Pelicula peli) {

        pelicula.add(peli);

    }

    public void mostrarPeliculas(Pelicula peli) {

        for (Pelicula pelicula1 : pelicula) {
            System.out.println(pelicula1);
        }

    }

    public void mostrarPeliculasMayorDuracion(Pelicula peli) {

        for (Pelicula pelicula1 : pelicula) {
            if (pelicula1.getDuracion() > 1) {

                System.out.println(pelicula1);
            }
        }

    }

    public void peliculasMayorAMenor(Pelicula peli) {

        Collections.sort(pelicula, Comparadores.duracionMayorAMenor);

        for (Pelicula pelicula1 : pelicula) {
            System.out.println(pelicula1);
        }

    }

    public void peliculasMenorAMayor(Pelicula peli) {

        Collections.sort(pelicula, Comparadores.duracionMenorAMayor);

        for (Pelicula pelicula1 : pelicula) {
            System.out.println(pelicula1);
        }
    }

    public void peliculasOrdenadasPorTitulo(Pelicula peli) {

        Collections.sort(pelicula, Comparadores.ordenarTituloAlfabeticamente);

        for (Pelicula pelicula1 : pelicula) {
            System.out.println(pelicula1);
        }
    }

    public void peliculasOrdenasPorDirector(Pelicula peli) {

        Collections.sort(pelicula, Comparadores.ordenarDirectorAlfabeticamente);

        for (Pelicula pelicula1 : pelicula) {
            System.out.println(pelicula1);
        }

    }

}
