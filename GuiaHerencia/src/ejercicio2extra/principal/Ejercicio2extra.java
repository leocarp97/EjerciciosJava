package ejercicio2extra.principal;

import ejercicio2extra.entidades.Edificio;
import ejercicio2extra.entidades.EdificioDeOficinas;
import ejercicio2extra.entidades.Polideportivo;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio2extra {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Polideportivo p = new Polideportivo();
        Polideportivo p1 = new Polideportivo();
        EdificioDeOficinas e = new EdificioDeOficinas();
        EdificioDeOficinas e1 = new EdificioDeOficinas();
        List<Edificio> edificio = new ArrayList();

        p.crearPolideportivo();
        edificio.add(p);
        p1.crearPolideportivo();
        edificio.add(p1);
        e1.crearEdificioDeOficinas();
        edificio.add(e);
        e.crearEdificioDeOficinas();
        edificio.add(e1);
        int cont = 0;
        for (Edificio aux : edificio) {
            if (aux instanceof Polideportivo) {
                Polideportivo object = (Polideportivo) aux;
                object.crearEdificio();
                object.calcularSuperficie(object.getAncho(), object.getAlto(), object.getLargo());
                object.calcularVolumen(object.getAncho(), object.getAlto(), object.getLargo());
                if (object.getInstalacion().equalsIgnoreCase("Techado")) {
                    cont++;
                }
                System.out.println(object);

            }

            if (aux instanceof EdificioDeOficinas) {
                EdificioDeOficinas object = (EdificioDeOficinas) aux;
                object.crearEdificio();
                object.calcularSuperficie(object.getAncho(), object.getAlto(), object.getLargo());
                object.calcularVolumen(object.getAncho(), object.getAlto(), object.getLargo());
                object.cantPersonas();
                System.out.println(object);

            }

        }

        System.out.println("La cantidad de polideportivos techados son: " + cont);
        System.out.println("La cantidad de polideportivos abiertos son: " + (2 - cont));

    }

}
