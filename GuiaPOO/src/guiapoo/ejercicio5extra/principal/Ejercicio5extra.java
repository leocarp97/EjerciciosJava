package guiapoo.ejercicio5extra.principal;

import guiapoo.ejercicio5extra.entidades.Mes;
import java.util.Scanner;

public class Ejercicio5extra {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        Mes m = new Mes();

        String mes[] = new String[12];

        m.crearMes();
        m.mesSecreto(mes);

    }

}
