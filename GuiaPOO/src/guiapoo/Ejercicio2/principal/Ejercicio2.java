package guiapoo.Ejercicio2.principal;

import guiapoo.Ejercicio2.entidades.Circunferencia;
import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        Circunferencia radio = new Circunferencia();

        radio.crearCircunferencia(radio.getRadio());
        radio.area(radio.getRadio());
        radio.perimetro(radio.getRadio());

    }

}
