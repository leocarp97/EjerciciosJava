package guiapoo.ejercicio3extra.servicios;

import guiapoo.ejercicio3extra.entidades.Raiz;
import java.util.Scanner;

public class RaizServicio {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Raiz crearRaiz() {

        System.out.println("Ingrese un valor");
        int a = leer.nextInt();

        System.out.println("Ingrese un valor");
        int b = leer.nextInt();

        System.out.println("Ingrese un valor");
        int c = leer.nextInt();

        Raiz raiz = new Raiz(a, b, c);

        return raiz;

    }

    public double getDiscriminante(int a, int b, int c) {

        double resultado = Math.pow(b, 2) - 4 * a * c;
        return resultado;

    }

    public void tieneRaices(double resultado) {
        boolean raices = true;

        if (resultado >= 0) {
            System.out.println(raices = true);
        } else {
            System.out.println(raices = false);
        }
    }

    public void tieneRaiz(double resultado) {
        boolean raices = true;

        if (resultado == 0) {
            System.out.println(raices = true);
        } else {

            System.out.println(raices = false);
        }
    }

    public void obtenerRaices(double resultado, int a, int b, int c) {
        boolean raices = true;

        tieneRaices(resultado);

        if (raices) {
            System.out.println(-b + Math.sqrt(Math.pow(b, 2) - (4 * a * c)) / (2 * a));
            System.out.println(-b - Math.sqrt(Math.pow(b, 2) - (4 * a * c)) / (2 * a));
        }

    }

    public void obtenerRaiz(double resultado, int a, int b, int c) {
        boolean raices = true;
        tieneRaiz(resultado);

        if (raices) {
            System.out.println(-b + Math.sqrt(Math.pow(b, 2) - (4 * a * c)) / (2 * a));

        }
    }

    public void calcular(double resultado, int a, int b, int c) {

        
        
        
    }

}
