package guiapoo.Ejercicio7.principal;

import guiapoo.Ejercicio7.entidades.Persona;
import guiapoo.Ejercicio7.servicios.PersonaServicio;
import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        PersonaServicio ps = new PersonaServicio();

//        Persona p1 = ps.crearPersona();
//        Persona p2 = ps.crearPersona();
//        Persona p3 = ps.crearPersona();
//        Persona p4 = ps.crearPersona();
        Persona p5=null;
//        
//        System.out.println(p1);
//        if ((ps.calcularIMC(p1.getPeso(), p1.getAltura()) == -1)) {
//            System.out.println("Esta debajo de su peso");
//        }
//        if ((ps.calcularIMC(p1.getPeso(), p1.getAltura()) == 0)) {
//            System.out.println("Esta en su peso ideal");
//        }
//        if ((ps.calcularIMC(p1.getPeso(), p1.getAltura()) == 1)) {
//            System.out.println("Tiene sobrepeso");
//        }
//
//        if (ps.esMayorDeEdad(p1.getEdad())) {
//            System.out.println("Es mayor de edad");
//        } else {
//            System.out.println("Es menor de edad");
//        }
//        System.out.println(p2);
//        if ((ps.calcularIMC(p2.getPeso(), p2.getAltura()) == -1)) {
//            System.out.println("Esta debajo de su peso");
//        }
//        if ((ps.calcularIMC(p2.getPeso(), p2.getAltura()) == 0)) {
//            System.out.println("Esta en su peso ideal");
//        }
//
//        if ((ps.calcularIMC(p2.getPeso(), p2.getAltura()) == 1)) {
//            System.out.println("Tiene sobrepeso");
//        }
//
//        if (ps.esMayorDeEdad(p2.getEdad())) {
//            System.out.println("Es mayor de edad");
//        } else {
//            System.out.println("Es menor de edad");
//        }
//        System.out.println(p3);
//        if ((ps.calcularIMC(p3.getPeso(), p3.getAltura()) == -1)) {
//            System.out.println("Esta debajo de su peso");
//        }
//        if ((ps.calcularIMC(p3.getPeso(), p3.getAltura()) == 0)) {
//            System.out.println("Esta en su peso ideal");
//        }
//        if ((ps.calcularIMC(p3.getPeso(), p3.getAltura()) == 1)) {
//            System.out.println("Tiene sobrepeso");
//        }
//
//        if (ps.esMayorDeEdad(p3.getEdad())) {
//            System.out.println("Es mayor de edad");
//        } else {
//            System.out.println("Es menor de edad");
//        }
//        System.out.println(p4);
//
//        if ((ps.calcularIMC(p4.getPeso(), p4.getAltura()) == -1)) {
//            System.out.println("Esta debajo de su peso");
//        }
//        if ((ps.calcularIMC(p4.getPeso(), p4.getAltura()) == 0)) {
//            System.out.println("Esta en su peso ideal");
//        }
//
//        if ((ps.calcularIMC(p4.getPeso(), p4.getAltura()) == 1)) {
//            System.out.println("Tiene sobrepeso");
//        }
//
//        if (ps.esMayorDeEdad(p4.getEdad())) {
//            System.out.println("Es mayor de edad");
//        } else {
//            System.out.println("Es menor de edad");
//        }
//
//        int cont = 0;
//        int cont1 = 0;
//        int cont2 = 0;
//
//        if ((ps.calcularIMC(p1.getPeso(), p1.getAltura()) == -1)) {
//            cont++;
//        }
//        if ((ps.calcularIMC(p1.getPeso(), p1.getAltura()) == 0)) {
//            cont1++;
//        }
//
//        if ((ps.calcularIMC(p1.getPeso(), p1.getAltura()) == 1)) {
//            cont2++;
//        }
//
//        if ((ps.calcularIMC(p2.getPeso(), p2.getAltura()) == -1)) {
//            cont++;
//        }
//        if ((ps.calcularIMC(p2.getPeso(), p2.getAltura()) == 0)) {
//            cont1++;
//        }
//
//        if ((ps.calcularIMC(p2.getPeso(), p2.getAltura()) == 1)) {
//            cont2++;
//        }
//
//        if ((ps.calcularIMC(p3.getPeso(), p3.getAltura()) == -1)) {
//            cont++;
//        }
//        if ((ps.calcularIMC(p3.getPeso(), p3.getAltura()) == 0)) {
//            cont1++;
//        }
//
//        if ((ps.calcularIMC(p3.getPeso(), p3.getAltura()) == 1)) {
//            cont2++;
//        }
//
//        if ((ps.calcularIMC(p4.getPeso(), p4.getAltura()) == -1)) {
//            cont++;
//        }
//        if ((ps.calcularIMC(p4.getPeso(), p4.getAltura()) == 0)) {
//            cont1++;
//        }
//
//        if ((ps.calcularIMC(p4.getPeso(), p4.getAltura()) == 1)) {
//            cont2++;
//        }
//
//        int menor = 0;
//        int mayor = 0;
//
//        if (ps.esMayorDeEdad(p1.getEdad())) {
//            mayor++;
//        } else {
//            menor++;
//
//        }
//        if (ps.esMayorDeEdad(p2.getEdad())) {
//            mayor++;
//        } else {
//            menor++;
//
//        }
//        if (ps.esMayorDeEdad(p3.getEdad())) {
//            mayor++;
//        } else {
//            menor++;
//
//        }
//
//        if (ps.esMayorDeEdad(p4.getEdad())) {
//            mayor++;
//        } else {
//            menor++;
//
//        }
//
//        System.out.println("El porcentaje que estan por debajo de su peso es: " + (cont * 100) / 4 + " %");
//        System.out.println("El procentaje que tienen su peso ideal es: " + (cont1 * 100) / 4 + " %");
//        System.out.println("El porcentaje que tienen sobrepeso es: " + (cont2 * 100) / 4 + " %");
//        System.out.println("El porcentaje de personas mayores de edad es: " + (mayor * 100) / 4 + " %");
//        System.out.println("El porcentaje de personas menores de edad es :" + (menor * 100) / 4 + " %");
//        
//        
    //ps.esMayorDeEdad(p5.getEdad());
        try {
       ps.esMayorDeEdad(p5.getEdad());
       
        } catch (Exception e) {
            System.out.println(e.getMessage());
            
        }
        
        
    }

}
