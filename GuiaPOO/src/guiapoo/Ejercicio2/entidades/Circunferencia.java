package guiapoo.Ejercicio2.entidades;

import java.util.Scanner;

public class Circunferencia {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private double radio;

    public Circunferencia(double radio) {
        this.radio = radio;
    }

    public Circunferencia() {

    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public void crearCircunferencia(double radio) {
        System.out.println("Ingrese el radio");
        this.radio = leer.nextDouble();

    }

    public void area(double radio) {
        double area;
        area = Math.PI * Math.pow(radio, 2);
        System.out.println("El area es "+area);
    }

    public void perimetro(double radio) {
        double perimetro;
        perimetro = (2 * Math.PI * radio);
        System.out.println("El perimetro es "+perimetro);
    }

    @Override
    public String toString() {
        return "Circunferencia{" + "radio=" + radio + '}';
    }

   
    
    
}
