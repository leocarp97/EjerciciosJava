package ejercicio4extra.entidades;

import java.util.Scanner;

public class Estudiante extends Persona {

    private String cursoMatriculado;
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Estudiante() {
    }

    public Estudiante(String cursoMatriculado, String nombre, String apellido, int id, String estadoCivil) {
        super(nombre, apellido, id, estadoCivil);
        this.cursoMatriculado = cursoMatriculado;
    }

    public String getCursoMatriculado() {
        return cursoMatriculado;
    }

    public void setCursoMatriculado(String cursoMatriculado) {
        this.cursoMatriculado = cursoMatriculado;
    }

    @Override
    public String toString() {
        return super.toString() + "Estudiante{" + "cursoMatriculado=" + cursoMatriculado + '}';
    }

    public void crearEstudiante() {

        crearPersona();

        System.out.println("Ingrese el curso en el cual esta matriculado");
        cursoMatriculado = leer.next();


    }

    public void cambiarMatricula() {

        System.out.println("Ingrese el curso en el cual esta matriculado");
        cursoMatriculado = leer.next();

    }

}
