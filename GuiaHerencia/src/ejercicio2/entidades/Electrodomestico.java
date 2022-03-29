package ejercicio2.entidades;

import java.util.Arrays;
import java.util.Scanner;

public class Electrodomestico {

    protected int precio;
    protected String color;
    protected String consumoEnergetico;
    protected int peso;
    private Scanner leer;

    public Electrodomestico() {
        leer = new Scanner(System.in).useDelimiter("\n");
    }

    public Electrodomestico(int precio, String color, String consumoEnergetico, int peso) {
        this.precio = precio;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(String consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public void comprobarConsumoEnergetico() {

        if (!consumoEnergetico.equalsIgnoreCase("a") && (!consumoEnergetico.equalsIgnoreCase("b")) && !consumoEnergetico.equalsIgnoreCase("c") && !consumoEnergetico.equalsIgnoreCase("d") & !consumoEnergetico.equalsIgnoreCase("e")) {
            consumoEnergetico = "f";
        }

    }

    public String comprobarColor(String color) {

        String[] colores = {"blanco", "rojo", "azul", "negro", "gris"};

        if (Arrays.toString(colores).contains(color.toLowerCase())) {
            return color;
        }
        return "Blanco";
    }

    @Override
    public String toString() {
        return "Electrodomestico{" + "precio=" + precio + ", color=" + color + ", consumoEnergetico=" + consumoEnergetico + ", peso=" + peso + '}';
    }

    public void mostrarDatos() {
        System.out.println("El precio es" + precio);
        System.out.println("El color es " + color);
        System.out.println("El consumo es " + consumoEnergetico);
        System.out.println("El peso es " + peso);

    }

    public void crearElectrodomestico() {

        System.out.println("Ingrese el color del electrodomestico");
        String color = leer.next();

        this.color = comprobarColor(color);

        System.out.println("Ingrese el consumo energetico");
        consumoEnergetico = leer.next();

        comprobarConsumoEnergetico();

        System.out.println("Ingrese el peso del electrodomestico");
        peso = leer.nextInt();

        precio = 1000;

    }

    public void precioFinal() {

        switch (consumoEnergetico) {

            case "a":

                if (peso > 1 && peso < 20) {
                    precio = precio + 1100;

                }

                if (peso > 20 && peso < 50) {
                    precio = precio + 1500;

                }

                if (peso > 50 && peso < 80) {
                    precio = precio + 1800;

                }
                if (peso > 80) {
                    precio = precio + 2000;
                }
                break;
            case "b":
                if (peso > 1 && peso < 20) {
                    precio = precio + 900;

                }

                if (peso > 20 && peso < 50) {
                    precio = precio + 1300;

                }

                if (peso > 50 && peso < 80) {
                    precio = precio + 1600;

                }
                if (peso > 80) {
                    precio = precio + 1800;
                }
                break;
            case "c":
                if (peso > 1 && peso < 20) {
                    precio = precio + 700;

                }

                if (peso > 20 && peso < 50) {
                    precio = precio + 1100;

                }

                if (peso > 50 && peso < 80) {
                    precio = precio + 1400;

                }
                if (peso > 80) {
                    precio = precio + 1600;
                }
                break;
            case "d":
                if (peso > 1 && peso < 20) {
                    precio = precio + 600;

                }

                if (peso > 20 && peso < 50) {
                    precio = precio + 1000;

                }

                if (peso > 50 && peso < 80) {
                    precio = precio + 1300;

                }
                if (peso > 80) {
                    precio = precio + 1500;
                }
                break;
            case "e":
                if (peso > 1 && peso < 20) {
                    precio = precio + 400;
                }

                if (peso > 20 && peso < 50) {
                    precio = precio + 800;
                }

                if (peso > 50 && peso < 80) {
                    precio = precio + 1100;
                }
                if (peso > 80) {
                    precio = precio + 1300;
                }
                break;
            case "f":
                if (peso > 1 && peso < 20) {
                    precio = precio + 200;
                }

                if (peso > 20 && peso < 50) {
                    precio = precio + 600;
                }

                if (peso > 50 && peso < 80) {
                    precio = precio + 900;
                }
                if (peso > 80) {
                    precio = precio + 1100;
                }
                break;
        }

    }

}
