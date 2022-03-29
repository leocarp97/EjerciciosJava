package ejercicio3extra.entidades;

import java.util.Scanner;

public class Hotel extends Alojamiento {

    protected int cantidadHabitaciones;
    protected int numeroCamas;
    protected int cantidadPisos;
    protected int precioHabitaciones;
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Hotel() {
    }

    public Hotel(int cantidadHabitaciones, int numeroCamas, int cantidadPisos, int precioHabitaciones) {
        this.cantidadHabitaciones = cantidadHabitaciones;
        this.numeroCamas = numeroCamas;
        this.cantidadPisos = cantidadPisos;
        this.precioHabitaciones = precioHabitaciones;
    }

    public int getCantidadHabitaciones() {
        return cantidadHabitaciones;
    }

    public void setCantidadHabitaciones(int cantidadHabitaciones) {
        this.cantidadHabitaciones = cantidadHabitaciones;
    }

    public int getNumeroCamas() {
        return numeroCamas;
    }

    public void setNumeroCamas(int numeroCamas) {
        this.numeroCamas = numeroCamas;
    }

    public int getCantidadPisos() {
        return cantidadPisos;
    }

    public void setCantidadPisos(int cantidadPisos) {
        this.cantidadPisos = cantidadPisos;
    }

    public int getPrecioHabitaciones() {
        return precioHabitaciones;
    }

    public void setPrecioHabitaciones(int precioHabitaciones) {
        this.precioHabitaciones = precioHabitaciones;
    }

    @Override
    public String toString() {
        return "Hotel{" + "cantidadHabitaciones=" + cantidadHabitaciones + ", numeroCamas=" + numeroCamas + ", cantidadPisos=" + cantidadPisos + ", precioHabitaciones=" + precioHabitaciones + '}';
    }

    
    
    
    public void crearHotel() {

        System.out.println("Ingrese la cantidad de habitaciones");
        cantidadHabitaciones = leer.nextInt();

        System.out.println("Ingrese el numero de camas");
        numeroCamas = leer.nextInt();

        System.out.println("Ingrese la cantidad de pisos");
        cantidadPisos = leer.nextInt();

     

    }

    
 public int precioHabitaciones(){
     
     
     return  precioHabitaciones = 50+(1*(cantidadHabitaciones*numeroCamas*cantidadPisos));
     
     
     
 }  
    
    
}
