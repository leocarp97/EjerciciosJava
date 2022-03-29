
package estancias.servicios;

import estancias.entidades.Estancia;
import estancias.persistencia.EstanciaDAO;
import java.util.Collection;

public class EstanciaServicio {
    
      private EstanciaDAO dao;

    public EstanciaServicio() {
        this.dao = new EstanciaDAO();
    }
    
     public void crearProducto(int id_estancia, int id_cliente, int id_casa, String nombre_huesped, String fecha_desde, String fecha_hasta) throws Exception {

        try {
            //Validamos
            if (id_estancia == 0) {
                throw new Exception("Ingreso un codigo erroneo");
            }
            if (nombre_huesped.contains("@") == true) {
                throw new Exception("El nombre es incorrecto");
            }

            if (nombre_huesped.length() > 15) {
                throw new Exception("Ingreso un nombre muy largo");
            }

            Estancia estancia = new Estancia();
       
            estancia.setId_estancia(id_estancia);
            estancia.setId_cliente(id_cliente);
            estancia.setId_casa(id_casa);
            estancia.setNombre_huesped(nombre_huesped);
            estancia.setFecha_desde(fecha_desde);
            estancia.setFecha_hasta(fecha_hasta);
            dao.guardarEstancia(estancia);
        } catch (Exception e) {
            throw e;
        }
    }

    public Collection<Estancia> listarEstancia() throws Exception {
        try {

            Collection<Estancia> estancias = dao.listarEstancia();

            return estancias;
        } catch (Exception e) {
            throw e;
        }

    }

    public void imprimirEstancia() throws Exception {

        try {

            Collection<Estancia> estancias = listarEstancia();

            if (estancias.isEmpty()) {
                throw new Exception("No existen mascotas para imprimir");
            } else {
                for (Estancia u : estancias) {
                    System.out.println(u.toString());
                }
            }
        } catch (Exception e) {
            throw e;
        }
    }
    
    
}
