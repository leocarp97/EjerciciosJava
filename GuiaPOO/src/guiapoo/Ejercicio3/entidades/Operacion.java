
package guiapoo.Ejercicio3.entidades;

import java.util.Scanner;


public class Operacion {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    private int numero1;
    private int numero2;
    private int numero3;

    public Operacion(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }
    
    public Operacion(){
        
    }

    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }
    
    public void crearOperacion(){
        System.out.println("Ingrese el primer numero");  
        numero1=leer.nextInt();
        System.out.println("Ingrese el segundo numero");
        numero2=leer.nextInt();
        
    }
    
    public int sumar(){
        
        return (numero1+numero2);
    }
    
    public int restar(){
        
        return (numero1-numero2);
    }
    
    public int multiplicar(){
        
        if (numero1==0 || numero2==0) {
            System.out.println("No se puede multiplicar por 0");
            return 0;
        }
            return (numero1*numero2);
            
        }
 
      
    public int dividir(){
        
        if (numero1==0 || numero2==0) {
            System.out.println("No se puede dividir por 0");
            return 0;
        }
            return (numero1/numero2);
            
        }
    
    
    
    
    }
    
    
    
    

