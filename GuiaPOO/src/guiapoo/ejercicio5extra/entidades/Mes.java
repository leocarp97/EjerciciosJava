package guiapoo.ejercicio5extra.entidades;

import java.util.Scanner;

public class Mes {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private String mes[];
    private String mesSecreto;

    public Mes() {

        mes = new String[12];

    }

    public Mes(String[] mes, String mesSecreto) {
        this.mes = mes;
        this.mesSecreto = mesSecreto;
    }

    public String[] getMes() {
        return mes;
    }

    public void setMes(String[] mes) {
        this.mes = mes;
    }

    public String getMesSecreto() {
        return mesSecreto;
    }

    public void setMesSecreto(String mesSecreto) {
        this.mesSecreto = mesSecreto;
    }

    public void crearMes() {

        System.out.println("Ingrese los 12 meses");

        for (int i = 0; i < 12; i++) {

            mes[i] = leer.next();
        }
        for (int i = 0; i < 12; i++) {
            mesSecreto = mes[3];
        }

    }

    public void mesSecreto(String[] mes) {

        String mes1;
        System.out.println("Ingrese un mes");
        mes1 = leer.next();

        while (!mes1.equalsIgnoreCase(mesSecreto)) {
            System.out.println("No ha acertado. Intente adivinarlo introduciendo otro mes");
            mes1 = leer.next();
        }

        System.out.println("Ha acertado");
    }

}
