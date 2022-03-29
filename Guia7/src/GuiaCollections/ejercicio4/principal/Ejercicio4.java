package GuiaCollections.ejercicio4.principal;

import GuiaCollections.ejercicio4.entidades.Pelicula;
import GuiaCollections.ejercicio4.servicios.PeliculaServicio;
import java.util.Scanner;

public class Ejercicio4 {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        String opc;
        
        PeliculaServicio ps = new PeliculaServicio();
        Pelicula peli = new Pelicula();
        do {
            
            peli = ps.crearPelicula();
            
            ps.agregarPelicula(peli);
            
            System.out.println("Desea crear otra pelicula? S/N");
            opc = leer.next();
            
        } while (opc.equalsIgnoreCase("s"));
        
        System.out.println("Las peliculas ingresadas por el usuarion son: ");
        ps.mostrarPeliculas(peli);
        
        System.out.println("Las peliculas con duracion de mas de 1 hora son: ");
        
        ps.mostrarPeliculasMayorDuracion(peli);
           
        System.out.println("Peliculas de mayor duracion a menor");
        
        ps.peliculasMayorAMenor(peli);
        
        System.out.println("Peliculas de menor duracion a mayor");
        
        ps.peliculasMenorAMayor(peli);
        
        System.out.println("Peliculas ordenadas por titulo alfabeticamente");
        
        ps.peliculasOrdenadasPorTitulo(peli);
        
        System.out.println("Peliculas ordenadas por director alfabeticamente");
        
        ps.peliculasOrdenasPorDirector(peli);
        
    }
    
}
