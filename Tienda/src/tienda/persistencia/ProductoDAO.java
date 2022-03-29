package tienda.persistencia;

import java.util.ArrayList;
import java.util.Collection;
import tienda.entidades.Producto;

public final class ProductoDAO extends DAO {

    public void guardarProducto(Producto producto) throws Exception {
        try {
            if (producto == null) {
                throw new Exception("Debe indicar el producto");
            }

            String sql = "INSERT INTO Producto (codigo, nombre, precio, codigo_fabricante)"
                    + "VALUES ( '" + producto.getCodigo() + "' , '" + producto.getNombre() + "' , '" + producto.getPrecio() + "' , '" + producto.getCodigoFabricante() + "' );";

            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarBase();
        }
    }

    public Collection<Producto> listarNombre() throws Exception {
        try {
            String sql = "SELECT nombre FROM Producto ";

            consultarBase(sql);
            Producto producto = null;
            Collection<Producto> productos = new ArrayList();
            while (resultado.next()) {
                producto = new Producto(); 
                producto.setNombre(resultado.getString("Nombre"));

                productos.add(producto);
            }
            desconectarBase();
            return productos;
        } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
            throw e;
        }
    }

    public Collection<Producto> listarNombreYPrecio() throws Exception {
        try {
            String sql = "SELECT nombre, precio FROM Producto ";

            consultarBase(sql);

            Producto producto = null;
            Collection<Producto> productos = new ArrayList();
            while (resultado.next()) {
                producto = new Producto();
                producto.setNombre(resultado.getString("Nombre"));
                producto.setPrecio(resultado.getDouble("Precio"));
           
                productos.add(producto);
            }
            desconectarBase();
            return productos;
        } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
            throw e;
        }
    }

    public Collection<Producto> listarPorPrecio() throws Exception {
        try {
            String sql = "SELECT * FROM Producto WHERE Precio>120 && Precio<202 ";

            consultarBase(sql);

            Producto producto = null;
            Collection<Producto> productos = new ArrayList();
            while (resultado.next()) {
                producto = new Producto();
                producto.setCodigo(resultado.getInt(1));
            producto.setNombre(resultado.getString("Nombre"));
                producto.setPrecio(resultado.getDouble("Precio"));
                producto.setCodigoFabricante(resultado.getInt(4));
                productos.add(producto);
            }
            desconectarBase();
            return productos;
        } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
            throw e;
        }
    }

    public Collection<Producto> listarPortatiles() throws Exception {

        try {
    
            String sql = " SELECT nombre, precio FROM Producto  WHERE nombre LIKE '%Portatil%' " ;

            consultarBase(sql);

            Producto producto = null;
            Collection<Producto> productos = new ArrayList();
            while (resultado.next()) {
                producto = new Producto();
                producto.setNombre(resultado.getString("Nombre"));
                producto.setPrecio(resultado.getDouble("Precio"));
                productos.add(producto);
            }
            desconectarBase();
            return productos;

        } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
            throw e;
        }

    }

    public Collection<Producto> listarPorPrecioMin() throws Exception {
        try {
            String sql = "SELECT Nombre, Precio FROM Producto ORDER BY precio ASC LIMIT 1 ";

            consultarBase(sql);

            Producto producto = null;
            Collection<Producto> productos = new ArrayList();
            while (resultado.next()) {
                producto = new Producto();
                producto.setNombre(resultado.getString("Nombre"));
                producto.setPrecio(resultado.getDouble("Precio"));
                productos.add(producto);
            }
            desconectarBase();
            return productos;
        } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
            throw e;
        }
    }

    public Collection<Producto> listarProducto() throws Exception {
        try {
            String sql = "SELECT * FROM Producto ";

            consultarBase(sql);
            Producto producto = null;
            Collection<Producto> productos = new ArrayList();
            while (resultado.next()) {
                producto = new Producto();
                producto.setNombre(resultado.getString("Nombre"));
                producto.setPrecio(resultado.getDouble("Precio"));
                producto.setCodigo(resultado.getInt("Codigo"));
              producto.setCodigoFabricante(resultado.getInt(4));
                productos.add(producto);
            }
            desconectarBase();
            return productos;
        } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
            throw e;
        }
    }

      public void modificarProducto(Producto producto) throws Exception {
        try {
            if (producto == null) {
                throw new Exception("Debe indicar el producto que desea modificar");
            }

            String sql = "UPDATE Producto SET "
                    + "nombre = '" +producto.getNombre() + "' ,precio = '" + producto.getPrecio() + "' , codigo_fabricante = "+ producto.getCodigoFabricante()+" WHERE codigo = '" + producto.getCodigo()+ "'";

            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarBase();
        }
    }
       
    
}
