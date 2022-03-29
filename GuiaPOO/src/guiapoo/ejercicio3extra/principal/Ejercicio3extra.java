package guiapoo.ejercicio3extra.principal;

import guiapoo.ejercicio3extra.entidades.Raiz;
import guiapoo.ejercicio3extra.servicios.RaizServicio;
import java.util.Scanner;

public class Ejercicio3extra {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        RaizServicio rs = new RaizServicio();

        Raiz raiz = rs.crearRaiz();
        double resul;

        int opc;

        do {
            System.out.println("MENU");
            System.out.println("1-Calcular discriminante");
            System.out.println("2-Tiene raices?");
            System.out.println("3-Tiene raiz?");
            System.out.println("4-Obtener raices");
            System.out.println("5-Obtener raiz");
            System.out.println("6-Calcular");
            opc = leer.nextInt();
            
        switch  (opc){
            
            case 1:  resul = rs.getDiscriminante(raiz.getA(), raiz.getB(), raiz.getC());
                System.out.println(resul);
                break;
            case 2: resul = rs.getDiscriminante(raiz.getA(), raiz.getB(), raiz.getC());
                rs.tieneRaices(resul);
                    break;
            case 3: resul = rs.getDiscriminante(raiz.getA(), raiz.getB(), raiz.getC());
                  rs.tieneRaiz(resul);
                  break;
            case 4:resul = rs.getDiscriminante(raiz.getA(), raiz.getB(), raiz.getC());
                 rs.obtenerRaices(resul, raiz.getA(), raiz.getB(), raiz.getC());
                 break;
            case 5:resul = rs.getDiscriminante(raiz.getA(), raiz.getB(), raiz.getC());
                 rs.obtenerRaiz(resul, raiz.getA(), raiz.getB(), raiz.getC());
                 break;
            case 6: 
                break;
        }    
      
            
        } while (opc < 7);

       
    }

}
