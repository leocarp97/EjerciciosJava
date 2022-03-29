package ejercicio3.principal;

import ejercicio3.entidades.DivisionNumero;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        DivisionNumero d = new DivisionNumero();

        // d.ingresarNumeros();
        try {
            d.ingresarNumeros();
            d.cadena();
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());

        } catch (NumberFormatException ex) {
            System.out.println(ex.fillInStackTrace());
        } catch (InputMismatchException error) {

            System.out.println(error);
        }
    }

}
