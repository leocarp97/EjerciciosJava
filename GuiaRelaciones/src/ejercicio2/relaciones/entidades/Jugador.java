package ejercicio2.relaciones.entidades;

import java.util.Scanner;

public class Jugador {

    private int id;
    private String nombre;
    private boolean mojado;
    private Scanner leer;

    public Jugador(int id, String nombre, boolean mojado) {
        this.id = id;
        this.nombre = nombre;
        this.mojado = mojado;
    }

    public Jugador() {
        leer = new Scanner(System.in).useDelimiter("\n");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isMojado() {
        return mojado;
    }

    public void setMojado(boolean mojado) {
        this.mojado = mojado;
    }

    @Override
    public String toString() {
        return "Jugador{" + "id=" + id + ", nombre=" + nombre + ", mojado=" + mojado;
    }
;
}

//    public Jugador() {
//        jugadores = new ArrayList();
//        leer = new Scanner(System.in).useDelimiter("\n");
//    }
//    public Jugador crearJugador(Juego juego) {
//
//        System.out.println("Ingrese la cantidad de jugadores");
//        int n = leer.nextInt();
//
//        if (n > 6 && n < 1) {
//            n = 6;
//        }
//
//        
//        
//        for (int i = 0; i < n; i++) {
//            
//            Jugador juga = new Jugador((i+1), "Jugador"+(i+1), false); 
//           
//         
//            
//        }
//    
//       
//
//    }
//
//
//
//    public boolean disparo(Revolver r) {
//
//        if (r.mojar()) {
//
//            mojado = true;
//            return true;
//        } else {
//
//            return false;
//        }
//
//    }
//
//}
//}
