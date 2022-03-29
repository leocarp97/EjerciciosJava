
package guiapoo.ejercicio9.servicios;

import guiapoo.ejercicio9.entidades.Matematica;
import java.util.Scanner;


public class MatematicaServicio {
   private Scanner leer = new Scanner(System.in).useDelimiter("\n");
   
    
   
   public Matematica crearMatematica(){
       
       double n1=0;
       double n2=0;
       
       Matematica matematica = new Matematica(n1, n2);
       
       return matematica;
       
   }
    
   
   public void devolverMayor(double n1,double n2){
       
       if (n1>n2) {
           System.out.println("El mayor es "+n1);
       }else
           System.out.println("El mayor es "+n2);
   }
   
   public void  calcularPotencia(double n1, double n2){
       
     Math.round(n1);
     Math.round(n2);
       
       if (n1>n2) {
           System.out.println(Math.pow(n1, n2));
           
       }else
           System.out.println(Math.pow(n2, n1));
   }
       

  public void calcularRaiz(double n1, double n2){
      
      if (n1<n2) {
        Math.abs(n1);
          System.out.println(Math.sqrt(n1));
     
      }else{ 
          Math.abs(n2);
      System.out.println(Math.sqrt(n2));
      }
      
  } 
   
   
    
}
