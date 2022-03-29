package ejercicio3extra.entidades;

import java.util.Scanner;

public class Hotel5 extends Hotel4 {

    private int cantidadSalones;
    private int cantidadSuit;
    private int cantidadLimosinas;
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Hotel5() {
    }

    public Hotel5(int CantidadSalones, int cantidadSuit, int cantidadLimosinas, String gimnasio, String nombreRestaurante, int capacidadRestaurante, int cantidadHabitaciones, int numeroCamas, int cantidadPisos, int precioHabitaciones) {
        super(gimnasio, nombreRestaurante, capacidadRestaurante, cantidadHabitaciones, numeroCamas, cantidadPisos, precioHabitaciones);
        this.cantidadSalones = CantidadSalones;
        this.cantidadSuit = cantidadSuit;
        this.cantidadLimosinas = cantidadLimosinas;
    }

    public int getCantidadSalones() {
        return cantidadSalones;
    }

    public void setCantidadSalones(int CantidadSalones) {
        this.cantidadSalones = CantidadSalones;
    }

    public int getCantidadSuit() {
        return cantidadSuit;
    }

    public void setCantidadSuit(int cantidadSuit) {
        this.cantidadSuit = cantidadSuit;
    }

    public int getCantidadLimosinas() {
        return cantidadLimosinas;
    }

    public void setCantidadLimosinas(int cantidadLimosinas) {
        this.cantidadLimosinas = cantidadLimosinas;
    }

    public void crearHotel5() {

        crearHotel4();
        
        System.out.println("Ingrese la cantidad de salones");
        cantidadSalones = leer.nextInt();

        System.out.println("Ingrese la cantidad de suits");
        cantidadSuit = leer.nextInt();

        System.out.println("Ingrese la cantidad de limosinas");
        cantidadLimosinas = leer.nextInt();

      

    }

    @Override
    public int precioHabitaciones() {
        return super.precioHabitaciones();
    }
    
}