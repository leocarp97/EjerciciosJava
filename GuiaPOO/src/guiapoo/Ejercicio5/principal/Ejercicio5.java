package guiapoo.Ejercicio5.principal;

import guiapoo.Ejercicio5.entidades.Cuenta;
import guiapoo.Ejercicio5.servicios.CuentaServicio;
import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        CuentaServicio cs = new CuentaServicio();

        Cuenta cuenta = cs.crearCuenta();

        System.out.println(cuenta);

        int opc;

        do {
            System.out.println("MENU");

            System.out.println("1-Ingresar dinero al saldo actual ");
            System.out.println("2-Retirar dinero");
            System.out.println("3-Consultar saldo");
            System.out.println("4-Extraer el %20 del saldo");
            System.out.println("5- Mostrar datos");
            opc = leer.nextInt();
            switch (opc) {

                case 1:
                  
                    cs.ingresar(cuenta.getSaldo());
                    break;
                case 2:
                  
                    cs.retirar(cuenta.getSaldo());
                    break;
                case 3:
                    System.out.println("Consultar el saldo ");
                    cs.consultarSaldo(cuenta.getSaldo());
                    break;
                case 4:
                    System.out.println("El saldo a retirar es : " + cs.extraccionRapida(cuenta.getSaldo()));

                    break;
                case 5:
                    System.out.println("Mostrar Datos");
                    cs.consultarDatos(cuenta.getNumeroCuenta(), cuenta.getDni(), cuenta.getSaldo());
                    break;
            }

        } while (opc < 6);

    }
}
