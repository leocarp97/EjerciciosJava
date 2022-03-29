
package estancias.servicios;

import estancias.entidades.Familia;
import estancias.persistencia.FamiliaDAO;
import java.util.Collection;
import java.util.Scanner;

public class FamiliaServicio {
 
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private FamiliaDAO dao;

    public FamiliaServicio() {
        this.dao = new FamiliaDAO();
    }

    
     public Collection<Familia> listarFamilia() throws Exception {
        try {

            Collection<Familia> familias = dao.listarFamilia();

            return familias;
        } catch (Exception e) {
            throw e;
        }

    }
    
      public void imprimirFamilias() throws Exception {

        try {

            Collection<Familia> familias = listarFamilia();

            if (familias.isEmpty()) {
                throw new Exception("No existen familias para imprimir");
            } else {
                for (Familia u : familias) {
                    System.out.println(u.toString());
                }
            }
        } catch (Exception e) {
            throw e;
        }
    }
     
        public Collection<Familia> listarFamiliaPorMail() throws Exception {
        try {

            Collection<Familia> familias = dao.listarPorEmail();

            return familias;
        } catch (Exception e) {
            throw e;
        }

    } 
      
          public void imprimirFamiliasPorMail() throws Exception {

        try {

            Collection<Familia> familias = listarFamiliaPorMail();

            if (familias.isEmpty()) {
                throw new Exception("No existen familias para imprimir");
            } else {
                for (Familia u : familias) {
                    System.out.println(u.toString());
                }
            }
        } catch (Exception e) {
            throw e;
        }
    } 
        
}
