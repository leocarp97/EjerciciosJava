package guiapoo.ejercicio12.principal;

import guiapoo.ejercicio12.entidades.Persona;
import guiapoo.ejercicio12.servicios.PersonaServicio;
import java.util.Date;
import java.util.Scanner;

public class Ejercicio12 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        PersonaServicio ps = new PersonaServicio();

        Date fechaNacimiento = new Date();

        Persona persona = ps.crearPersona("", fechaNacimiento);
        System.out.println(persona);
        int opc;
        do {

            System.out.println("MENU");
            System.out.println("1-Calcular edad");
            System.out.println("2-Es menor que");
            System.out.println("3-Mostrar persona");

            opc = leer.nextInt();

            switch (opc) {

                case 1:
                    ps.calcularEdad(fechaNacimiento);
                    break;

                case 2:
                    ps.menorQue(fechaNacimiento, fechaNacimiento);
                    break;
                case 3:
                    ps.mostrarPersona(persona.getNombre(), fechaNacimiento);
                    break;
            }

        } while (opc < 4);

    }
}