package guiapoo.Ejercicio4.principal;

import guiapoo.Ejercicio4.entidades.Rectangulo;
import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        Rectangulo rectangulo = new Rectangulo();

        rectangulo.crearRectangulo();

        System.out.println("La superficie es :" + rectangulo.superficieRectangulo());

        System.out.println("El perimetro es :" + rectangulo.perimetroRectangulo());

        rectangulo.dibujarRectangulo();

    }

}
