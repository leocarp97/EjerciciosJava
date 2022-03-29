package guiapoo.ejercicio4extra.servicios;

import guiapoo.ejercicio4extra.entidades.Nif;
import java.util.Scanner;

public class NifServicio {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Nif crearNif() {

        System.out.println("Ingrese su DNI");
        int dni = leer.nextInt();

        Nif nif = new Nif(dni, "");

        return nif;

    }

    public void mostrar(int dni) {

        String[] vector = new String[22];
        System.out.println("Llenar vector");
        for (int i = 0; i < 22; i++) {
            vector[i] = leer.next();

        }

        int n;
        n = dni % 23;

        for (int i = 0; i < 1; i++) {
            System.out.println(dni + "-" + vector[n].toUpperCase());
        }

    }

}
