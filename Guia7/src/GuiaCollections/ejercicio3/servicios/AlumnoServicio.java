package GuiaCollections.ejercicio3.servicios;

import GuiaCollections.ejercicio3.entidades.Alumno;
import java.util.ArrayList;
import java.util.Scanner;

public class AlumnoServicio {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    private ArrayList<Alumno> alumnos;

    public AlumnoServicio() {
        alumnos = new ArrayList();
    }

    public Alumno crearAlumno() {

        Alumno a = new Alumno();
        System.out.println("Ingrese su nombre");
        String nombre = leer.next();

        a.setNombre(nombre);

        for (int i = 0; i < 3; i++) {
            System.out.println("Ingrese su nota");
            int nota = leer.nextInt();
            a.getNotas().add(nota);

        }

        return a;

    }

    public void agregarAlumno(Alumno a) {

        alumnos.add(a);

    }

    public void notaFinal(String n) {
        double promedio = 0;
       

        for (Alumno a : alumnos) {
            if (a.getNombre().equalsIgnoreCase(n)) {

                for (Integer notas : a.getNotas()) {

                    promedio = promedio + notas;
                   
                }

            }

        }

        System.out.println("El promedio es : " + (promedio / 3));
    }

}
