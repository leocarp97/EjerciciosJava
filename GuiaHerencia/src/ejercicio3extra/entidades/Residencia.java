
package ejercicio3extra.entidades;

import java.util.Scanner;


public class Residencia extends AlojamientoExtraHotelero {
    
   private int cantHabitaciones;
   private boolean descuentosGremios;
   private boolean campoDeportivo;
private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public Residencia() {
    }

    public Residencia(int cantHabitaciones, boolean descuentosGremios, boolean campoDeportivo, boolean privado, int cantidadMetros) {
        super(privado, cantidadMetros);
        this.cantHabitaciones = cantHabitaciones;
        this.descuentosGremios = descuentosGremios;
        this.campoDeportivo = campoDeportivo;
    }

    public int getCantHabitaciones() {
        return cantHabitaciones;
    }

    public void setCantHabitaciones(int cantHabitaciones) {
        this.cantHabitaciones = cantHabitaciones;
    }

    public boolean isDescuentosGremios() {
        return descuentosGremios;
    }

    public void setDescuentosGremios(boolean descuentosGremios) {
        this.descuentosGremios = descuentosGremios;
    }

    public boolean isCampoDeportivo() {
        return campoDeportivo;
    }

    public void setCampoDeportivo(boolean campoDeportivo) {
        this.campoDeportivo = campoDeportivo;
    }
   
 
public void crearResidencia(){
    
    crearAlojamientoExtraHotelero();
    
    System.out.println("Ingrese la cantidad de habitaciones"); 
    cantHabitaciones=leer.nextInt();
    
    
    descuentosGremios=true;
   campoDeportivo=false;
   
    
}   
   
   
}
