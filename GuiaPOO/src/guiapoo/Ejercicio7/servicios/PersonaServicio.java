
package guiapoo.Ejercicio7.servicios;

import guiapoo.Ejercicio7.entidades.Persona;
import java.util.Scanner;


public class PersonaServicio {
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    
    
    
     public Persona crearPersona(){
        
        System.out.println("Ingrese su nombre"); 
      String  nombre=leer.next();
        
        System.out.println("Ingrese su edad");
       int edad=leer.nextInt();
        
        System.out.println("Ingrese su sexo");
       String sexo=leer.next();
        
        if (sexo.equalsIgnoreCase("h") || sexo.equalsIgnoreCase("m") || sexo.equalsIgnoreCase("o")) {
        
        }else{
            System.out.println("Sexo incorrecto");
        }
       
       
       System.out.println("Ingrese su peso");
       int peso=leer.nextInt();
        
        System.out.println("Ingrese su altura");
       int altura=leer.nextInt();
        
       
        Persona p1= new Persona(nombre, edad, sexo, peso, altura);
        return p1;
    }
        public int calcularIMC(int peso, int altura){
           altura=altura/100;
            peso=peso/(altura^2);
            
            if (peso<20) {
               
                return -1; 
            }
            if (peso>=20 && peso<=25) {
              
                return 0;
            }else{
               
                return 1;
                
            
        }
        
    }
    
 
        public boolean esMayorDeEdad(int edad){
           
            if(edad>=18) {
              
                return true;
            }else{
               
                return false;
 
            
        }
    
 
    
}
}