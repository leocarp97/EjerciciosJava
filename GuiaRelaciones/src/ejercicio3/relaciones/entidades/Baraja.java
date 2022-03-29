package ejercicio3.relaciones.entidades;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Baraja {

    private ArrayList<Carta> cartas;
    private Scanner leer ;
    private  ArrayList<Carta> aux;

    public Baraja() {
        cartas = new ArrayList();
        aux = new ArrayList();
        leer = new Scanner(System.in).useDelimiter("\n");
    }

    public Baraja(ArrayList<Carta> cartas) {
        this.cartas = cartas;
    }

    public ArrayList<Carta> getCartas() {
        return cartas;
    }

    public void setCartas(ArrayList<Carta> cartas) {
        this.cartas = cartas;
    }

    @Override
    public String toString() {
        return "Baraja{" + "cartas=" + cartas + '}';
    }

    public void llenarBaraja() {

        for (int i = 1; i < 13; i++) {

            if (i != 8 && i != 9) {

                cartas.add(new Carta(i, "Espada"));

            }

        }

        for (int i = 1; i < 13; i++) {

            if (i != 8 && i != 9) {

                cartas.add(new Carta(i, "Copa"));

            }

        }

        for (int i = 1; i < 13; i++) {

            if (i != 8 && i != 9) {

                cartas.add(new Carta(i, "Basto"));

            }

        }

        for (int i = 1; i < 13; i++) {

            if (i != 8 && i != 9) {

                cartas.add(new Carta(i, "Oro"));

            }

        }

    }

    public void barajar() {

        Collections.shuffle(cartas);

        for (Carta carta : cartas) {
            System.out.println(carta);
        }

    }

    public void siguienteCarta() {

        int posicionCarta = 0;

        if (cartas.size()<=0) {
            System.out.println("No hay mas cartas");
        } else {
            posicionCarta = posicionCarta + 1;
        }
        System.out.println("La siguiente carta es: " + cartas.get(posicionCarta));
     
    aux.add(cartas.get(posicionCarta));
         cartas.remove(cartas.get(posicionCarta));
    }

    public void cartasDisponible() {

        System.out.println(cartas.size());
  
    }
    
    
   public void darCartas(){
       
       System.out.println("Ingrese el numero de cartas a dar");
      int n = leer.nextInt();
   int cont=0;
       for (int i = 0; i < n; i++) {
           
           if (n>cartas.size()) {
              cont++;
               }else{
           
           System.out.println(cartas.get(i));
             aux.add(cartas.get(i));
           cartas.remove(cartas.get(i));
               
   
       }
   
   } 
       if (cont>0) {
           System.out.println("No hay mas cartas para repartir");
       }
      
   }
   public void cartasMonton(){
       
       for (Carta carta : aux) {
           System.out.println(carta);
       }
       
   }

   public void mostrarBaraja(){
       
       for (Carta aux : cartas) {
           System.out.println(aux);
       }
 
       
   }
   
}


