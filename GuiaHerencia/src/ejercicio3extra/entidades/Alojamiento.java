
package ejercicio3extra.entidades;

import java.util.Scanner;


public class Alojamiento {
    
   private String nombre;
   private String direccion;
   private String localidad;
   private String gerenteEncargado;
   private Hotel hotel;
   private AlojamientoExtraHotelero alojamiento;
   private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public Alojamiento() {
    }

    public Alojamiento(String nombre, String direccion, String localidad, String gerenteEncargado, Hotel hotel, AlojamientoExtraHotelero alojamiento) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.localidad = localidad;
        this.gerenteEncargado = gerenteEncargado;
        this.hotel = hotel;
        this.alojamiento = alojamiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getGerenteEncargado() {
        return gerenteEncargado;
    }

    public void setGerenteEncargado(String gerenteEncargado) {
        this.gerenteEncargado = gerenteEncargado;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    public AlojamientoExtraHotelero getAlojamiento() {
        return alojamiento;
    }

    public void setAlojamiento(AlojamientoExtraHotelero alojamiento) {
        this.alojamiento = alojamiento;
    }

    @Override
    public String toString() {
        return "Alojamiento{" + "nombre=" + nombre + ", direccion=" + direccion + ", localidad=" + localidad + ", gerenteEncargado=" + gerenteEncargado + ", hotel=" + hotel + ", alojamiento=" + alojamiento + '}';
    }
   
   
    public Alojamiento crearAlojamiento(){
        
        Alojamiento a = new Alojamiento();
        
        System.out.println("Ingrese su nombre");
        nombre=leer.next();
        
        System.out.println("Ingrese su direccion");
        direccion=leer.next();
        
        System.out.println("Ingrese su localidad");
        localidad=leer.next();
        
        System.out.println("Ingrese el nombre del gerente ");
        gerenteEncargado=leer.next();
        
        return a;
    }
   
   
    
}
