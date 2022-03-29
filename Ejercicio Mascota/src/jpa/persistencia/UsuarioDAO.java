package jpa.persistencia;

import java.util.ArrayList;
import java.util.List;
import jpa.entidades.Usuario;

public class UsuarioDAO extends DAO{

    public void guardar(Usuario objeto){
        conectar();
        em.getTransaction().begin();
        em.persist(objeto);
        em.getTransaction().commit();
        desconectar();
    }
    
    public Usuario editar(Usuario objeto){
        conectar();
        em.getTransaction().begin();
        Usuario u = em.merge(objeto);
        em.getTransaction().commit();
        desconectar();
        return u;
    }
    
    public void eliminar(Usuario objeto){
        conectar();
        em.getTransaction().begin();
        em.remove(objeto);
        em.getTransaction().commit();
        desconectar();
    }

    public Usuario buscarPorId(String id) {
        return em.find(Usuario.class, id);
    }
    
    public List<Usuario> listarTodos() {
        List<Usuario> usuarios = em.createQuery("SELECT u FROM Usuario u").getResultList();
        return usuarios;
    }
    
}
