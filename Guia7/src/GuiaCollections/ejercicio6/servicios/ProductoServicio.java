package GuiaCollections.ejercicio6.servicios;

import GuiaCollections.ejercicio6.entidades.Producto;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ProductoServicio {

    private HashMap<String, Integer> productos;
    private Scanner leer;

    public ProductoServicio() {
        productos = new HashMap();
        leer = new Scanner(System.in).useDelimiter("\n");
    }

    public Producto crearProducto() {

        System.out.println("Ingrese el nombre del producto :");
        String nombreProducto = leer.next();

        System.out.println("Ingrese el valor del producto");

        Integer valorProducto = leer.nextInt();
        Producto p = new Producto(nombreProducto, valorProducto);
        return p;
    }

    
  public void agregarProducto(Producto p){
      
      productos.put(p.getNombreProducto(), p.getValorProducto());
      
  }  
    public void modificarPrecio(Producto p, String pro){
        
        
        
        for (Map.Entry<String, Integer> entry : productos.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            if (p.getNombreProducto().equalsIgnoreCase(pro)) {
            
            System.out.println("Ingrese el nuevo valor");
          productos.replace(pro, leer.nextInt());
        }
        
       
        }
        
    }
   
  public void eliminarProducto(String n){
      
//      System.out.println("Ingrese el producto a eliminar");
//      String n=leer.next();  
      
//      for (Map.Entry<String, Integer> entry : productos.entrySet()) {
//          String key = entry.getKey();
//          Integer value = entry.getValue();
//          if (p.getNombreProducto().equalsIgnoreCase(n)) {
//              
//              productos.remove(p.getNombreProducto());
//          }
//      }
                productos.remove(n);
  
  }  
    
public void mostrarProductos(){
    
    for (Map.Entry<String, Integer> entry : productos.entrySet()) {
        String key = entry.getKey();
        Integer value = entry.getValue();
        
        System.out.println("Producto: "+key+" Valor: "+value);
    } 
    
}  
  
}
