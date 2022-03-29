
package guiapoo.Ejercicio1.principal;

import guiapoo.Ejercicio1.entidades.Libro;
import java.util.Scanner;


public class Ejercicio1 {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        Libro libro=new Libro();
        
        System.out.println("Ingrese el valor de ISBN");
        libro.ISBN=leer.nextInt();
        
        System.out.println("Ingrese el titulo del libro");
        libro.titulo=leer.next();
        
        System.out.println("Ingrese el nombre del autor");
        libro.autor=leer.next();
        
        System.out.println("Ingrese el numero de paginas");
        libro.paginas=leer.nextInt();
        
        
        System.out.println("El valor de ISBN es: "+libro.ISBN);
        System.out.println("El titulo del libro es: "+libro.titulo);
        System.out.println("El nombre del autor es: "+libro.autor);
        System.out.println("El numero de paginas es: "+libro.paginas);
    
    }
    
    
    
    
}
