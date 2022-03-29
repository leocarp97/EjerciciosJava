package ejercicio2.entidades;

import java.util.Scanner;

public class Arreglo {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private int[] n;

    public Arreglo() {
        n = new int[5];
    }

    public int[] getN() {
        return n;
    }

    public void setN(int[] n) {
        this.n = n;
    }

    public void llenarArreglo() {

        for (int i = 0; i < 10; i++) {
            System.out.println("Ingrese un numero");
            n[i] = leer.nextInt();
        }

    }
}
