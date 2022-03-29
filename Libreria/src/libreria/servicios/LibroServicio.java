
package libreria.servicios;

import java.util.List;
import java.util.TreeSet;
import libreria.entidades.Autor;
import libreria.entidades.Editorial;
import libreria.entidades.Libro;
import libreria.persistencia.LibroDAO;


public class LibroServicio {
    
    private final LibroDAO dao;

    public LibroServicio() {
    dao= new LibroDAO();
    }
    
    public Libro crear(String titulo, Integer anio, Integer ejemplares,Integer ejemplaresPrestados,Integer ejemplaresRestantes, boolean alta, Autor autor, Editorial editorial) throws Exception {
        
        Libro l = buscarPorIsbn(titulo);
        if (l!=null) {
            throw new Exception("Este libro ya existe");
        }
        
        Libro libro = new Libro();
       
        
        libro.setTitulo(titulo);
        libro.setAnio(anio);
        libro.setEjemplares(ejemplares);
        libro.setEjemplaresPrestados(ejemplaresPrestados);
        libro.setEjemplaresRestantes(ejemplaresRestantes);
        libro.setAlta(alta);
       
       libro.setAutor(autor);
       libro.setEditorial(editorial);
        
        dao.guardar(libro);
        
        return libro;
        
    }
     
     public Libro editar(String isbn) throws Exception {
        
        Libro l = buscarPorIsbn(isbn);
        
        validarLibroNull(l);
        
        return dao.editar(l);
        
    }
    
        public void eliminar(String isbn) throws Exception {
        
        Libro l = buscarPorIsbn(isbn);
        
        validarLibroNull(l);
        
        dao.eliminar(l);
        }
     
         public List<Libro> listarLibros() {
        try {
            return dao.listarTodos();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
        
        
     public Libro buscarPorIsbn(String isbn) {
     return  dao.buscarPorIsbn(isbn);
    }
    
       public Libro buscarPorTitulo(String titulo) {
     return  dao.buscarPorTitulo(titulo);
    }
     
      public Libro buscarPorNombreAutor(String nombre){
          return dao.buscarPorNombreAutor(nombre);
      }
      
      public Libro buscarPorNombreEditorial(String nombre){
          return dao.buscarPorNombreEditorial(nombre);
      }
       
     private void validarLibroNull(Libro l) throws Exception {
        if (l == null) {
            throw new Exception("No existe ese libro");
        }
     
     
}
}