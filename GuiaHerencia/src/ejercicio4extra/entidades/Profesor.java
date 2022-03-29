package ejercicio4extra.entidades;

import java.util.Scanner;

public class Profesor extends Persona {

    private String departamento;
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Profesor() {
    }

    public Profesor(String departamento, String nombre, String apellido, int id, String estadoCivil) {
        super(nombre, apellido, id, estadoCivil);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return super.toString() + "Profesor{" + "departamento=" + departamento + '}';
    }

    public void crearProfesor() {

        crearPersona();

        System.out.println("Ingrese el departamente al cual pertenece");
        departamento = leer.next();


    }

    public void cambiarDepartamento() {

        System.out.println("Ingrese el departamente al cual pertenece");
        departamento = leer.next();

    }

}
