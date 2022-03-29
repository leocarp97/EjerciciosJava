package ejercicio4.principal;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int cont = 0;
        try {
            int n = (int) (Math.random() * 500) + 1;
            int n1;
            do {
                System.out.println("Ingrese un numero");
                n1 = leer.nextInt();
                cont++;
                if (n == n1) {
                    System.out.println("Adivino el numero");
                } else if (n > n1) {
                    System.out.println("Debe ingresar un numero mayor");
                } else {
                    System.out.println("Debe ingresar un numero menor");
                }

            } while (n != n1);

        } catch (Exception e) {
            System.out.println(e.getMessage());
            cont++;
        }
        System.out.println("La cantidad de intentos fue: " + cont);
    }

}
