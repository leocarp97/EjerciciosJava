package ejercicio1extra.entidades;

import java.util.Scanner;

public class Barco {

    protected int matricula;
    protected int eslora;
    protected int añoFabricacion;
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Barco() {
    }

    public Barco(int matricula, int eslora, int añoFabricacion) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.añoFabricacion = añoFabricacion;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public int getEslora() {
        return eslora;
    }

    public void setEslora(int eslora) {
        this.eslora = eslora;
    }

    public int getAñoFabricacion() {
        return añoFabricacion;
    }

    public void setAñoFabricacion(int añoFabricacion) {
        this.añoFabricacion = añoFabricacion;
    }

    @Override
    public String toString() {
        return "Barco{" + "matricula=" + matricula + ", eslora=" + eslora + ", a\u00f1oFabricacion=" + añoFabricacion + '}';
    }

    
    
    
    public void crearBarco() {

        System.out.println("Ingrese la matricula");
        matricula = leer.nextInt();

        System.out.println("Ingrese su eslora en metros");
        eslora = leer.nextInt();

        System.out.println("Ingrese el año de fabricacion");
        añoFabricacion = leer.nextInt();



    }

    public int calcularAlquiler(){
        
       return eslora*10; 
        
    }
    
    
}
