package ejercicio2extra.entidades;

import java.util.Scanner;

public class EdificioDeOficinas extends Edificio {

    private int numeroOficinas;
    private int cantidadPersonaOficina;
    private int numeroPisos;
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public EdificioDeOficinas() {
    }

    public EdificioDeOficinas(int numeroOficinas, int cantidadPersonaOficina, int numeroPisos, int ancho, int alto, int largo) {
        super(ancho, alto, largo);
        this.numeroOficinas = numeroOficinas;
        this.cantidadPersonaOficina = cantidadPersonaOficina;
        this.numeroPisos = numeroPisos;
    }

    public int getNumeroOficinas() {
        return numeroOficinas;
    }

    public void setNumeroOficinas(int numeroOficinas) {
        this.numeroOficinas = numeroOficinas;
    }

    public int getCantidadPersonaOficina() {
        return cantidadPersonaOficina;
    }

    public void setCantidadPersonaOficina(int cantidadPersonaOficina) {
        this.cantidadPersonaOficina = cantidadPersonaOficina;
    }

    public int getNumeroPisos() {
        return numeroPisos;
    }

    public void setNumeroPisos(int numeroPisos) {
        this.numeroPisos = numeroPisos;
    }

    @Override
    public void calcularSuperficie(int ancho, int alto, int largo) {
        System.out.println("La superficie es: " + (ancho * largo * this.numeroPisos));
    }

    @Override
    public void calcularVolumen(int ancho, int alto, int largo) {
        System.out.println("El volumen es: " + (ancho * largo * alto));
    }

    public void crearEdificioDeOficinas() {

      
        
        System.out.println("Ingrese el numero de oficinas");
        numeroOficinas = leer.nextInt();

        System.out.println("Ingrese el numero de personas por oficina");
        cantidadPersonaOficina = leer.nextInt();

        System.out.println("Ingrese la cantidad de pisos");
        numeroPisos = leer.nextInt();

    }

    public void cantPersonas() {

        int total;

        total = numeroOficinas * cantidadPersonaOficina;

        double personasPiso;

        personasPiso = (numeroOficinas * cantidadPersonaOficina) / numeroPisos;

        System.out.println("La cantidad de personas por piso es: "+personasPiso);
    }

    @Override
    public String toString() {
        return super.toString()+"EdificioDeOficinas{" + "numeroOficinas=" + numeroOficinas + ", cantidadPersonaOficina=" + cantidadPersonaOficina + ", numeroPisos=" + numeroPisos + '}';
    }

 
   
    
    
}
