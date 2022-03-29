package GuiaCollections.ejercicio2extra.principal;

import GuiaCollections.ejercicio2extra.entidades.CantanteFamoso;
import GuiaCollections.ejercicio2extra.servicios.CantanteFamosoServicio;
import java.util.Scanner;

public class Ejercicio2extra {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        int cont = 0;

        CantanteFamosoServicio cantante1 = new CantanteFamosoServicio();

        CantanteFamoso cantanteFamoso = new CantanteFamoso();

        do {

            CantanteFamoso cf = cantante1.crearCantante();
            cantante1.agregarCantante(cf);

            cont++;

        } while (cont < 5);

        cantante1.mostrarCantante(cantanteFamoso);

        int opc;

        do {
            System.out.println("MENU");
            System.out.println("1-Agregar un cantante");
            System.out.println("2-Mostrar todos los cantantes");
            System.out.println("3-Eliminar un cantante");
            System.out.println("4-Salir ");
            System.out.println("Elija una opcion");
            opc = leer.nextInt();
            switch (opc) {

                case 1:
                    CantanteFamoso cf = cantante1.crearCantante();
                    cantante1.agregarCantante(cf);

                    break;
                case 2:

                    cantante1.mostrarCantante(cantanteFamoso);
                    break;

                case 3:
                    System.out.println("Ingrese el nombre a eliminar");
                    String n = leer.next();
                    cantante1.eliminarCantante(n);
                    break;

            }

        } while (opc < 4);

    }

}
