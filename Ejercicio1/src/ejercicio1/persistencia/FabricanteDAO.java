package ejercicio1.persistencia;

import ejercicio1.entidades.Fabricante;

public class FabricanteDAO extends DAO {

    public void crearFabricante(Fabricante fabricante) throws Exception {
        
        try {
            
            String sql = "INSERT INTO fabricante (nombre) VALUES (" + fabricante.getCodigo() + ", '" + fabricante.getNombre() + "')";
            
            insertarModificarEliminar(sql);
            
        } catch (Exception e) {
            throw e;
        }
        
    }
    
    public Fabricante buscarPorCodigo(int codigo) throws Exception {
        
        try {
        
            String sql = "SELECT * FROM fabricante WHERE codigo = " + codigo;
            
            consultarBase(sql);
            
            Fabricante f = null;
            
            while (resultado.next()) {                
                f = new Fabricante();
                f.setCodigo(resultado.getInt(1));
                f.setNombre(resultado.getString(2));
            }
            
            return f;
            
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarBase();
        }
        
    }
    
}