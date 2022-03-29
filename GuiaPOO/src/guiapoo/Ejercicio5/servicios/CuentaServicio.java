package guiapoo.Ejercicio5.servicios;

import guiapoo.Ejercicio5.entidades.Cuenta;
import java.util.Scanner;

public class CuentaServicio {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Cuenta crearCuenta() {

        System.out.println("Ingrese el numero de cuenta");
        int numeroCuenta = leer.nextInt();

        System.out.println("Ingrese su DNI");
        int dni = leer.nextInt();

        System.out.println("Ingrese su saldo");
        int saldo = leer.nextInt();

        Cuenta cuenta = new Cuenta(numeroCuenta, dni, saldo, 0);

        return cuenta;
    }

    public void ingresar(int saldo) {

        System.out.println("Ingrese una cantidad de dinero");
        int dinero = leer.nextInt();
        saldo = saldo + dinero;
        System.out.println("El saldo acutal es: "+saldo);
    }

    public void retirar(int saldo) {

        System.out.println("Ingrese una cantidad de dinero a retirar");
        int dinero = leer.nextInt();
        if (dinero > saldo) {
            System.out.println(0);
        }else{
        saldo = saldo - dinero;
        System.out.println("El saldo acutal es: "+saldo);
    }
    }
    public double extraccionRapida(int saldo) {

        return (saldo * 0.20);

    }

    public void consultarSaldo(int saldo) {
        System.out.println("El saldo es: " + saldo);

    }

    public void consultarDatos(int numeroCuenta, int dni, int saldo) {

        System.out.println("El numero de cuenta es: " + numeroCuenta);
        System.out.println("El DNI es: " + dni);
        System.out.println("El saldo es: " + saldo);

    }

}
