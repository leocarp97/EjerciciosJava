
package ejercicio3.principal;

import ejercicio3.relaciones.entidades.Baraja;
import ejercicio3.relaciones.entidades.Carta;
import java.util.Scanner;


public class Ejercicio3 {

 
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
     Carta carta = new Carta ();
     
     Baraja baraja = new Baraja();
     
     int n;
     
     
     baraja.llenarBaraja();
        do {
            System.out.println("MENU");
            System.out.println("1-Barajar");
            System.out.println("2-Siguiente Carta");
            System.out.println("3-Cartas disponibles");
            System.out.println("4-Dar cartas");
            System.out.println("5-Mostrar cartas que han salido");
            System.out.println("6-Mostrar baraja");
            System.out.println("7-Salir");
            n=leer.nextInt();
            switch  (n){
                
                case 1: 
                       baraja.barajar();
                       break;
                case 2:
                       baraja.siguienteCarta();
                       break;
                case 3:
                     baraja.cartasDisponible();
                     break;
                case 4:
                      baraja.darCartas();
                      break;
                case 5:
                    baraja.cartasMonton();
                    break;
                case 6:
                      baraja.mostrarBaraja();
                      break;
                       
            }
            
          
        } while (n<7);
     
    }
    
}
