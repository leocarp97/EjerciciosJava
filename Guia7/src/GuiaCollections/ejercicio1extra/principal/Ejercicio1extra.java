package GuiaCollections.ejercicio1extra.principal;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio1extra {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        ArrayList<Integer> numeros = new ArrayList();

        int n;
        int sumatoria = 0;
        int cont = 0;
        do {

            System.out.println("Ingrese un numero");

            numeros.add(n = leer.nextInt());
            if (n == -99) {
                cont = cont - 1;
                sumatoria = sumatoria - n;

            }
            cont++;
            sumatoria = sumatoria + n;

        } while (n != -99);

        for (Integer aux : numeros) {
            System.out.println(aux);
        }

        System.out.println("La suma de los numeros ingresados es: " + sumatoria);
        System.out.println("El promedio de los numeros ingresados es: " + sumatoria / cont);

    }

}
