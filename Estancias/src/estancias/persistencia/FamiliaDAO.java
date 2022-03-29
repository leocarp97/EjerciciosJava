
package estancias.persistencia;

import estancias.entidades.Familia;
import java.util.ArrayList;
import java.util.Collection;

public final class FamiliaDAO extends DAO {
    
    
    
    public Collection<Familia> listarFamilia() throws Exception {
        try {
            String sql = "SELECT * FROM Familias WHERE num_hijos>=3 AND edad_maxima<10 ";

            consultarBase(sql);
            Familia familia = null;
            Collection<Familia> familias = new ArrayList();
            while (resultado.next()) {
                familia = new Familia();
                familia.setId(resultado.getInt(1));
                familia.setNombre(resultado.getString(2));
                familia.setEdad_minima(resultado.getInt(3));
                familia.setEdad_maxima(resultado.getInt(4));
                familia.setNum_hijos(resultado.getInt(5));
                familia.setEmail(resultado.getString(6));
            familias.add(familia);
            }
            desconectarBase();
            return familias;
        } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
            throw e;
        }
    }
    
        public Collection<Familia> listarPorEmail() throws Exception {
        try {
        
            String sql = "SELECT * FROM Familias WHERE email LIKE '%hotmail%' ";

            consultarBase(sql);
            Familia familia = null;
            Collection<Familia> familias = new ArrayList();
            while (resultado.next()) {
                familia = new Familia();
                familia.setId(resultado.getInt(1));
                familia.setNombre(resultado.getString(2));
                familia.setEdad_minima(resultado.getInt(3));
                familia.setEdad_maxima(resultado.getInt(4));
                familia.setNum_hijos(resultado.getInt(5));
                familia.setEmail(resultado.getString(6));
            familias.add(familia);
            }
            desconectarBase();
            return familias;
        } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
            throw e;
        }
    }
    
    
    
    
}
