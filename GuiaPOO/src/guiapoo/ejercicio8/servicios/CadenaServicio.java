package guiapoo.ejercicio8.servicios;

import guiapoo.ejercicio8.entidades.Cadena;
import java.util.Scanner;

public class CadenaServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Cadena crearCadena() {

        String frase = "";
        int longitud = 0;

        Cadena cadena = new Cadena(frase, longitud);

        return cadena;

    }

    public void mostrarVocales(String frase) {
        int cont = 0;

        for (int i = 0; i < frase.length(); i++) {
            if ((frase.charAt(i) == 'a') || (frase.charAt(i) == 'e') || (frase.charAt(i) == 'i') || (frase.charAt(i) == 'o') || (frase.charAt(i) == 'u')) {
                cont = cont + 1;
            }
        }

        System.out.println("La cantidad de vocales es :" + cont);

    }

    public void invertirFrase(String frase) {
        String fraseInvertida = "";
        for (int i = frase.length() - 1; i >= 0; i--) {

            fraseInvertida = fraseInvertida + frase.charAt(i);

        }
        System.out.println("La frase invertida es " + fraseInvertida);

    }

    public void vecesRepetido(String frase) {
        int cont = 0;
        System.out.println("Ingrese una letra");
        String letra = leer.next();

        for (int i = 0; i < frase.length(); i++) {

            if (frase.substring(i, i+1).equalsIgnoreCase(letra)) {

                cont = cont + 1;

            }

        }
        System.out.println("Cantidad de veces que esta repetido un caracter : " + cont);
    }

    public void compararLongitud(String frase) {
        int n;
        System.out.println("Ingrese una frase");
        String frase1 = leer.next();

        n = frase.compareToIgnoreCase(frase1);

        if (n < 0) {
            System.out.println("La primer cadena es menor");
        }
        if (n == 0) {
            System.out.println("Las cadenas tienen el mismo tamaño");
        } else {
            System.out.println("La primer cadena es mayor");
        }

    }

    public void unirFrases(String frase) {

        System.out.println("Ingrese una frase");
        String frase1 = leer.next();

        System.out.println(frase.concat(frase1));

    }

    public void reemplazar(String frase) {

        System.out.println("Ingrese un caracter");
        String caracter = leer.next();

        System.out.println(frase.replaceAll("a", caracter));

    }

    public void contiene(String frase) {
        System.out.println("Ingrese un caracter");
        String caracter = leer.next();

        System.out.println(frase.contains(caracter));

    }

}
