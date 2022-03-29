package ejercicio1.persistencia;

import ejercicio1.entidades.Fabricante;
import ejercicio1.entidades.Producto;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductoDAO extends DAO{
    
    private final FabricanteDAO fDao;

    public ProductoDAO() {
        fDao = new FabricanteDAO();
    }
    
    public void crearProducto(Producto producto) throws Exception {
    
        try {
            
            String sql = "INSERT INTO producto VALUES (" + producto.getCodigo() 
                    
                    
                    + ", '" + producto.getNombre() + "', " 
                    
                    
                    
                    + producto.getPrecio() + ", " + producto.getFabricante().getCodigo() + ")";
            
            insertarModificarEliminar(sql);
            
        } catch (Exception e) {
            throw e;
        }
        
    }
    
    public void modificarProducto(Producto producto) throws Exception {
        
        try {
            
            String sql = "UPDATE producto SET nombre = '" + producto.getNombre() +
                    "', precio = " + producto.getPrecio() + " WHERE codigo = " + producto.getCodigo();
            
            insertarModificarEliminar(sql);
            
        } catch (Exception e) {
            throw e;
        }
        
        
    }
    
    public List<Producto> listarTodos() throws Exception {
        
        List<Producto> lista = new ArrayList<>();
        
        try {
            
            String sql = "SELECT * FROM producto";
            
            consultarBase(sql);
            
            while (resultado.next()) {                
                Producto p = new Producto();
                p.setCodigo(resultado.getInt(1));
                p.setNombre(resultado.getString(2));
                p.setPrecio(resultado.getDouble(3));
                
                Fabricante f = fDao.buscarPorCodigo(resultado.getInt(4));
                p.setFabricante(f);

                lista.add(p);
            }
            
            return lista;
            
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarBase();
        }
        
    }

    public Producto buscarPorCodigo(int codigo) throws Exception {

        try {
            
            String sql = "SELECT * FROM producto WHERE codigo = " + codigo;
            
            consultarBase(sql);
            
            Producto p = null;
            
            while (resultado.next()) {                
                p = new Producto();
                
                p.setCodigo(resultado.getInt(1));
                p.setNombre(resultado.getString(2));
                p.setPrecio(resultado.getDouble(3));
                
                Fabricante f = fDao.buscarPorCodigo(resultado.getInt(4));
                p.setFabricante(f);
            }
            
            return p;
            
        } catch (Exception e) {
            throw e;
        }

    }
    
}
