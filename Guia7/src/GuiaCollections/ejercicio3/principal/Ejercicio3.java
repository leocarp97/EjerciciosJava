package GuiaCollections.ejercicio3.principal;

import GuiaCollections.ejercicio3.entidades.Alumno;
import GuiaCollections.ejercicio3.servicios.AlumnoServicio;


import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        String opc;
        AlumnoServicio as = new AlumnoServicio();

        do {

            Alumno alumno = as.crearAlumno();
            as.agregarAlumno(alumno);

            System.out.println("Desea crear otro alumno? S/N");
            opc = leer.next();
        } while (opc.equalsIgnoreCase("s"));

        System.out.println("Ingrese el nombre del alumno a buscar");
        String n = leer.next();
     
      as.notaFinal(n);
        
    }
}
