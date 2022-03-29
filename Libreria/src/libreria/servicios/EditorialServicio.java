
package libreria.servicios;

import java.util.List;
import libreria.entidades.Editorial;
import libreria.persistencia.EditorialDAO;


public class EditorialServicio {
    
      private final EditorialDAO dao;

    public EditorialServicio() {
    dao= new EditorialDAO();
    }
    
    
     public Editorial crear(String nombre, boolean alta) throws Exception {
        
           Editorial e = buscarPorNombre(nombre);
        if (e!=null) {
            throw new Exception("Esta editorial ya existe");
        }
         
        Editorial editorial = new Editorial();
    
     //   editorial.setId(id);
        editorial.setNombre(nombre);
        editorial.setAlta(alta);
        
        dao.guardar(editorial);
        return editorial;
    }
     
     public Editorial editar(String id) throws Exception {
        
        Editorial e = buscarPorId(id);
       
        validarEditorialNull(e);
        
        return dao.editar(e);
        
    }
    
        public void eliminar(String id) throws Exception {
        
        Editorial e = buscarPorId(id);
        
        validarEditorialNull(e);
        
        dao.eliminar(e);
        }
     
     public Editorial buscarPorId(String id) {
     return  dao.buscarPorId(id);
    }
    
     public List<Editorial> listarTodos(){
         try {
            return dao.listarTodos();
         } catch (Exception e) {
             System.out.println(e.getMessage());
             return null;
         }  
     }
     
     public Editorial buscarPorNombre(String nombre){
         return dao.buscarPorNombreEditorial(nombre);
     }
     private void validarEditorialNull(Editorial e) throws Exception {
        if (e == null) {
            throw new Exception("No existe esa editorial");
        }
    
 }
   
}
