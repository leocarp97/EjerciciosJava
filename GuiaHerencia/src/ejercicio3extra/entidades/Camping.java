
package ejercicio3extra.entidades;

import java.util.Scanner;

public class Camping extends AlojamientoExtraHotelero{
    
   private int capacidadMaximaCarpas;
   private int bañosDisponibles;
   private boolean restaurante;
private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public Camping() {
    }

    public Camping(int capacidadMaximaCarpas, int bañosDisponibles, boolean Restaurante, boolean privado, int cantidadMetros) {
        super(privado, cantidadMetros);
        this.capacidadMaximaCarpas = capacidadMaximaCarpas;
        this.bañosDisponibles = bañosDisponibles;
        this.restaurante = Restaurante;
    }

    public int getCapacidadMaximaCarpas() {
        return capacidadMaximaCarpas;
    }

    public void setCapacidadMaximaCarpas(int capacidadMaximaCarpas) {
        this.capacidadMaximaCarpas = capacidadMaximaCarpas;
    }

    public int getBañosDisponibles() {
        return bañosDisponibles;
    }

    public void setBañosDisponibles(int bañosDisponibles) {
        this.bañosDisponibles = bañosDisponibles;
    }

    public boolean isRestaurante() {
        return restaurante;
    }

    public void setRestaurante(boolean Restaurante) {
        this.restaurante = Restaurante;
    }

    @Override
    public String toString() {
        return "Camping{" + "capacidadMaximaCarpas=" + capacidadMaximaCarpas + ", ba\u00f1osDisponibles=" + bañosDisponibles + ", Restaurante=" + restaurante + '}';
    }
   
   
   public void crearCamping(){
       
      crearAlojamientoExtraHotelero();
      
        System.out.println("Ingrese la capacidad maxima de carpas");
       capacidadMaximaCarpas=leer.nextInt();
       
       System.out.println("Ingrese la cantidad de baños disponibles");
       bañosDisponibles=leer.nextInt();
       
       restaurante=true;
       
   } 
    
    
    
}
