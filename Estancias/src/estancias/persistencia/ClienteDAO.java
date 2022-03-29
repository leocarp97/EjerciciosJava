package estancias.persistencia;

import estancias.entidades.Cliente;
import java.util.ArrayList;
import java.util.Collection;

public final class ClienteDAO extends DAO {

    public Collection<Cliente> listarCliente() throws Exception {
        try {
            String sql = " SELECT * FROM clientes INNER JOIN estancias USING (id_cliente)"
                    + "INNER JOIN casas USING (id_casa)";

            consultarBase(sql);
            Cliente cliente = null;
            Collection<Cliente> clientes = new ArrayList();
            while (resultado.next()) {
                cliente = new Cliente();
                cliente.setId_cliente(resultado.getInt(1));
                cliente.setNombre(resultado.getString(2));
                cliente.setCalle(resultado.getString(3));
             cliente.setNumero(resultado.getInt("numero"));
                cliente.setCodigo_postal(resultado.getInt("codigo_postal"));
                cliente.setCiudad(resultado.getString("ciudad"));
                cliente.setPais(resultado.getString("pais"));
                cliente.setEmail(resultado.getString("email"));

                clientes.add(cliente);

            }
            desconectarBase();
            return clientes;
        } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
            throw e;
        }
    }

    
       public Collection<Cliente> listarClientesYCasas() throws Exception {
        try {
            String sql = " SELECT c.nombre, c.ciudad, c.pais, ca.* FROM clientes c INNER JOIN estancias e USING (id_cliente)"
                    + "INNER JOIN casas ca USING (id_casa)";

            consultarBase(sql);
            Cliente cliente = null;
            Collection<Cliente> clientes = new ArrayList();
            while (resultado.next()) {
                cliente = new Cliente();
                cliente.setNombre(resultado.getString(1));
                cliente.setCiudad(resultado.getString("ciudad"));
                cliente.setPais(resultado.getString("pais"));
                clientes.add(cliente);
              //  System.out.println(resultado.getInt());
 //System.out.println(resultado.getInt(4));
   //             System.out.println(resultado.getString(5));
                
            }
            desconectarBase();
            return clientes;
        } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
            throw e;
        }
    }
    
    
    
    
    
}
