package ejercicio4extra.entidades;

import java.util.Scanner;

public class Persona {

    protected String nombre;
    protected String apellido;
    protected int id;
    protected String estadoCivil;
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Persona() {
    }

    public Persona(String nombre, String apellido, int id, String estadoCivil) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.id = id;
        this.estadoCivil = estadoCivil;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", id=" + id + ", estadoCivil=" + estadoCivil + '}';
    }

    public void crearPersona() {

        System.out.println("Ingrese su nombre");
        nombre = leer.next();
        System.out.println("Ingrese su apellido");
        apellido = leer.next();

        System.out.println("Ingrese su numero de identificacion");
        id = leer.nextInt();

        System.out.println("Ingreses su estado civil");
        estadoCivil = leer.next();

      

    }

    public void cambiarEstadoCivil() {

        System.out.println("Ingreses su estado civil");
        estadoCivil = leer.next();
    }

}
