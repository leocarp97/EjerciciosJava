
package guiapoo.ejercicio2extra.servicios;

import guiapoo.ejercicio2extra.entidades.Punto;
import java.util.Scanner;


public class PuntoServicio {
    
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    
    
   public Punto crearPunto(){
       
       System.out.println("Ingrese un valor para x1");  
       int x1=leer.nextInt();
       
       System.out.println("Ingrese un valor para y1");
       int y1=leer.nextInt();
       
       System.out.println("Ingrese un valor para x2");
       int x2=leer.nextInt();
       
       System.out.println("Ingrese un valor para y2");
       int y2=leer.nextInt();
   
   
      Punto punto=new Punto(x1, y1, x2, y2); 
       
           return punto;   
   } 
   
    
   
   public void calcularDistancia(int x1,int y1,int x2,int y2){
       
       double resultado;
       
       resultado=(x2-x1)^2+(y2-y1)^2;
       
       
       System.out.println("La distancia es: "+Math.sqrt(resultado));
       
   }
   
   
   
   
   
    
}
