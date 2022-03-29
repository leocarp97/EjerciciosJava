
package libreria.servicios;

import java.util.List;
import libreria.entidades.Autor;
import libreria.persistencia.AutorDAO;


public class AutorServicio {
    
     private final AutorDAO dao;

    public AutorServicio() {
    dao= new AutorDAO();
    }
    
     public Autor crear( String nombre, boolean alta) throws Exception {
        
           Autor a = buscarPorNombre(nombre);
        if (a!=null) {
            throw new Exception("Este autor ya existe");
        }
         
        Autor autor = new Autor();
        
      //autor.setId(id);
      autor.setNombre(nombre);
        autor.setAlta(alta);
        
        dao.guardar(autor);
      return autor;
    }
     
     public Autor editar(String id) throws Exception {
        
        Autor a = buscarPorId(id);
       
        validarAutorNull(a);
        
        return dao.editar(a);
        
    }
    
        public void eliminar(String id) throws Exception {
        
        Autor a = buscarPorId(id);
        
        validarAutorNull(a);
        
        dao.eliminar(a);
        }
     
     public Autor buscarPorNombre(String nombre) {
     return  dao.buscarPorNombreAutor(nombre);
    }
    
       public Autor buscarPorId(String id) {
     return  dao.buscarPorId(id);
    }
    
      public List<Autor> ListarTodos(){
          try {
              return dao.listarTodos();
          } catch (Exception e) {
              System.out.println(e.getMessage());
            return null;
          }
      } 
       
     
     private void validarAutorNull(Autor a) throws Exception {
        if (a == null) {
            throw new Exception("No existe ese libro");
        }
    
    
}    
}
