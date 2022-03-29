
package ejercicio3extra.entidades;

import java.util.Scanner;


public class AlojamientoExtraHotelero extends Alojamiento{
    
   protected boolean privado;
   protected int cantidadMetros;
private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public AlojamientoExtraHotelero() {
    }

    public AlojamientoExtraHotelero(boolean privado, int cantidadMetros) {
        this.privado = privado;
        this.cantidadMetros = cantidadMetros;
    }

    public boolean isPrivado() {
        return privado;
    }

    public void setPrivado(boolean privado) {
        this.privado = privado;
    }

    public int getCantidadMetros() {
        return cantidadMetros;
    }

    public void setCantidadMetros(int cantidadMetros) {
        this.cantidadMetros = cantidadMetros;
    }

    @Override
    public String toString() {
        return "AlojamientoExtraHotelero{" + "privado=" + privado + ", cantidadMetros=" + cantidadMetros + '}';
    }
   
    
    public void crearAlojamientoExtraHotelero(){
        
       privado=true;
       
        System.out.println("Ingrese la cantidad de metros cuadrados");
        cantidadMetros=leer.nextInt();
        
       AlojamientoExtraHotelero a = new AlojamientoExtraHotelero();
     
    }
   
   
   
}
