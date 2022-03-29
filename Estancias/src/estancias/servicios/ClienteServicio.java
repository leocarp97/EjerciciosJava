
package estancias.servicios;

import estancias.entidades.Cliente;
import estancias.persistencia.ClienteDAO;
import java.util.Collection;

public class ClienteServicio {

 
    private ClienteDAO dao;
     public ClienteServicio() {
    this.dao=new ClienteDAO();
    }

     
      
     public Collection<Cliente> listarCliente() throws Exception {
        try {

            Collection<Cliente> clientes = dao.listarCliente();

            return clientes;
        } catch (Exception e) {
            throw e;
        }

    }
     
       public Collection<Cliente> listarClienteYCasa() throws Exception {
        try {

            Collection<Cliente> clientes = dao.listarClientesYCasas();

            return clientes;
        } catch (Exception e) {
            throw e;
        }

    }
    
      public void imprimirClientes() throws Exception {

        try {

            Collection<Cliente> clientes = listarCliente();

            if (clientes.isEmpty()) {
                throw new Exception("No existen familias para imprimir");
            } else {
                for (Cliente u : clientes) {
                    System.out.println(u.toString());
                }
            }
        } catch (Exception e) {
            throw e;
        }
    }
     
        public void imprimirClientesYCasas() throws Exception {

        try {

            Collection<Cliente> clientes = listarClienteYCasa();

            if (clientes.isEmpty()) {
                throw new Exception("No existen familias para imprimir");
            } else {
                for (Cliente u : clientes) {
                    System.out.println(u.toString());
                }
            }
        } catch (Exception e) {
            throw e;
        }
    }
     
     
}

