package ejercicio2.entidades;

import java.util.Scanner;

public class Lavadora extends Electrodomestico {

    private int carga;
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Lavadora() {
    }

    public Lavadora(int carga, int precio, String color, String consumoEnergetico, int peso) {
        super(precio, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    public void crearLavadora() {

        
        crearElectrodomestico();

        System.out.println("Ingrese la carga de la lavadora");
        carga = leer.nextInt();

       
    }

    @Override
    public void precioFinal() {
        
        super.precioFinal();
       
        if (carga > 30) {
            precio = precio + 500;
        }
        System.out.println("El precio es de $" + precio);
    }

    @Override
    public String toString() {
        return super.toString()+"Lavadora{" + "carga=" + carga + '}';
    }    
   
    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("La carga es"+carga);
    }
 
}
