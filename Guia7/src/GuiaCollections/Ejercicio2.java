package GuiaCollections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        ArrayList<String> razas = new ArrayList();
        String opc;

        do {

            System.out.println("Ingrese una raza");

            razas.add(leer.next());

            System.out.println("Desea salir ?  S/N");

            opc = leer.next();

        } while (opc.equalsIgnoreCase("n"));

        for (String aux : razas) {
            System.out.println(aux);
        }

        Iterator<String> it = razas.iterator();
        int cont = 0;

        System.out.println("Ingrese una raza");
        String m = leer.next();

        while (it.hasNext()) {
            String aux = it.next();

            if (aux.equalsIgnoreCase(m)) {
                it.remove();
                cont++;
            }

        }

        if (cont > 0) {
            for (String aux : razas) {
                System.out.println("Lista actualizada");
                System.out.println(aux);
            }
        } else {
            System.out.println("La raza ingresada no esta en la lista ");
            for (String aux : razas) {
                System.out.println(aux);
            }
        }

    }

}
