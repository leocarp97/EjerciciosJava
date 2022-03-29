
package guiapoo.Ejercicio3.principal;

import guiapoo.Ejercicio3.entidades.Operacion;
import java.util.Scanner;


public class Ejercicio3 {

    
    public static void main(String[] args) {
       
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        Operacion operar = new Operacion();
        
        
        operar.crearOperacion();
        
        System.out.println("La suma es : "+operar.sumar());
        System.out.println("La resta es : "+operar.restar());
        System.out.println("La multiplicacion es : "+operar.multiplicar());
        System.out.println("La division es : "+operar.dividir());
    }
    
    
}
