package ejercicio1extra.principal;

import ejercicio1extra.entidades.Alquiler;
import ejercicio1extra.entidades.Barco;
import ejercicio1extra.entidades.BarcoMotor;
import ejercicio1extra.entidades.Velero;
import ejercicio1extra.entidades.Yate;
import java.util.Scanner;

public class Ejercicio1extra {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        Alquiler alquiler = new Alquiler();
        Barco barco = new Barco();
        Velero velero = new Velero();
        BarcoMotor bm = new BarcoMotor();
        Yate yate = new Yate();
        
        alquiler.crearAlquiler();
        
        int opc;
        System.out.println("1-Barco");
        System.out.println("2-Velero");
        System.out.println("3-BarcoMotor");
        System.out.println("4-Yate");
        System.out.println("Elija el barco a alquilar");
        
        opc = leer.nextInt();
        switch (opc) {
            
            case 1:
                barco.crearBarco();
                System.out.println("El precio del alquiler es: $" + (barco.calcularAlquiler() * alquiler.calcularAlquiler(alquiler)));
                alquiler.setBarcoAlquilado(barco);
                System.out.println(alquiler);
                
                break;
            case 2:
                velero.crearVelero();
                System.out.println("El precio del alquiler es: $" + (velero.calcularAlquiler() * alquiler.calcularAlquiler(alquiler)));
                alquiler.setBarcoAlquilado(velero);
                System.out.println(alquiler);                
                
                break;
            case 3:
                bm.crearBarcoMotor();
                System.out.println("El precio del alquiler es: $" + (bm.calcularAlquiler() * alquiler.calcularAlquiler(alquiler)));
                alquiler.setBarcoAlquilado(bm);
                System.out.println(alquiler);
                
                break;
            case 4:
                yate.crearYate();
                System.out.println("El precio del alquiler es: $" + (yate.calcularAlquiler() * alquiler.calcularAlquiler(alquiler)));
                alquiler.setBarcoAlquilado(yate);
                System.out.println(alquiler);
                break;
        }
        
    }
    
}
