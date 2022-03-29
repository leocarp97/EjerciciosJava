package ejercicio1extra.relaciones.entidades;

import java.util.Scanner;

public class Perro {

    private String nombre;
    private String raza;
    private int edad;
    private String tamaño;
    private Scanner leer;

    public Perro() {
        leer = new Scanner(System.in).useDelimiter("\n");
    }

    public Perro(String nombre, String raza, int edad, String tamaño) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.tamaño = tamaño;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    @Override
    public String toString() {
        return "Perro{" + "nombre=" + nombre + ", raza=" + raza + ", edad=" + edad + ", tama\u00f1o=" + tamaño + '}';
    }

    public Perro crearPerro() {

        Perro perro = new Perro();

        System.out.println("Ingrese el nombre del perro");

        nombre = leer.next();

        System.out.println("Ingrese la edad del perro");

        edad = leer.nextInt();

        System.out.println("Ingrese la raza del perro");

        raza = leer.next();

        System.out.println("Ingrese el tamaño del perro");

        tamaño = leer.next();

        return perro;

    }

}
