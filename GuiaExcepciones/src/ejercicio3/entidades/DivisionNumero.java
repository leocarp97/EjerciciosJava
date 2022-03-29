package ejercicio3.entidades;

import java.util.Scanner;

public class DivisionNumero {

    private int n1;
    private int n2;
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public DivisionNumero() {
    }

    public DivisionNumero(int n1, int n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    public int getN1() {
        return n1;
    }

    public void setN1(int n1) {
        this.n1 = n1;
    }

    public int getN2() {
        return n2;
    }

    public void setN2(int n2) {
        this.n2 = n2;
    }

    public void ingresarNumeros() {

        System.out.println("Ingrese un numero");
        n1 = leer.nextInt();

        System.out.println("Ingrese un numero");
        n2 = leer.nextInt();

        System.out.println("La division es : " + n1 / n2);
    }

    public void cadena() {

        System.out.println("Ingrese un numero");
        String n = leer.next();
        Integer.parseInt(n);

    }
}
