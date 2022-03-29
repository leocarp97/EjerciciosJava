/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3.servicios;

import ejercicio3.entidades.Alumno;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class AlumnoServicio {
    
    private Scanner leer;
    private ArrayList<Alumno> alumnos;

    public AlumnoServicio() {
        leer = new Scanner(System.in).useDelimiter("\n");
        alumnos = new ArrayList();
    }    
    
    //Forma de crear un alumno con el constructor vacío
    public Alumno crearAlumno() {
        
        Alumno a = new Alumno();
        
        
        System.out.println("Ingrese el nombre del Alumno");
        String nombre = leer.next();
        
        a.setNombre(nombre);
        
        for (int i = 0; i < 3; i++) {
            System.out.println("Ingrese la nota " + (i + 1));
            int nota = leer.nextInt();
            a.getNotas().add(nota);
        }
        
        return a;
    }
    
    //Forma de crear un alumno con el constructor lleno
    //    public Alumno crearAlumno() {
    //        
    //        //ArrayList<Integer> notas = new ArrayList();
    //        
    //        
    //        System.out.println("Ingrese el nombre del Alumno");
    //        String nombre = leer.next();
    //        
    //        
    //        for (int i = 0; i < 3; i++) {
    //            System.out.println("Ingrese la nota " + (i + 1));
    //            int nota = leer.nextInt();
    //            notas.add(nota);
    //        }
    //        
    //        return new Alumno(nombre, notas); //Uso el constructor lleno
    //    }
    
    public void agregarAlumno(Alumno a) {
        alumnos.add(a);
    }    
    
    public float notaFinal(String nombre) {
        
        int suma = 0;
        int cantidad = 1;
  
        for (Alumno a : alumnos) {
            if (a.getNombre().equals(nombre)) {
                cantidad = a.getNotas().size();
                for (Integer nota : a.getNotas()) {
                    suma += nota;
                }
            } 
        }
        
        return suma / cantidad;
    }
    
}
