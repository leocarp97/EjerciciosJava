package ejercicio1.servicios;

import ejercicio1.entidades.Fabricante;
import ejercicio1.entidades.Producto;
import ejercicio1.persistencia.ProductoDAO;
import java.util.List;

public class ProductoServicio {
    
    private final ProductoDAO dao;
    private final FabricanteServicio fabricanteServicio;

    public ProductoServicio() {
        dao = new ProductoDAO();
        fabricanteServicio = new FabricanteServicio();
    }
    
    public void crearProducto(int codigo, String nombre, double precio, int codigoFabricante) throws Exception {
        
       Fabricante f = fabricanteServicio.buscarPorCodigo(codigoFabricante);
       
       Producto p = new Producto(codigo, nombre, precio, f);
       
       dao.crearProducto(p);
       
       System.out.println("Se agregó correctamente el producto :)");
    } 
    
    public void modificarProducto(Producto producto) throws Exception {
        dao.modificarProducto(producto);
    }
    
    public List<Producto> listarTodos() throws Exception {
        return dao.listarTodos();
    }
    
    public void mostrarNombres() throws Exception {
        
        List<Producto> productos = listarTodos();
        
        System.out.println("Los nombres de los productos son: ");
        
        // Forma imperativa de la programación
        for (Producto producto : productos) {
            System.out.println(producto.getNombre());
        }
        
        //Forma funcional de la programación 
        productos.forEach((producto) -> System.out.println(producto.getNombre()));
        
        
        //Forma funcional de la programación (System.out::println -> parametrización de comportamiento)
        productos.forEach(System.out::println);
        
    }

    public Producto buscarPorCodigo(int codigo) throws Exception {
        return dao.buscarPorCodigo(codigo);
    }
    
    
    
    
}
