package ejercicio1;

import ejercicio1.entidades.Producto;
import ejercicio1.servicios.ProductoServicio;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        ProductoServicio productoServicio = new ProductoServicio();
        
        try {
            
            System.out.println("Ingrese el código del producto a eliminar.");
            int codigo = leer.nextInt();
            
            Producto p = productoServicio.buscarPorCodigo(codigo);
            
            if (p == null) {
                throw new Exception("No existe es producto.");
            }
            
            boolean quiereModificar = false;
            
            //Modificar el nombre
            System.out.println("Querés modificar el nombre?");
            quiereModificar = leer.nextBoolean();
            
            if (quiereModificar) {
                System.out.println("Ingrese el nuevo nombre");
                p.setNombre(leer.next());
            }
            
            
            //Modificar el precio
            System.out.println("Querés modificar el precio?");
            quiereModificar = leer.nextBoolean();
            
            if (quiereModificar) {
                System.out.println("Ingrese el nuevo precio");
                p.setPrecio(leer.nextDouble());
            }
            
            productoServicio.modificarProducto(p);
            
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
          
        
    }
    
}
