package ejercicio2.principal;

import ejercicio2.entidades.Electrodomestico;
import ejercicio2.entidades.Lavadora;
import ejercicio2.entidades.Televisor;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        Lavadora lava = new Lavadora();
        Televisor tele = new Televisor();

        lava.crearLavadora();
        lava.precioFinal();
        System.out.println(lava);
        tele.crearTelevisor();
        tele.precioFinal();

        List<Electrodomestico> electrodomestico = new ArrayList();

        lava.crearLavadora();
        electrodomestico.add(lava);
        lava.crearLavadora();
        electrodomestico.add(lava);
        tele.crearTelevisor();
        electrodomestico.add(tele);
        tele.crearTelevisor();
        electrodomestico.add(tele);
        int total = 0;
        int t = 0;
        for (Electrodomestico aux : electrodomestico) {

            if (aux instanceof Lavadora) {
                Lavadora object = (Lavadora) aux;

                object.precioFinal();

                total = total + object.getPrecio();

                continue;
            }

            if (aux instanceof Televisor) {
                Televisor object = (Televisor) aux;

                object.precioFinal();

                t = t + object.getPrecio();

            }

        }
        System.out.println("El precio total de las lavadoras es: " + total);
        System.out.println("El precio total de los televisores es: " + t);
        System.out.println("El precio total de los electrodomesticos es: " + (total+t));
    }

}
