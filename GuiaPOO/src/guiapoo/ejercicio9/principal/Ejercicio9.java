
package guiapoo.ejercicio9.principal;

import guiapoo.ejercicio9.entidades.Matematica;
import guiapoo.ejercicio9.servicios.MatematicaServicio;
import java.util.Scanner;


public class Ejercicio9 {

   
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        
       MatematicaServicio ms= new MatematicaServicio();
       
        Matematica matematica = ms.crearMatematica();
        
        System.out.println("Ingrese un numero");
        
         double n1=(int) (Math.random()*30); 
        System.out.println(n1);
         
        System.out.println("Ingrese un numero");
        
        double n2=(int) (Math.random()*60); 
        System.out.println(n2);
        
        int opc;

        do {
            System.out.println("MENU");

            System.out.println("1-Mostrar el mayor ");
            System.out.println("2-Calcular potencia");
            System.out.println("3-Calcular raiz");
        
           opc=leer.nextInt();
        switch  (opc){
            
            case 1:
             ms.devolverMayor(n1, n2);
            break;
            case 2:
                ms.calcularPotencia(n1, n2);
                break;
            case 3:
                ms.calcularRaiz(n1, n2);
            break;
        }
        
        
        
    }    while (opc<4);
    
}
}