package ejercicio2.entidades;

import java.util.Scanner;

public class Televisor extends Electrodomestico {

    private int resolucion;
    private boolean tdt;
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Televisor() {
    }

    public Televisor(int resolucion, boolean tdt, int precio, String color, String consumoEnergetico, int peso) {
        super(precio, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.tdt = tdt;
    }

    public int getResolucion() {
        return resolucion;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isTdt() {
        return tdt;
    }

    public void setTdt(boolean tdt) {
        this.tdt = tdt;
    }

    public void crearTelevisor() {

        super.crearElectrodomestico();

        System.out.println("Ingrese la resolucion del televisor");
        resolucion = leer.nextInt();

        tdt = true;


    }

    @Override
    public void precioFinal() {

        super.precioFinal();

        if (tdt && resolucion > 40) {
            precio = (int) (precio + 500 + (precio * 0.30));
        }
        System.out.println("El precio es de $" + precio);
    }

}
