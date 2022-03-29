package ejercicio2extra.entidades;

import java.util.Scanner;

public abstract class Edificio {

    protected int ancho;
    protected int alto;
    protected int largo;
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Edificio() {
    }

    public Edificio(int ancho, int alto, int largo) {
        this.ancho = ancho;
        this.alto = alto;
        this.largo = largo;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }

    public void crearEdificio() {

        System.out.println("Ingrese el ancho");
        ancho = leer.nextInt();

        System.out.println("Ingrese el alto");
        alto = leer.nextInt();

        System.out.println("Ingrese el largo");
        largo = leer.nextInt();

       
    }

    public abstract void calcularSuperficie(int ancho, int alto, int largo);

    public abstract void calcularVolumen(int ancho, int alto, int largo);

    @Override
    public String toString() {
        return "Edificio{" + "ancho=" + ancho + ", alto=" + alto + ", largo=" + largo + '}';
    }

    
    
}
