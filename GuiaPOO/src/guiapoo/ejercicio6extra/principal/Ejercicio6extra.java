package guiapoo.ejercicio6extra.principal;

import guiapoo.ejercicio6extra.entidades.Ahorcado;
import guiapoo.ejercicio6extra.servicios.AhorcadoServicio;
import java.util.Scanner;

public class Ejercicio6extra {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        AhorcadoServicio as = new AhorcadoServicio();

        System.out.println("Ingrese una palabra");
        String palabra = leer.next();

        System.out.println("Ingrese la cantidad de jugadas maximas");
        int cantidadJugadas = leer.nextInt();

        Ahorcado ahorcado = as.crearJuego(palabra, cantidadJugadas);

        as.juego(palabra, ahorcado.getCantidadJugadas(), ahorcado.getLetrasEncontradas());

    }

}
