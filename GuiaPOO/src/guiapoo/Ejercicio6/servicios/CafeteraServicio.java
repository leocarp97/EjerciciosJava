
package guiapoo.Ejercicio6.servicios;

import guiapoo.Ejercicio6.entidades.Cafetera;
import java.util.Scanner;

public class CafeteraServicio {
    
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Cafetera crearCafetera(){
        System.out.println("Ingrese la capacidad maxima"); 
        int capacidadMaxima=leer.nextInt();
        
        System.out.println("Ingrese la capacidad actual");
        int cantidadActual=leer.nextInt();
        
        Cafetera cafetera = new Cafetera(capacidadMaxima, cantidadActual);
        
        return cafetera;
    }
    
    
    
    public int llenarCafetera(int capacidadMaxima, int cantidadActual){
        
         return cantidadActual=capacidadMaxima; 
    }
    
    
      public void servirTaza(){
        
        System.out.println("Ingrese el tamaño de la taza");
        int taza=leer.nextInt();
        
        System.out.println("Ingrese la cantidad a servir en la taza");
        int capacidad=leer.nextInt();
        
        
        if (capacidad>taza) {
            System.out.println("Se lleno la taza");
        }else   
            System.out.println("La capacidad de la taza quedo: "+(taza-capacidad));
 
        
    }
    
    public int vaciarCafetera(int cantidadActual){
        
        return cantidadActual=0;
    }
    
    public int agregarCafe(int cantidadActual){
        
        System.out.println("Ingrese una cantidad de cafe");
        int cafe = leer.nextInt();
        cantidadActual=cantidadActual+cafe;
        return cantidadActual;
    }
    
    
}
