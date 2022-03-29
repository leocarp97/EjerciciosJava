package ejercicio4extra.entidades;

import java.util.Scanner;

public class PersonalServicio extends Persona {

    private String seccion;
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public PersonalServicio() {
    }

    public PersonalServicio(String seccion, String nombre, String apellido, int id, String estadoCivil) {
        super(nombre, apellido, id, estadoCivil);
        this.seccion = seccion;
    }

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    @Override
    public String toString() {
        return super.toString() + "PersonalServicio{" + "seccion=" + seccion + '}';
    }

    public void crearPersonalServicio() {

        crearPersona();

        System.out.println("Ingrese que seccion esta asignado");
        seccion = leer.next();


    }

    public void cambiarSeccion() {

        System.out.println("Ingrese que seccion esta asignado");
        seccion = leer.next();

    }
}
