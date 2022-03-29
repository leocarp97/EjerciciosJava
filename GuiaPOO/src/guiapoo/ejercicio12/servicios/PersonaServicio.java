package guiapoo.ejercicio12.servicios;

import guiapoo.ejercicio12.entidades.Persona;
import java.util.Date;
import java.util.Scanner;

public class PersonaServicio {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Persona crearPersona(String nombre, Date fechaDeNacimiento) {

        System.out.println("Ingrese su nombre");
        nombre = leer.next();

        System.out.println("Ingrese el dia");
        int dia = leer.nextInt();

        System.out.println("Ingrese el mes");
        int mes = leer.nextInt();

        System.out.println("Ingrese el año");
        int anio = leer.nextInt();

        fechaDeNacimiento.setDate(dia); 
        fechaDeNacimiento.setMonth(mes);
        fechaDeNacimiento.setYear(anio - 1900);

        fechaDeNacimiento = new Date(anio, mes, dia);

        Persona persona = new Persona(nombre, fechaDeNacimiento);

        return persona;
    }

    public void calcularEdad(Date fechaDeNacimiento) {

        Date fechaActual = new Date();

        System.out.println("Su edad es : " + (fechaActual.getYear() - fechaDeNacimiento.getYear()));

    }

    public void menorQue(Date fechaDeNacimiento, Date n) {

        System.out.println("Ingrese el dia");
        int dia = leer.nextInt();

        System.out.println("Ingrese el mes");
        int mes = leer.nextInt();

        System.out.println("Ingrese el año");
        int anio = leer.nextInt();

        n.setDate(dia); 
        n.setMonth(mes); 
        n.setYear(anio - 1900);

        n = new Date(anio, mes, dia);

        System.out.println(fechaDeNacimiento.after(n));
    }

    public void mostrarPersona(String nombre, Date fechaDeNacimiento) {

        System.out.println(nombre);
        System.out.println(fechaDeNacimiento.toString());
    }

}
