
package com.libreria.servicios;

import com.libreria.entidades.Autor;
import com.libreria.repositorios.AutorRepositorio;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class AutorServicio {
    
    
    @Autowired
    private AutorRepositorio autorRepositorio;
    
    public Autor crear(String nombre, boolean alta) throws Exception{
        
        validarAutor(nombre);
        
        Autor autor = new Autor();
        
        autor.setNombre(nombre);
        autor.setAlta(alta);
        
        autorRepositorio.save(autor);
        
       return autor;
    }
    
    
    public Autor buscarPorId(String id) throws Exception{
         Optional<Autor> respuesta = autorRepositorio.findById(id);
        
        if (respuesta.isPresent()) {
           return respuesta.get();    
    }else{
            throw new Exception ("No existe el autor buscado");
        }
       } 
    
    public void modificar(String id, String nombre, boolean alta) throws Exception{
        
        validarAutor(nombre);
        
        Optional<Autor> respuesta = autorRepositorio.findById(id);
        
        if (respuesta.isPresent()) {
            Autor autor = respuesta.get();
            
           autor.setNombre(nombre);
           autor.setAlta(alta);
           
           autorRepositorio.save(autor);
        }else{
            throw new Exception("No se encontro el autor buscado");
        }     
    }
     
    public List<Autor>listarAutor(){
        
       return autorRepositorio.findAll();
    }
    
   public void eliminarAutor(String id){
       
       autorRepositorio.deleteById(id);
   } 
    
  
    public void deshabilitar(String id) throws Exception{
      
       Optional<Autor> respuesta =autorRepositorio.findById(id);
       
          if (respuesta.isPresent()) {
            
              Autor autor = respuesta.get();
              autor.setAlta(false);
              
              autorRepositorio.save(autor);
               }else{
              throw new Exception("No se encontro el autor buscado");
          }
         }  
   

     private void validarAutor(String nombre) throws Exception {
        if (nombre==null || nombre.isEmpty()) {
            throw new Exception("El nombre no puede ser nulo");
        }
  
    
}
}
