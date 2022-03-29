package GuiaCollections.ejercicio5.principal;

import GuiaCollections.ejercicio5.entidades.Pais;
import GuiaCollections.ejercicio5.servicios.PaisServicio;

import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        String opc;

        PaisServicio ps = new PaisServicio();

        Pais p = new Pais();
        do {

            p = ps.crearPais();
            ps.agregarPais(p);

            System.out.println("Desea salir ? S/N");
            opc = leer.next();
        } while (opc.equalsIgnoreCase("n"));

        ps.mostrarPais();

        System.out.println("Mostrar paises ordenados alfabeticamente");
        ps.ordenarAlfabeticamente();

        ps.eliminarPais();
    }

}
