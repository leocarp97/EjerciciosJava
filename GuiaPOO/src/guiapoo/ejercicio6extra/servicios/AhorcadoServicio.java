package guiapoo.ejercicio6extra.servicios;

import guiapoo.ejercicio6extra.entidades.Ahorcado;
import java.util.Scanner;

public class AhorcadoServicio {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Ahorcado crearJuego(String palabra, int cantidadJugadas) {

        int n = palabra.length();
        String[] vectorPalabra = new String[n];
        for (int i = 0; i < n; i++) {
            vectorPalabra[i] = palabra.substring(i, i + 1);

        }

        int letrasEncontradas = 0;

        Ahorcado ahorcado = new Ahorcado(vectorPalabra, letrasEncontradas, cantidadJugadas);

        return ahorcado;

    }

    public void longitud(String palabra) {

        System.out.println("La longitud de la palabra a buscar es: " + palabra.length());

    }

    public void buscar(String palabra) {
        int cont = 0;
        System.out.println("Ingrese una letra");
        String letra = leer.next();

        for (int i = 0; i < palabra.length(); i++) {

            if (palabra.equalsIgnoreCase(palabra.substring(i, i + 1)) == palabra.equalsIgnoreCase(letra)) {

                cont++;

            } else {

            }

        }
        if (cont > 0) {
            System.out.println("Se encontro una letra");
        } else {
            System.out.println("No se encontro una letra");
        }
    }

    public void encontradas(String palabra, int cantidadJugadas) {
        int letrasEncontradas = 0;
        do {

            System.out.println("Ingrese una letra");
            String letra = leer.next();

            for (int i = 0; i < palabra.length(); i++) {

                if (palabra.substring(i, i + 1).equalsIgnoreCase(letra)) {

                    letrasEncontradas++;

                }
            }

            if (letrasEncontradas > 0) {
                System.out.println("La letra pertenece a la palabra");
                System.out.println("Numero de letras(encontradas, faltantes) : " + "(" + letrasEncontradas + "," + (palabra.length() - letrasEncontradas) + ")");

                System.out.println("Numero de oportunidades restantes: " + cantidadJugadas);

            } else {
                System.out.println("La letra no pertenece a la palabra");
                cantidadJugadas = cantidadJugadas - 1;
                System.out.println("Numero de oportunidades restantes: " + cantidadJugadas);
            }

        } while (cantidadJugadas != 0 || letrasEncontradas != palabra.length());
    }

    public void intentos(int cantidadJugadas) {

        System.out.println("Le quedan : " + cantidadJugadas + " intentos");
    }

    public void juego(String palabra, int cantidadJugadas, int letrasEncontradas) {

        longitud(palabra);
        buscar(palabra);
        encontradas(palabra, cantidadJugadas);
        

    }

}
