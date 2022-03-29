package GuiaCollections;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        ArrayList<String> razas = new ArrayList();
        int opc;

        do {

            System.out.println("Ingrese una raza");

            razas.add(leer.next());

            System.out.println("Si desea salir ingrese 1 , sino ingrese cualquier tecla");

            opc = leer.nextInt();

        } while (opc != 1);

        for (String aux : razas) {
            System.out.println(aux);
        }
    }

}
