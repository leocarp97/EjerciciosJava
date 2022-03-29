package jpa.persistencia;

import java.util.List;
import jpa.entidades.Mascota;

public final class MascotaDAO extends DAO {
    
    public void guardar(Mascota objeto){
        conectar();
        em.getTransaction().begin();
        em.persist(objeto);
        em.getTransaction().commit();
        desconectar();
    }
    
    public Mascota editar(Mascota objeto){
        conectar();
        em.getTransaction().begin();
        Mascota u = em.merge(objeto);
        em.getTransaction().commit();
        desconectar();
        return u;
    }
    
    public void eliminar(Mascota objeto){
        conectar();
        em.getTransaction().begin();
        em.remove(objeto);
        em.getTransaction().commit();
        desconectar();
    }
    
    public Mascota buscarPorId(String id) {
        return em.find(Mascota.class, id);
    }
    
    public Mascota buscarPorId2(String id) {
        Mascota m = (Mascota) em.createQuery("SELECT m FROM Mascota m WHERE m.id LIKE :id")
                .setParameter("id", id)
                .getSingleResult();
        
        return m;
    }
    
    public List<Mascota> listarTodos() {
        return em.createQuery("SELECT m FROM Mascota m").getResultList();
    }
    
    public List<Mascota> listarPorNombre(String nombre) {
        return em.createQuery("SELECT m FROM Mascota m WHERE m.nombre LIKE :nombre AND m.colorDePelo LIKE :color")
                .setParameter("nombre", "%" + nombre + "%")
                .setParameter("color", "gris")
                .getResultList();
    }
    
}

