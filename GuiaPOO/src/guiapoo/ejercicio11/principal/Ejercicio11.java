
package guiapoo.ejercicio11.principal;

import java.util.Scanner;
import java.util.Date;

public class Ejercicio11 {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Ingrese un dia");
        int dia=leer.nextInt();
        
          System.out.println("Ingrese un mes");
        int mes=leer.nextInt();
        
          System.out.println("Ingrese un año");
        int anio=leer.nextInt();
        
        
        Date fecha= new Date(anio-1900, mes, dia);
        
        System.out.println(fecha); 
        
        Date fechaActual= new Date();
        
        System.out.println(fechaActual);
        
    int n= fechaActual.getYear();
        
        System.out.println("La diferencia de años es: "+(n-fecha.getYear()) );
        
      
    }
    
}
