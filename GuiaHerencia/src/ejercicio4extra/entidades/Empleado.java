package ejercicio4extra.entidades;

import java.util.Scanner;

public class Empleado extends Persona {

    private int añoIncorporacion;
    private int numeroDespacho;
    private Profesor profesor;
    private PersonalServicio personal;
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Empleado() {
    }

    public Empleado(int añoIncorporacion, int numeroDespacho, Profesor profesor, PersonalServicio personal, String nombre, String apellido, int id, String estadoCivil) {
        super(nombre, apellido, id, estadoCivil);
        this.añoIncorporacion = añoIncorporacion;
        this.numeroDespacho = numeroDespacho;
        this.profesor = profesor;
        this.personal = personal;
    }

    public int getAñoIncorporacion() {
        return añoIncorporacion;
    }

    public void setAñoIncorporacion(int añoIncorporacion) {
        this.añoIncorporacion = añoIncorporacion;
    }

    public int getNumeroDespacho() {
        return numeroDespacho;
    }

    public void setNumeroDespacho(int numeroDespacho) {
        this.numeroDespacho = numeroDespacho;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public PersonalServicio getPersonal() {
        return personal;
    }

    public void setPersonal(PersonalServicio personal) {
        this.personal = personal;
    }

    @Override
    public String toString() {
        return super.toString() + "Empleado{" + "a\u00f1oIncorporacion=" + añoIncorporacion + ", numeroDespacho=" + numeroDespacho + ", profesor=" + profesor + ", personal=" + personal + '}';
    }

    public void crearEmpleado() {

        

        System.out.println("Ingrese el año de incorporacion");
        añoIncorporacion = leer.nextInt();

        System.out.println("Ingrese el numero del despacho");
        numeroDespacho = leer.nextInt();

    

    }

    public void cambiarDespacho() {

        System.out.println("Ingrese el numero del despacho");
        numeroDespacho = leer.nextInt();

    }

}
