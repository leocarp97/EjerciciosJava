package tienda.servicios;

import java.util.Collection;

import tienda.entidades.Producto;
import tienda.persistencia.ProductoDAO;

public class ProductoServicio {


    private ProductoDAO dao;

    public ProductoServicio() {
        this.dao = new ProductoDAO();
    }

    public void crearProducto(int codigo, String nombre, double precio, int codigoFabricante) throws Exception {

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

            Producto producto = new Producto();
            producto.setCodigo(codigo);
            producto.setNombre(nombre);
            producto.setPrecio(precio);
            producto.setCodigoFabricante(codigoFabricante);
            dao.guardarProducto(producto);
        } catch (Exception e) {
            throw e;
        }
    }

    public Collection<Producto> listarNombre() throws Exception {
        try {

            Collection<Producto> productos = dao.listarNombre();

            return productos;
        } catch (Exception e) {
            throw e;
        }

    }

    public void imprimirNombres() throws Exception {

        try {

            Collection<Producto> productos = listarNombre();

            if (productos.isEmpty()) {
                throw new Exception("No existen mascotas para imprimir");
            } else {
                for (Producto u : productos) {
                    System.out.println(u.toString());
                }
            }
        } catch (Exception e) {
            throw e;
        }
    }

    public Collection<Producto> listarNombreYPrecio() throws Exception {
        try {

            Collection<Producto> productos = dao.listarNombreYPrecio();

            return productos;
        } catch (Exception e) {
            throw e;
        }

    }

    public void imprimirNombreYPrecio() throws Exception {

        try {

            Collection<Producto> productos = listarNombreYPrecio();

            if (productos.isEmpty()) {
                throw new Exception("No existen mascotas para imprimir");
            } else {
                for (Producto u : productos) {
                    System.out.println(u.toString());
                }
            }
        } catch (Exception e) {
            throw e;
        }
    }

    public Collection<Producto> listarPorPrecio() throws Exception {
        try {

            Collection<Producto> productos = dao.listarPorPrecio();

            return productos;
        } catch (Exception e) {
            throw e;
        }

    }

    public void imprimirPorPrecio() throws Exception {

        try {

            Collection<Producto> productos = listarPorPrecio();

            if (productos.isEmpty()) {
                throw new Exception("No existen mascotas para imprimir");
            } else {
                for (Producto u : productos) {
                    System.out.println(u.toString());
                }
            }
        } catch (Exception e) {
            throw e;
        }
    }

    public Collection<Producto> listarPortatiles() throws Exception {
        try {

            Collection<Producto> productos = dao.listarPortatiles();

            return productos;
        } catch (Exception e) {
            throw e;
        }

    }

    public void imprimirPortatiles() throws Exception {

        try {

            Collection<Producto> productos = listarPortatiles();

            if (productos.isEmpty()) {
                throw new Exception("No existen mascotas para imprimir");
            } else {
                for (Producto u : productos) {
                    System.out.println(u.toString());
                }
            }
        } catch (Exception e) {
            throw e;
        }
    }

    public Collection<Producto> listarPrecioMin() throws Exception {
        try {

            Collection<Producto> productos = dao.listarPorPrecioMin();

            return productos;
        } catch (Exception e) {
            throw e;
        }

    }

    public void imprimirPrecioMin() throws Exception {

        try {

            Collection<Producto> productos = listarPrecioMin();

            if (productos.isEmpty()) {
                throw new Exception("No existen mascotas para imprimir");
            } else {
                for (Producto u : productos) {
                    System.out.println(u.toString());
                }
            }
        } catch (Exception e) {
            throw e;
        }
    }

    public Collection<Producto> listarProductos() throws Exception {
        try {

            Collection<Producto> productos = dao.listarProducto();

            return productos;
        } catch (Exception e) {
            throw e;
        }

    }

    public void imprimirProductos() throws Exception {

        try {

            Collection<Producto> productos = listarProductos();

            if (productos.isEmpty()) {
                throw new Exception("No existen mascotas para imprimir");
            } else {
                for (Producto u : productos) {
                    System.out.println(u.toString());
                }
            }
        } catch (Exception e) {
            throw e;
        }
    }

    public void modificarProducto(int codigo, String nombre, double precio, int codigoFabricante) throws Exception {

        try {

           // Producto producto = buscarProductoPorId(codigo);

            Producto producto = new Producto();
            producto.setCodigo(codigo);
            producto.setNombre(nombre);
            producto.setPrecio(precio);
            producto.setCodigoFabricante(codigoFabricante);

            dao.modificarProducto(producto);

        } catch (Exception e) {
            throw e;
        }
    }
}


