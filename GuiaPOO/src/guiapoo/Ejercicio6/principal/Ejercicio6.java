package guiapoo.Ejercicio6.principal;

import guiapoo.Ejercicio6.entidades.Cafetera;
import guiapoo.Ejercicio6.servicios.CafeteraServicio;
import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        CafeteraServicio cs = new CafeteraServicio();

        Cafetera cafetera = cs.crearCafetera();

        int opc;

        do {
            System.out.println("MENU");
            System.out.println("1- Llenar cafetera");
            System.out.println("2-Servir una taza ");
            System.out.println("3-Vaciar cafetera");
            System.out.println("4-Agregar cafe");

            opc = leer.nextInt();
            switch (opc) {
                case 1:
                    System.out.println(cs.llenarCafetera(cafetera.getCapacidadMaxima(), cafetera.getCantidadActual()));

                    break;
                case 2:
                    System.out.println("Servir una taza ");
                    cs.servirTaza();
                    break;
                case 3:
                    System.out.println("Vaciar cafetera :" + cs.vaciarCafetera(cafetera.getCantidadActual()));
                    ;
                    break;
                case 4:
                    System.out.println("La capacidad actual es :" + cs.agregarCafe(cafetera.getCantidadActual()));

                    break;

            }

        } while (opc < 5);

    }

}
