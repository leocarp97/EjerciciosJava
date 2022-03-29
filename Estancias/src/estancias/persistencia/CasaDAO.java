
package estancias.persistencia;

import estancias.entidades.Casa;
import estancias.entidades.Comentario;
import java.util.ArrayList;
import java.util.Collection;

public final class CasaDAO extends DAO {
    
    
    public Collection<Casa> listarCasas() throws Exception{
        
        try {
            
            String sql = "SELECT * FROM casas WHERE fecha_desde LIKE '2020-08-01' AND fecha_hasta LIKE '2020-08-31' ";
            
                 consultarBase(sql);
                 Casa casa =null;
                 
                 Collection<Casa> casas= new ArrayList();
            while (resultado.next()) {
                casa = new Casa();
               casa.setId_casa(resultado.getInt(1));
               casa.setCalle(resultado.getString(2));
               casa.setNumero(resultado.getInt(3));
               casa.setCodigo_postal(resultado.getInt(4));
               casa.setCiudad(resultado.getString(5));
               casa.setPais(resultado.getString(6));
               casa.setFecha_desde(resultado.getString(7));
               casa.setFecha_hasta(resultado.getString(8));
               casa.setTiempo_minimo(resultado.getInt(9));
               casa.setTiempo_maximo(resultado.getInt(10));
               casa.setPrecio_habitacion(resultado.getDouble(11));
               casa.setTipo_vivienda(resultado.getString(12));
               
               casas.add(casa);
               
            }
            desconectarBase();
            return casas;
            
        } 
        catch (Exception e) {
 e.printStackTrace();
throw e;
}
     }    
    
     
      public Collection<Casa> listarPorPrecio() throws Exception {
        try {
            String sql = "SELECT precio_habitacion+(precio_habitacion*0.5), id_casa FROM casas WHERE Pais='Reino Unido' ;";

            consultarBase(sql);

            Casa casa = null;
            Collection<Casa> casas = new ArrayList();
            while (resultado.next()) {
                casa = new Casa();
               // System.out.print(resultado.getDouble(1));
               // System.out.print(" ");
               // System.out.println(resultado.getInt("id_casa"));
        casa.setPrecio_habitacion(resultado.getDouble(1));
        casa.setId_casa(resultado.getInt(2));
                casas.add(casa);
            }
            desconectarBase();
            return casas;
        } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
            throw e;
        }
    }
    
      
        
      public Collection<Casa> listarPorPais() throws Exception {
        try {
            String sql = "SELECT count(id_casa), pais FROM casas GROUP BY pais ;";

            consultarBase(sql);

            Casa casa = null;
            Collection<Casa> casas = new ArrayList();
            while (resultado.next()) {
                casa = new Casa();
                System.out.print(resultado.getInt("count(id_casa)"));
                System.out.print(" ");
                System.out.println(resultado.getString("pais"));
       // casa.setId_casa(resultado.getInt("count(id_casa)"));
        // casa.setPais(resultado.getString(2));
                casas.add(casa);
            }
            desconectarBase();
            return casas;
        } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
            throw e;
        }
    }
    
          public Collection<Casa> listarPorComentario() throws Exception {
        try {
            String sql = "SELECT * FROM casas INNER JOIN comentarios USING(id_casa) WHERE comentario LIKE '%limpia%' ;";

            consultarBase(sql);

            Casa casa = null;
            Collection<Casa> casas = new ArrayList();
            while (resultado.next()) {
           casa = new Casa();
               casa.setId_casa(resultado.getInt(1));
               casa.setCalle(resultado.getString(2));
               casa.setNumero(resultado.getInt(3));
               casa.setCodigo_postal(resultado.getInt(4));
               casa.setCiudad(resultado.getString(5));
               casa.setPais(resultado.getString(6));
               casa.setFecha_desde(resultado.getString(7));
               casa.setFecha_hasta(resultado.getString(8));
               casa.setTiempo_minimo(resultado.getInt(9));
               casa.setTiempo_maximo(resultado.getInt(10));
               casa.setPrecio_habitacion(resultado.getDouble(11));
               casa.setTipo_vivienda(resultado.getString(12));
               Comentario comen= new Comentario();
               comen.setComentario(resultado.getString("comentario"));
               // System.out.println(resultado.getString("comentario"));
              casa.setCome(comen);
               casas.add(casa);
            
            }
            desconectarBase();
            return casas;
        } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
            throw e;
        }
    }
    
      
      
    
        }   
    

