package ejercicio1extra.entidades;

import java.util.Date;
import java.util.Scanner;

public class Alquiler {

    private String nombre;
    private int dni;
    private Date fechaAlquiler;
    private Date fechaDevolucion;
    private int posicionAmarre;
    private Barco barcoAlquilado;
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Alquiler() {
        fechaAlquiler = new Date();
        fechaDevolucion = new Date();
    }

    public Alquiler(String nombre, int dni, Date fechaAlquiler, Date fechaDevolucion, int posicionAmarre, Barco barcoAlquilado) {
        this.nombre = nombre;
        this.dni = dni;
        this.fechaAlquiler = fechaAlquiler;
        this.fechaDevolucion = fechaDevolucion;
        this.posicionAmarre = posicionAmarre;
        this.barcoAlquilado = barcoAlquilado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public Date getFechaAlquiler() {
        return fechaAlquiler;
    }

    public void setFechaAlquiler(Date fechaAlquiler) {
        this.fechaAlquiler = fechaAlquiler;
    }

    public Date getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(Date fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public int getPosicionAmarre() {
        return posicionAmarre;
    }

    public void setPosicionAmarre(int posicionAmarre) {
        this.posicionAmarre = posicionAmarre;
    }

    public Barco getBarcoAlquilado() {
        return barcoAlquilado;
    }

    public void setBarcoAlquilado(Barco barcoAlquilado) {
        this.barcoAlquilado = barcoAlquilado;
    }

    @Override
    public String toString() {
        return "Alquiler{" + "nombre=" + nombre + ", dni=" + dni + ", fechaAlquiler=" + fechaAlquiler + ", fechaDevolucion=" + fechaDevolucion + ", posicionAmarre=" + posicionAmarre + ", barcoAlquilado=" + barcoAlquilado + '}';
    }


    public Alquiler crearAlquiler() {
        int dia;
        int año;
        int mes;
        Alquiler alquiler = new Alquiler();
        System.out.println("Ingrese su nombre");
        nombre = leer.next();

        System.out.println("Ingrese su DNI");
        dni = leer.nextInt();

        System.out.println("Ingrese la fecha del alquiler");

        System.out.println("Dia:");
        dia = leer.nextInt();
        System.out.println("Mes:");
        mes = leer.nextInt();
        System.out.println("Año:");
        año = leer.nextInt();

        fechaAlquiler = new Date(año-1900, mes, dia);

        alquiler.setFechaAlquiler(fechaAlquiler);

        System.out.println("Ingrese la fecha de devolucion");

        System.out.println("Dia:");
        dia = leer.nextInt();
        System.out.println("Mes:");
        mes = leer.nextInt();
        System.out.println("Año:");
        año = leer.nextInt();

        fechaDevolucion = new Date(año-1900, mes, dia);

        alquiler.setFechaDevolucion(fechaDevolucion);

        System.out.println("Ingrese la posicion del amarre");

        posicionAmarre = leer.nextInt();
    
        return alquiler;

        
    }

    public int calcularAlquiler(Alquiler alquiler) {
        
      return  alquiler.getFechaDevolucion().getDate() - alquiler.getFechaAlquiler().getDate();
        
    }

}
