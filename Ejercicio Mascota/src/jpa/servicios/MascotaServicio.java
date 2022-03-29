package jpa.servicios;

import java.util.Date;
import java.util.List;
import jpa.entidades.Mascota;
import jpa.persistencia.MascotaDAO;

public class MascotaServicio {
    
    private final MascotaDAO dao;

    public MascotaServicio() {
        dao = new MascotaDAO();
    }
    
    public void crear(String nombre, String colorDePelo) {
        
        Mascota m = new Mascota();
        
        m.setNombre(nombre);
        m.setColorDePelo(colorDePelo);
        m.setFechaAlta(new Date());
        
        dao.guardar(m);
                
    }
    
    public void modificar(String id, String nombre, String colorDePelo) {
        
        Mascota m = buscarPorId(id);
        m.setNombre(nombre);
        m.setColorDePelo(colorDePelo);
        
        dao.editar(m);
        
    }
    
    public void eliminar(String id) {
        Mascota m = buscarPorId(id);
        
        dao.eliminar(m);
    }
    
    public List<Mascota> listarTodos() {
        return dao.listarTodos();
    }
    
    public Mascota buscarPorId(String id) {
        return dao.buscarPorId(id);
    }
    
    
}
