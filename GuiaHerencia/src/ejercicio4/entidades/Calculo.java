package ejercicio4.entidades;

import ejercicio4.interfaces.CalculoForma;
import java.util.Scanner;

public class Calculo implements CalculoForma {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    @Override
    public void areaCirculo(int radio) {
        System.out.println("Ingrese el radio");
        radio = leer.nextInt();
        double area = CalculoForma.PI * Math.pow(radio, 2);

        System.out.println("El area del circulo es: " + area);
        
    }

    @Override
    public void perimetroCirculo(double diametro) {

        System.out.println("Ingrese el diametro");
        diametro = leer.nextInt();

        double perimetro = CalculoForma.PI * diametro;

        System.out.println("El perimetro del circulo es: " + perimetro);

    }

    @Override
    public void areaRectangulo(int base, int altura) {
        System.out.println("Ingrese la base");
        base = leer.nextInt();

        System.out.println("Ingrese la altura");
        altura = leer.nextInt();

        double area = base * altura;

        System.out.println("El area del rectangulo es: " + area);
    }

    @Override
    public void perimetroRectangulo(int base, int altura) {

        System.out.println("Ingrese la base");
        base = leer.nextInt();

        System.out.println("Ingrese la altura");
        altura = leer.nextInt();

        double perimetro = (base + altura) * 2;

        System.out.println("El perimetro del rectangulo es: " + perimetro);

    }

}
