package ejercicio1extra.entidades;

import java.util.Scanner;

public class Yate extends Barco {

    private int potenciaCV;
    private int numeroCamarotes;
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Yate() {
    }

    public Yate(int potenciaCV, int numeroCamarotes, int matricula, int eslora, int añoFabricacion) {
        super(matricula, eslora, añoFabricacion);
        this.potenciaCV = potenciaCV;
        this.numeroCamarotes = numeroCamarotes;
    }

    public int getPotenciaCV() {
        return potenciaCV;
    }

    public void setPotenciaCV(int potenciaCV) {
        this.potenciaCV = potenciaCV;
    }

    public int getNumeroCamarotes() {
        return numeroCamarotes;
    }

    public void setNumeroCamarotes(int numeroCamarotes) {
        this.numeroCamarotes = numeroCamarotes;
    }

    @Override
    public String toString() {
        return super.toString()+"Yate{" + "potenciaCV=" + potenciaCV + ", numeroCamarotes=" + numeroCamarotes + '}';
    }

   
    
    public void crearYate() {

        crearBarco();

        System.out.println("Ingrese la potencia del motor");
        potenciaCV = leer.nextInt();

        System.out.println("Ingrese el numero de camarotes");
        numeroCamarotes = leer.nextInt();


    }

    @Override
   public int calcularAlquiler(){
       
       
       return (super.eslora*10)+potenciaCV+numeroCamarotes;
   } 
    
}
