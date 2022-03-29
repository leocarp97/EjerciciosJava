package GuiaCollections.ejercicio2extra.servicios;

import GuiaCollections.ejercicio2extra.entidades.CantanteFamoso;
import java.util.ArrayList;
import java.util.Scanner;

public class CantanteFamosoServicio {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private ArrayList<CantanteFamoso> cantante;

    public CantanteFamosoServicio() {
        cantante = new ArrayList();
    }

    public CantanteFamoso crearCantante() {

        CantanteFamoso cantanteFamoso = new CantanteFamoso();
        System.out.println("Ingrese el nombre del cantante");
        String nombre = leer.next();

        cantanteFamoso.setNombre(nombre);
        System.out.println("Ingrese el disco con mas ventas");
        String discoConMasVentas = leer.next();
        cantanteFamoso.setDiscoConMasVentas(discoConMasVentas);

        return cantanteFamoso;
    }

    public void agregarCantante(CantanteFamoso cantanteFamoso) {

        cantante.add(cantanteFamoso);

    }

    public void mostrarCantante(CantanteFamoso cantanteFamoso) {

        for (CantanteFamoso aux : cantante) {
            System.out.println(aux);
        }

    }

    public void eliminarCantante(String n) {

        for (int i = 0; i < cantante.size(); i++) {

            CantanteFamoso c = cantante.get(i);
            if (c.getNombre().equalsIgnoreCase(n)) {

                cantante.remove(c);
            }
        }

    }
}
