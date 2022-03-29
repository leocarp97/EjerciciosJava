
package tienda.persistencia;

import java.util.ArrayList;
import java.util.Collection;
import tienda.entidades.Fabricante;

public final  class FabricanteDAO extends DAO {
    
    
    public void guardarFabricante(Fabricante fabricante) throws Exception {
        try {
            if (fabricante == null) {
                throw new Exception("Debe indicar el fabricante");
            }

            String sql = "INSERT INTO Fabricante (nombre, codigo)"
                    + "VALUES ( '" + fabricante.getNombre() + "' , '" + fabricante.getCodigo() + "' );";

            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarBase();
        }
    }
    
    public Collection<Fabricante> listarFabricante() throws Exception {
        try {
            String sql = "SELECT * FROM Fabricante ";

            consultarBase(sql);
            Fabricante fabricante = null;
            Collection<Fabricante> fabricantes = new ArrayList();
            while (resultado.next()) {
                fabricante = new Fabricante();
               fabricante.setNombre(resultado.getString("Nombre"));
               fabricante.setCodigo(resultado.getInt("Codigo"));
               
               fabricantes.add(fabricante);
            }
            desconectarBase();
            return fabricantes;
        } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
            throw e;
        }
    }
    
    
}
