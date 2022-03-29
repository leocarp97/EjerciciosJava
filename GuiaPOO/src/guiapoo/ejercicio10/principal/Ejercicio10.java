package guiapoo.ejercicio10.principal;

import java.util.Scanner;
import java.util.Arrays;

public class Ejercicio10 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        double[] vector = new double[50];
       

        for (int i = 0; i < 50; i++) {

            vector[i] = (double) (Math.random() * 80);
        }

        for (int i = 0; i < 50; i++) {
            System.out.println(vector[i]);
        }

        Arrays.sort(vector);

        double vector2[] = Arrays.copyOf(vector, 20);

        Arrays.fill(vector2, 10, 20, 0.5);

        System.out.println("Vector ordenado");
        for (int i = 0; i < 50; i++) {
            System.out.println(vector[i]);
        }

        System.out.println("Vector 2");
        for (int i = 0; i < 20; i++) {
            System.out.println(vector2[i]);
        }

    }

}
