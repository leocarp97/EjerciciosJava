package ejercicio2extra.entidades;

import java.util.Scanner;

public class Polideportivo extends Edificio {

    private String nombrePolideportivo;
    private String instalacion;
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Polideportivo() {
    }

    public Polideportivo(String nombrePolideportivo, String instalacion, int ancho, int alto, int largo) {
        super(ancho, alto, largo);
        this.nombrePolideportivo = nombrePolideportivo;
        this.instalacion = instalacion;
    }

    public String getNombrePolideportivo() {
        return nombrePolideportivo;
    }

    public void setNombrePolideportivo(String nombrePolideportivo) {
        this.nombrePolideportivo = nombrePolideportivo;
    }

    public String getInstalacion() {
        return instalacion;
    }

    public void setInstalacion(String instalacion) {
        this.instalacion = instalacion;
    }

    public void crearPolideportivo() {

       
        System.out.println("Ingrese el nombre del polideportivo");
        nombrePolideportivo = leer.next();

        System.out.println("Ingrese si el polideportivo es techado o abierto");
        instalacion = leer.next();

    }

    @Override
    public void calcularSuperficie(int ancho, int alto, int largo) {
        System.out.println("La superficie es: " + (ancho * largo));
    }

    @Override
    public void calcularVolumen(int ancho, int alto, int largo) {
        System.out.println("El volumen es: " + (ancho * largo * alto));
    }

    @Override
    public String toString() {
        return super.toString()+"Polideportivo{" + "nombrePolideportivo=" + nombrePolideportivo + ", instalacion=" + instalacion + '}';
    }


    
    
}
