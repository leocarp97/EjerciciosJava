
package tienda.servicios;

import java.util.Collection;
import java.util.Scanner;
import tienda.entidades.Fabricante;
import tienda.persistencia.FabricanteDAO;


public class FabricanteServicio {
    
      private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
     private FabricanteDAO dao;

    public FabricanteServicio() {
    this.dao = new FabricanteDAO();
    }
    
    
     public void crearFabricante(String nombre, int codigo) throws Exception {

        try {
            //Validamos
            if (codigo == 0) {
                throw new Exception("Ingreso un codigo erroneo");
            }
            if (nombre.contains("@") == true) {
                throw new Exception("El nombre es incorrecto");
            }

            if (nombre.length() > 15) {
                throw new Exception("Ingreso un nombre muy largo");
            }

       
            Fabricante fabricante = new Fabricante();
       fabricante.setNombre(nombre);
       fabricante.setCodigo(codigo);
     
           dao.guardarFabricante(fabricante);
        } catch (Exception e) {
            throw e;
        }
    }

        public Collection<Fabricante> listarFabricantes() throws Exception {
        try {

            Collection<Fabricante> fabricantes = dao.listarFabricante();

            return fabricantes;
        } catch (Exception e) {
            throw e;
        }

    }
     
        public void imprimirProductos() throws Exception {

        try {

            Collection<Fabricante> fabricante = listarFabricantes();

            if (fabricante.isEmpty()) {
                throw new Exception("No existen mascotas para imprimir");
            } else {
                for (Fabricante u : fabricante) {
                    System.out.println(u.toString());
                }
            }
        } catch (Exception e) {
            throw e;
        }
    }
        
     
}
