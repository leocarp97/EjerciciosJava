package ejercicio1extra.entidades;

import java.util.Scanner;

public class BarcoMotor extends Barco {

    private int potenciaCV;
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public BarcoMotor() {
    }

    public BarcoMotor(int potenciaCV, int matricula, int eslora, int añoFabricacion) {
        super(matricula, eslora, añoFabricacion);
        this.potenciaCV = potenciaCV;
    }

    public int getPotenciaCV() {
        return potenciaCV;
    }

    public void setPotenciaCV(int potenciaCV) {
        this.potenciaCV = potenciaCV;
    }

    @Override
    public String toString() {
        return super.toString()+"BarcoMotor{" + "potenciaCV=" + potenciaCV + '}';
    }


    
    public void crearBarcoMotor() {

        crearBarco();

        System.out.println("Ingrese la potencia del motor");
        potenciaCV = leer.nextInt();


    }

    
    @Override
   public int calcularAlquiler(){
       
       
       return (super.eslora*10)+potenciaCV;
   } 
    
}
