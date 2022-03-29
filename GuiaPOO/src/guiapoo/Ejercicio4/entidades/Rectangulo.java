
package guiapoo.Ejercicio4.entidades;

import java.util.Scanner;


public class Rectangulo {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private int base;
    private int altura;

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }
    
    public Rectangulo(){
    
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    
    
    public void crearRectangulo(){
        System.out.println("Ingrese la base");
        base=leer.nextInt();
        System.out.println("Ingrese la altura");
        altura=leer.nextInt();
    }
    
    public int superficieRectangulo(){
        
     
        return (base*altura);
    } 
   
public int perimetroRectangulo(){
    
    
    return (base+altura)*2;
}

public void dibujarRectangulo(){
    
    for (int i = 0; i < altura; i++) {
        for (int j = 0; j < base; j++) {
            System.out.print(" * ");
        }
        System.out.println(" ");
    }
    
 
    
    
}


}
    
    
    
