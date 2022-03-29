package GuiaCollections.ejercicio6.principal;

import GuiaCollections.ejercicio6.entidades.Producto;
import GuiaCollections.ejercicio6.servicios.ProductoServicio;
import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        ProductoServicio ps = new ProductoServicio();
        Producto p = new Producto();

        String respuesta;
        int opc;

        do {

            p = ps.crearProducto();
            ps.agregarProducto(p);
            System.out.println("Desea salir ? S/N");
            respuesta = leer.next();
        } while (respuesta.equalsIgnoreCase("n"));

        do {
            System.out.println("Menu");
            System.out.println("1-Introducir un producto");
            System.out.println("2-Modificar su precio");
            System.out.println("3-Eliminar un producto");
            System.out.println("4-Mostrar los productos");
            System.out.println("5-Salir");

            System.out.println("Elija una opcion");
            opc = leer.nextInt();

            switch (opc) {

                case 1:
                    p = ps.crearProducto();
                    ps.agregarProducto(p);

                    break;
                case 2:
                    System.out.println("Ingrese el nombre del producto a modificar");

                    String pro = leer.next();
                    ps.modificarPrecio(p, pro);

                    break;
                case 3:
                    System.out.println("Ingrese el producto a eliminar");
                    String n = leer.next();
                    ps.eliminarProducto(n);

                    break;
                case 4:
                    ps.mostrarProductos();
                    break;
            }

        } while (opc < 5);

    }

}
