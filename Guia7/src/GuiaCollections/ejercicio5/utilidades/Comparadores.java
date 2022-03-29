
package GuiaCollections.ejercicio5.utilidades;

import GuiaCollections.ejercicio5.entidades.Pais;
import java.util.Comparator;

public class Comparadores {
    
    public static Comparator<Pais> ordenarAlfabeticamente= new Comparator<Pais> () {
        @Override
        public int compare(Pais t, Pais t1) {
          
           return t.getNombrePais().compareTo(t1.getNombrePais());
            
        }
    };
            
            
            
            
            
            
            
            
            
    
    
}
