package guiapoo.ejercicio8.principal;

import guiapoo.ejercicio8.entidades.Cadena;
import guiapoo.ejercicio8.servicios.CadenaServicio;
import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        CadenaServicio cs = new CadenaServicio();

        Cadena cadena = cs.crearCadena();

        System.out.println("Ingrese una frase");
        String fras = leer.next();

        cadena.setFrase(fras);

        int longitud = fras.length();

        int opc;

        do {
            System.out.println("MENU");

            System.out.println("1-Mostrar cantidad de vocales ");
            System.out.println("2-Invertir frase");
            System.out.println("3-Mostrar cantidad de veces que esta repetido un caracter  ");
            System.out.println("4-Comparar longitud");
            System.out.println("5-Unir frases");
            System.out.println("6-Reemplazar todas las ´a´");
            System.out.println("7-Mostrar si contiene caracter ingresado por el usuario");
            opc = leer.nextInt();
            switch (opc) {

                case 1:
                    cs.mostrarVocales(fras);
                    break;
                case 2:
                    cs.invertirFrase(fras);
                    break;
                case 3:
                    cs.vecesRepetido(fras);
                    break;
                case 4:
                    cs.compararLongitud(fras);
                    break;
                case 5:
                    cs.unirFrases(fras);
                    break;
                case 6:
                    cs.reemplazar(fras);
                    break;
                case 7:
                    cs.contiene(fras);
                    break;
            }

        } while (opc < 8);

    }

}
