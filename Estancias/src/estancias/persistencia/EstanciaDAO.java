
package estancias.persistencia;

import estancias.entidades.Estancia;
import java.util.ArrayList;
import java.util.Collection;


public final class EstanciaDAO extends DAO {
  
    
      public void guardarEstancia(Estancia estancia) throws Exception {
        try {
            if (estancia == null) {
                throw new Exception("Debe indicar la estancia");
            }

            String sql = "INSERT INTO estancias (id_estancia, id_cliente, id_casa, nombre_huesped, fecha_desde, fecha_hasta)"
                    + "VALUES ( '" + estancia.getId_estancia() + "' , '" + estancia.getId_cliente() + "' , '" + estancia.getId_casa() + "' , '" + estancia.getNombre_huesped()+ "' , '" + estancia.getFecha_desde() + "' , '" + estancia.getFecha_hasta() +  "' );";

            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarBase();
        }
    }
    
      public Collection<Estancia> listarEstancia() throws Exception {
        try {
            String sql = "SELECT * FROM estancias ";

            consultarBase(sql);
            Estancia estancia = null;
            Collection<Estancia> estancias = new ArrayList();
            while (resultado.next()) {
                estancia = new Estancia();
              
             estancia.setId_estancia(resultado.getInt(1));
             estancia.setId_cliente(resultado.getInt(2));
             estancia.setId_casa(resultado.getInt(3));
             estancia.setNombre_huesped(resultado.getString(4));
             estancia.setFecha_desde(resultado.getString(5));
             estancia.setFecha_hasta(resultado.getString(6));
             
             estancias.add(estancia);
                
            }
            desconectarBase();
            return estancias;
        } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
            throw e;
        }
    }
      
      
      
}
