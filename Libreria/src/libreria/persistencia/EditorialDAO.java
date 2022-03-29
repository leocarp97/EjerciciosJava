
package libreria.persistencia;

import java.util.List;
import libreria.entidades.Editorial;


public class EditorialDAO extends DAO {
    
     public void guardar(Editorial editorial){
        conectar();
        em.getTransaction().begin();
        em.persist(editorial);
        em.getTransaction().commit();
        desconectar();
    }
    
    public Editorial editar(Editorial editorial){
        conectar();
        em.getTransaction().begin();
        Editorial e = em.merge(editorial);
        em.getTransaction().commit();
        desconectar();
        return e;
    }
    
    public void eliminar(Editorial editorial){
        conectar();
        em.getTransaction().begin();
        em.remove(editorial);
        em.getTransaction().commit();
        desconectar();
    }
   

    public Editorial buscarPorId(String id){
        return em.find(Editorial.class, id);
    }
    
     public Editorial buscarPorNombreEditorial(String nombre){
         return em.find(Editorial.class, nombre);
     }
     
     public List<Editorial> listarTodos() throws Exception {
        List<Editorial> editoriales = em.createQuery("SELECT e FROM Editorial e")
                .getResultList();
        return editoriales;
    }
    
}
