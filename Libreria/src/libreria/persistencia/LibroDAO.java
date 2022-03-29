
package libreria.persistencia;

import java.util.List;




import libreria.entidades.Libro;


public class LibroDAO extends DAO {
    
       public void guardar(Libro libro){
        conectar();
        em.getTransaction().begin();
        em.persist(libro);
        em.getTransaction().commit();
        desconectar();
    }
    
    public Libro editar(Libro libro){
        conectar();
        em.getTransaction().begin();
        Libro l = em.merge(libro);
        em.getTransaction().commit();
        desconectar();
        return l;
    }
    
    public void eliminar(Libro libro){
        conectar();
        em.getTransaction().begin();
        em.remove(libro);
        em.getTransaction().commit();
        desconectar();
        //if (!EM.contains(objeto)) {
        //    objeto = EM.merge(objeto);
        //}

        
    }
   
     public Libro buscarPorIsbn(String isbn) {
        return em.find(Libro.class, isbn);
    }
    
     public Libro buscarPorTitulo(String titulo){ 
         Libro libro = (Libro) em.createQuery("SELECT l FROM Libro l WHERE l.titulo LIKE :titulo")
                 .setParameter("titulo", titulo).getSingleResult();
         return libro;
     }

     public Libro buscarPorNombreAutor(String nombre){
         try {
                
      Libro libro = (Libro)em.createQuery("SELECT l FROM Libro l WHERE l.autor.nombre LIKE :nombre")
               .setParameter("nombre", nombre)
          .getSingleResult();
        return libro;
   
         } catch (Exception e) {
            e.printStackTrace();
             return null;
             
         }
         
      }
     
     public Libro buscarPorNombreEditorial(String nombre){
         Libro libro = (Libro) em.createQuery("SELECT l FROM Libro l WHERE l.editorial.nombre LIKE :nombre ")
                 .setParameter("nombre", nombre).getSingleResult();
         return libro;
     }
     
       public List<Libro> listarTodos() {
           try {
                List<Libro> libros = em.createQuery("SELECT l FROM Libro l").getResultList();
        return libros;
           } catch (Exception e) {
            e.printStackTrace();
               return null;
           }
         
    }
}

