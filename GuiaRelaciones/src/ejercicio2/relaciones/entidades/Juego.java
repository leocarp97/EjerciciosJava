package ejercicio2.relaciones.entidades;

import java.util.ArrayList;
import java.util.Scanner;

public class Juego {

    private ArrayList<Jugador> jugadores;
    private Revolver r;
    private Scanner leer;

    public Juego(ArrayList<Jugador> jugadores, Revolver r, Scanner leer) {
        this.jugadores = jugadores;
        this.r = r;
        this.leer = leer;
    }

    public Juego() {
        jugadores = new ArrayList();
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public Revolver getR() {
        return r;
    }

    public void setR(Revolver r) {
        this.r = r;
    }

    public Scanner getLeer() {
        return leer;
    }

    public void setLeer(Scanner leer) {
        this.leer = leer;
    }

    public void llenarJuego(int n1) {

        if (n1 > 6 || n1 < 1) {
            n1 = 6;
        }

        int id = 1;
        for (int i = 0; i < n1; i++) {

            Jugador juga = new Jugador(id, "Jugador " + id, false);

            jugadores.add(juga);
            id++;
        }

    }

    public void ronda(Revolver r) {

        r.llenarRevolver();
        do {

            for (Jugador aux : jugadores) {

                System.out.println(aux.getNombre());
                System.out.println(r);
                if (r.mojar() == true) {

                    aux.setMojado(true);

                    System.out.println("El participante: "+aux.getNombre() + " se mojo");
                    System.out.println("GAME OVER");
                    break;
                } else {

                    r.siguienteChorro();

                }
            }
        } while (r.mojar() != true);
    }

}
