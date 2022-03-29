package ejercicio1extra.entidades;

import java.util.Scanner;

public class Velero extends Barco {

    private int numeroMastiles;
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Velero() {
    }

    public Velero(int numeroMastiles, int matricula, int eslora, int añoFabricacion) {
        super(matricula, eslora, añoFabricacion);
        this.numeroMastiles = numeroMastiles;
    }

    public int getNumeroMastiles() {
        return numeroMastiles;
    }

    public void setNumeroMastiles(int numeroMastiles) {
        this.numeroMastiles = numeroMastiles;
    }

    @Override
    public String toString() {
        return super.toString()+"Velero{" + "numeroMastiles=" + numeroMastiles + '}';
    }

  
    
    
    public void crearVelero() {

        crearBarco();

        System.out.println("Ingrese el numero de mastiles");
        numeroMastiles = leer.nextInt();

      

    }

    @Override
 public int calcularAlquiler(){
       
      return (super.eslora*10)+numeroMastiles;
    
   } 
   

  
}
