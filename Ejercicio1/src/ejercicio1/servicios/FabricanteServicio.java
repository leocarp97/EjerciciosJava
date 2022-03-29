package ejercicio1.servicios;

import ejercicio1.entidades.Fabricante;
import ejercicio1.persistencia.FabricanteDAO;

public class FabricanteServicio {
    
    private final FabricanteDAO dao;

    public FabricanteServicio() {
        dao = new FabricanteDAO();
    }
    
    public void crearFabricante(int codigo, String nombre) throws Exception {
        
        validar(codigo, nombre);
        
        Fabricante f = new Fabricante(codigo, nombre);
        
        dao.crearFabricante(f);
        
        System.out.println("Se agregó el fabricante correctamente :)");
    }
    
    public Fabricante buscarPorCodigo(int codigo) throws Exception {
        return dao.buscarPorCodigo(codigo);
    }
    
    private void validar(int codigo, String nombre) throws Exception {
        
        if (codigo < 0) {
            throw new Exception("Código inválido.");
        }
        
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new Exception("Debe indicar un nombre.");
        }
        
        Fabricante f = buscarPorCodigo(codigo);
        
        if (f != null) {
            throw new Exception("Ya existe un fabricante con el código " + codigo);
        }
        
    }
    
}
