
package com.libreria.servicios;

import com.libreria.entidades.Editorial;
import com.libreria.repositorios.EditorialRepositorio;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class EditorialServicio {
    
     
    @Autowired
    private EditorialRepositorio editorialRepositorio;
    
    public Editorial crear(String nombre, boolean alta) throws Exception{
        
        validarEditorial(nombre);
        
        Editorial editorial = new Editorial();
        
        editorial.setNombre(nombre);
        editorial.setAlta(alta);
        
        editorialRepositorio.save(editorial);
        
       return editorial;
    }
    
     public Editorial buscarPorId(String id) throws Exception{
         Optional<Editorial> respuesta = editorialRepositorio.findById(id);
        
        if (respuesta.isPresent()) {
           return respuesta.get();    
    }else{
            throw new Exception ("No existe la editorial buscada");
        }
       } 
    
    
    
    public void modificar(String id, String nombre, boolean alta) throws Exception{
        
        validarEditorial(nombre);
        
        Optional<Editorial> respuesta = editorialRepositorio.findById(id);
        
        if (respuesta.isPresent()) {
            Editorial editorial = respuesta.get();
            
           editorial.setNombre(nombre);
           editorial.setAlta(alta);
           
           editorialRepositorio.save(editorial);
        }else{
            throw new Exception("No se encontro el editorial buscado");
        }     
    }
     
    public List<Editorial>listarEditorial(){
        
       return editorialRepositorio.findAll();
    }
    
   public void eliminarEditorial(String id){
       
       editorialRepositorio.deleteById(id);
   } 
    
  
    public void deshabilitar(String id) throws Exception{
      
       Optional<Editorial> respuesta =editorialRepositorio.findById(id);
       
          if (respuesta.isPresent()) {
            
              Editorial editorial = respuesta.get();
              editorial.setAlta(false);
              
              editorialRepositorio.save(editorial);
               }else{
              throw new Exception("No se encontro el editorial buscado");
          }
         }  
   

     private void validarEditorial(String nombre) throws Exception {
        if (nombre==null || nombre.isEmpty()) {
            throw new Exception("El nombre de la editorial no puede ser nula");
        }
  
    
}
}

    
   
