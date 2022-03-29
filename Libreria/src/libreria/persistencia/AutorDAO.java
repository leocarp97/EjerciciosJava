
package libreria.persistencia;


import java.util.List;
import libreria.entidades.Autor;

public class AutorDAO extends DAO {
    
    
     public void guardar(Autor autor){
        conectar();
        em.getTransaction().begin();
        em.persist(autor);
        em.getTransaction().commit();
        desconectar();
    }
    
    public Autor editar(Autor autor){
        conectar();
        em.getTransaction().begin();
        Autor a = em.merge(autor);
        em.getTransaction().commit();
        desconectar();
        return a;
    }
    
    public void eliminar(Autor autor){
        conectar();
        em.getTransaction().begin();
        em.remove(autor);
        em.getTransaction().commit();
        desconectar();
    }
   

    public Autor buscarPorId(String id){
       
       return em.find(Autor.class, id); 
    }
    
     public Autor buscarPorNombreAutor(String nombre){
        Autor autor = (Autor) em.createQuery("SELECT a FROM Autor a WHERE a.nombre LIKE :nombre")
                .setParameter("nombre", nombre).getSingleResult();
        return autor;
         
     }
     
      public List<Autor> listarTodos() throws Exception {
        List<Autor> autores = em.createQuery("SELECT a FROM Autor a")
                .getResultList();
        return autores;
    }
  
}