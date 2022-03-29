package tienda.principal;

import java.util.Scanner;
import tienda.servicios.FabricanteServicio;
import tienda.servicios.ProductoServicio;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        ProductoServicio ps = new ProductoServicio();
        FabricanteServicio fs = new FabricanteServicio();
        int n;

        String opc;

        do {
            System.out.println("MENU");
            System.out.println("1-Lista el nombre de todos los productos");
            System.out.println("2-Lista los nombres y los precios de todos los productos");
            System.out.println("3-Lista de aquellos prodcutos que su precio està entre 120 y 202");
            System.out.println("4-Buscar y listar todos los Portátiles de la tabla Producto");
            System.out.println("5-El nombre y el precio del producto mas barato");
            System.out.println("6-Ingresar un producto a la base de datos");
            System.out.println("7-Ingresar un fabricante a la base de datos");
            System.out.println("8-Editar un producto con datos a eleccion");
      

            System.out.println("Elija una opcion");
            n = leer.nextInt();

            switch (n) {
                case 1:
                    try {

                        ps.imprimirNombres();
                    } catch (Exception e) {
                    }
                    break;
                case 2:
                    try {

                        ps.imprimirNombreYPrecio();
                    } catch (Exception e) {
                    }
                    break;

                case 3:
                    try {
                        ps.imprimirPorPrecio();
                    } catch (Exception e) {
                    }
                    break;

                case 4:
                    try {
                       // ps.listarPortatiles();
                        ps.imprimirPortatiles();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;
                case 5:
                    try {
                        //ps.listarPrecioMin();
                        ps.imprimirPrecioMin();
                    } catch (Exception e) {
                    }
                    break;
                case 6:
                    try {
                        ps.crearProducto(12, "Monitor", 200.50, 2);
                        ps.imprimirProductos();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;
                case 7:
                    try {
                        fs.crearFabricante("LG", 10);
                        fs.imprimirProductos();
                    } catch (Exception e) {
                        e.printStackTrace();
                        break;
                    }
                case 8:

                    try {

                        System.out.println("Ingrese el codigo del producto a modificar");
                        int codigo = leer.nextInt();

                        System.out.println("Ingrese el nuevo nombre del producto");
                        String nombre = leer.next();

                        System.out.println("Ingrese el precio del producto");
                        double precio = leer.nextDouble();

                        System.out.println("Ingrese el codigo del fabricante");
                        int codigoF = leer.nextInt();

                        ps.modificarProducto(codigo, nombre, precio, codigoF);

                        ps.imprimirProductos();

                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                  
                
            }
            System.out.println("Desea salir? S/N");
            opc = leer.next();
        } while (opc.equalsIgnoreCase("n"));

    }

}
