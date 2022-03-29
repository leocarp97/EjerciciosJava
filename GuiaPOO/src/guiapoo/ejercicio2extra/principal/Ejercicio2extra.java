
package guiapoo.ejercicio2extra.principal;

import guiapoo.ejercicio2extra.entidades.Punto;
import guiapoo.ejercicio2extra.servicios.PuntoServicio;


public class Ejercicio2extra {

  
    public static void main(String[] args) {
      
        PuntoServicio ps= new PuntoServicio();
        
        Punto punto = ps.crearPunto();
        
        
       ps.calcularDistancia(punto.getX1(), punto.getY1(), punto.getX2(), punto.getY2());
        
    }
    
}
