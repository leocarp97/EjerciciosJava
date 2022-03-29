
package ejercicio1.principal;

import java.util.Scanner;
import ejercicio1.relaciones.entidades.Perro;
import ejercicio1.relaciones.entidades.Persona;


public class Ejercicio1 {

   
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
          Perro perro1 = new Perro("Chiquito", "Caniche", 5, "Chiquito");
        Perro perro2 = new Perro("Fer", "Beagle", 4, "Grande");
        
        Persona persona1= new Persona("Juan", " Pepe ",18 ,402323, perro1);
        Persona persona2= new Persona("Pepito"," Pepe ", 30, 406656, perro2);
        String n=leer.next();
        if (perro2.getNombre().equalsIgnoreCase(n)) {
            System.out.println("El perro esta adoptado");
        }else{
            
            perro2.setNombre(n);
        }
        System.out.println(persona1);
        System.out.println(persona2);
        
    }
    
}
