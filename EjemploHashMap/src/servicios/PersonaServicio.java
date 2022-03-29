package servicios;

import entidades.Persona;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class PersonaServicio {

    //Entre <> Primer termino, digo que tipo de dato es la llave, segundo termino tipo de dato que es el OBJETO a guardar
    private HashMap<Integer, Persona> nuevoMapa; // Creo EL MAPA
    private Scanner leer; // Creo el Scanner para utilizar en toda mi clase

    //Esta es una muy buena practica
    public PersonaServicio() {
        this.nuevoMapa = new HashMap<>(); // Creo el espacio en memoria del MAPA
        this.leer = new Scanner(System.in).useDelimiter("\n");// Cuando se invoca la clase, habilita el flujo de datos
    }

    //Metodo para que el usuario carague los DATOS de forma manual
    public Persona cargarPersona() {
        System.out.println("Ingrese el nombre");
        String nombre = leer.next().toUpperCase();

        System.out.println("Ingrese el apellido");
        String apellido = leer.next().toUpperCase();

        System.out.println("Ingrese el DNI");
        Integer dni = leer.nextInt();

        return new Persona(dni, nombre, apellido);
    }

    public void agregarPersona(Persona p) {
        // En este modo agrego elementos a un mapa. Observar que el primer termino se corresponde a la KEY
        nuevoMapa.put(p.getDni(), p);
    }

    public void imprimirTodos() {
        // entry.getKey trae la llave y entry.getValue trae los valores del mapa, Es decir todos sus atributos
        for (Map.Entry<Integer, Persona> entry : nuevoMapa.entrySet()) {
            System.out.println("Documento=" + entry.getKey() + ", Datos de la Persona" + entry.getValue());
        }
    }

    public void buscarElimar(Integer dni) {
        nuevoMapa.remove(dni);
    }

}
