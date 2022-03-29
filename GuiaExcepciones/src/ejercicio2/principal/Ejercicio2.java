package ejercicio2.principal;

import ejercicio2.entidades.Arreglo;
import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        Arreglo a = new Arreglo();
        // a.llenarArreglo();

        try {
            a.llenarArreglo();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

}
