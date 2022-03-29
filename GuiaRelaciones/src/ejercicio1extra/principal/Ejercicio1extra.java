package ejercicio1extra.principal;

import ejercicio1extra.relaciones.entidades.Perro;
import ejercicio1extra.relaciones.entidades.Persona;


import java.util.Scanner;

public class Ejercicio1extra {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        String opc;
        Persona persona = new Persona();
        Perro perro = new Perro();
     
        do {

            persona.crearPersona();

            perro.crearPerro();
            
            persona.setPerro(perro);
           
           persona.agregarPersona(persona);
  
            System.out.println("Desea crear otra persona? S/N");
            opc = leer.next();
        } while (opc.equalsIgnoreCase("s"));

       persona.mostrar();
            
        }

    }


