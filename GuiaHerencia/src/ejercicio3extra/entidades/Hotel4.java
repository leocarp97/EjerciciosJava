package ejercicio3extra.entidades;

import java.util.Scanner;

public class Hotel4 extends Hotel {

    protected String gimnasio;
    protected String nombreRestaurante;
    protected int capacidadRestaurante;
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Hotel4() {
    }

    public Hotel4(String gimnasio, String nombreRestaurante, int capacidadRestaurante, int cantidadHabitaciones, int numeroCamas, int cantidadPisos, int precioHabitaciones) {
        super(cantidadHabitaciones, numeroCamas, cantidadPisos, precioHabitaciones);
        this.gimnasio = gimnasio;
        this.nombreRestaurante = nombreRestaurante;
        this.capacidadRestaurante = capacidadRestaurante;
    }

    public String getGimnasio() {
        return gimnasio;
    }

    public void setGimnasio(String gimnasio) {
        this.gimnasio = gimnasio;
    }

    public String getNombreRestaurante() {
        return nombreRestaurante;
    }

    public void setNombreRestaurante(String nombreRestaurante) {
        this.nombreRestaurante = nombreRestaurante;
    }

    public int getCapacidadRestaurante() {
        return capacidadRestaurante;
    }

    public void setCapacidadRestaurante(int capacidadRestaurante) {
        this.capacidadRestaurante = capacidadRestaurante;
    }

    public void crearHotel4() {

        crearHotel();

        System.out.println("Ingrese la clase del gimnasio");
        gimnasio = leer.next();

        System.out.println("Ingrese el nombre del restaurante");
        nombreRestaurante = leer.next();

        System.out.println("Ingrese la capacidad del restaurante");
        capacidadRestaurante = leer.nextByte();

    }

    @Override
    public int precioHabitaciones() {

        if (gimnasio.equalsIgnoreCase("a") && capacidadRestaurante > 50) {
            return super.precioHabitaciones() + 50 + 50;
        } else if (gimnasio.equalsIgnoreCase("a") && capacidadRestaurante < 30) {
            return super.precioHabitaciones() + 50 + 10;

        } else if (gimnasio.equalsIgnoreCase("a") && capacidadRestaurante > 30 && capacidadRestaurante < 50) {
            return super.precioHabitaciones() + 50 + 30;
        }

        if (gimnasio.equalsIgnoreCase("b") && capacidadRestaurante > 50) {
            return super.precioHabitaciones() + 30 + 50;
        } else if (gimnasio.equalsIgnoreCase("b") && capacidadRestaurante < 30) {
            return super.precioHabitaciones() + 30 + 10;

        }

        return super.precioHabitaciones() + 30 + 30;
    }

}
