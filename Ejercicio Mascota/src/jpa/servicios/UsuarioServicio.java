package jpa.servicios;

import java.util.List;
import jpa.entidades.Usuario;
import jpa.persistencia.UsuarioDAO;

public class UsuarioServicio {

    private UsuarioDAO dao;

    public UsuarioServicio() {
        dao = new UsuarioDAO();
    }
    
    public void crear(String nombre, String apellido, String idMascota) {
        Usuario usuario = new Usuario();
        
        //buscar por id la mascota
        
        usuario.setNombre(nombre);
        usuario.setApellido(apellido);
        
        dao.guardar(usuario);
        
    }
    
    public Usuario editar(String id) throws Exception {
        
        Usuario u = buscarPorId(id);
        
        validarUsuarioNull(u);
        
        return dao.editar(u);
        
    }
    
    public void eliminar(String id) throws Exception {
        
        Usuario u = buscarPorId(id);
        
        validarUsuarioNull(u);
        
        dao.eliminar(u);
        
    }
    
    public Usuario buscarPorId(String id) {
        return dao.buscarPorId(id);
    }
    
    public List<Usuario> listarTodos() {
        return dao.listarTodos();
    }
    
    private void validarUsuarioNull(Usuario u) throws Exception {
        if (u == null) {
            throw new Exception("No existe ese usuario");
        }
    }
}
