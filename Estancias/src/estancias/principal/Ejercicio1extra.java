package estancias.principal;

import estancias.servicios.CasaServicio;
import estancias.servicios.ClienteServicio;
import estancias.servicios.EstanciaServicio;
import estancias.servicios.FamiliaServicio;
import java.util.Scanner;


public class Ejercicio1extra {

    public static void main(String[] args) {

        FamiliaServicio fs = new FamiliaServicio();
        ClienteServicio cs = new ClienteServicio();
        CasaServicio c = new CasaServicio();
        EstanciaServicio es = new EstanciaServicio();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int n;
        
        String opc;
        do {
            System.out.println("MENU");
            System.out.println("1-Listar familas que tienen al menos 3 hijos y edad maxima inferion a 10");
            System.out.println("2-Buscar y listar casas");
            System.out.println("3-Mostrar todas las familias cuya direccion de mail sea de hotmail");
            System.out.println("4-Listar los datos de todos los clientes que realizaron una estancia");
            System.out.println("5-Listar todas las estancias que han sido reservadas por un cliente");
            System.out.println("6-Mostrar precios actualizados");
            System.out.println("7-Obtener el numero de casas que existen para cada uno de los paises");
            System.out.println("8-Listar aquellas casas del Reino Unido con comentarios que estan limpias");
            System.out.println("9-Insertar nuevos datos en la tabla estancias");

            System.out.println("Elija una opcion");
            n = leer.nextInt();

            switch (n) {
                case 1:
                    try {
                        fs.listarFamilia();
                        fs.imprimirFamilias();
                    } catch (Exception e) {
                    }
                    break;
                case 2:
                    try {
                        c.listarCasas();
                        c.imprimirCasas();
                    } catch (Exception e) {
                    }
                    break;

                case 3:
                    try {
                        fs.listarFamiliaPorMail();
                        fs.imprimirFamiliasPorMail();
                    } catch (Exception e) {
                    }
                    break;

                case 4:
                    try {
                        cs.listarCliente();
                        cs.imprimirClientes();

                    } catch (Exception e) {
                    }
                    break;
                case 5:
                    try {
                        cs.listarClienteYCasa();
                        cs.imprimirClientesYCasas();

                    } catch (Exception e) {
                    }
                    break;
                case 6:
                    try {
                        c.listarPorPrecio();
                        c.imprimirPorPrecio();
                    } catch (Exception e) {
                    }
                    break;
                case 7:
                    try {
                        c.listarPorPais();
                        // c.imprimirPorPais();
                    } catch (Exception e) {
                    }

                    break;
                case 8:
                    try {
                        c.listarPorComentario();
                        c.imprimirPorComentario();
                    } catch (Exception e) {
                    }
                    break;
                case 9:
                    try {
                        
                        es.imprimirEstancia();
                    } catch (Exception e) {
                    }
            }
            System.out.println("Desea salir? S/N");
            opc = leer.next();
        } while (opc.equalsIgnoreCase("n"));

    }

}
