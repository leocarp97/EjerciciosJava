
package GuiaCollections.ejercicio6.entidades;


public class Producto {
    
   private String nombreProducto;
   private Integer valorProducto;

    public Producto() {
    }

    public Producto(String nombreProducto, Integer valorProducto) {
        this.nombreProducto = nombreProducto;
        this.valorProducto = valorProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public Integer getValorProducto() {
        return valorProducto;
    }

    public void setValorProducto(Integer valorProducto) {
        this.valorProducto = valorProducto;
    }

    @Override
    public String toString() {
        return "Producto{" + "nombreProducto=" + nombreProducto + ", valorProducto=" + valorProducto + '}';
    }
   
   
    
}
