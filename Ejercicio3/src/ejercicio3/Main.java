/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

import ejercicio3.entidades.Alumno;
import ejercicio3.servicios.AlumnoServicio;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        AlumnoServicio alumnoServicio = new AlumnoServicio();

        String respuesta = "";

        do {

            Alumno alumno = alumnoServicio.crearAlumno();
            alumnoServicio.agregarAlumno(alumno);

            System.out.println("Desea agregar otro alumno?");
            respuesta = leer.next();

        } while (respuesta.toUpperCase().equals("S"));

        System.out.println("Ingrese el nombre del alumno al que quiera calcular du promedio");
        String nombre = leer.next();

        float notaFinal = alumnoServicio.notaFinal(nombre);

        if (notaFinal == 0) {
            System.out.println("No se encontró ningún alumno");
        } else {
            System.out.println("La nota final de " + nombre + " es: " + notaFinal);
        }
    }

}
