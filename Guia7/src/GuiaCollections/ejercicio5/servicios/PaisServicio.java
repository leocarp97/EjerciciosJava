
package GuiaCollections.ejercicio5.servicios;

import GuiaCollections.ejercicio5.entidades.Pais;
import GuiaCollections.ejercicio5.utilidades.Comparadores;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;


public class PaisServicio {
    
    Scanner leer ;
     HashSet<String> pais;
ArrayList<Pais> paisLista;
    public PaisServicio() {
   
        leer = new Scanner(System.in).useDelimiter("\n");
      pais = new HashSet();
    paisLista=new ArrayList(pais);
    }
    
  public Pais crearPais(){
      
      Pais p = new Pais();
      
       System.out.println("Ingrese el nombre del pais");
       String nombrePais=leer.next();
       
     p.setNombrePais(nombrePais);
      
          return p;
  }   
    
  
  public void agregarPais(Pais p){
      
   pais.add(p.getNombrePais());
      
  }
  
    public void mostrarPais(){
        
        for (String aux : pais) {
            System.out.println(aux);
        }
        
    }
    
    
   public void ordenarAlfabeticamente(){
       
       Collections.sort(paisLista, Comparadores.ordenarAlfabeticamente);
       
       
       for (String aux : pais) {
           System.out.println(aux);
       }
       
       
   } 
   
  public void eliminarPais(){
      
       
        Iterator<String> it = pais.iterator();
        
        int cont=0;
        System.out.println("Ingrese el pais a eliminar ");
        String p=leer.next();
        
        while (it.hasNext()) {
            String aux = it.next();
            
            if (aux.equalsIgnoreCase(p)) {
                it.remove();
                cont++;
            }
        }
            if (cont>0) {
                for (String aux : pais) {
                    System.out.println(aux);
                }
                
            }else{
                System.out.println("El pais no se encuentra en el conjunto");
                
                for (String aux : pais) {
                    System.out.println(aux);
                }
            }
      
  } 
   
}
