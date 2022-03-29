package ejercicio2.principal;

import ejercicio2.relaciones.entidades.Juego;
import ejercicio2.relaciones.entidades.Jugador;
import ejercicio2.relaciones.entidades.Revolver;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        Juego juego = new Juego();
        Revolver r = new Revolver();
        Jugador jugado = new Jugador();

        System.out.println("Ingrese la cantidad de jugadores");
        int n1 = leer.nextInt();

        juego.llenarJuego(n1);
        juego.ronda(r);

    }

}
