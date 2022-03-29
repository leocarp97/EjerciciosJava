package ejercicio3extra.principal;

import ejercicio3extra.entidades.Alojamiento;
import ejercicio3extra.entidades.AlojamientoExtraHotelero;
import ejercicio3extra.entidades.Camping;
import ejercicio3extra.entidades.Hotel;
import ejercicio3extra.entidades.Hotel4;
import ejercicio3extra.entidades.Hotel5;
import ejercicio3extra.entidades.Residencia;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio3extra {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        List<Alojamiento> lista = new ArrayList();

        Alojamiento a = new Alojamiento();
        Hotel hotel = new Hotel();
        Hotel4 hotel4 = new Hotel4();
        Hotel5 hotel5 = new Hotel5();
        AlojamientoExtraHotelero aloja = new AlojamientoExtraHotelero();
        Camping camping = new Camping();
        Residencia residencia = new Residencia();

        a.crearAlojamiento();
        hotel4.crearHotel4();
        hotel5.crearHotel5();
        System.out.println("hotel4**"+hotel4.precioHabitaciones());
        System.out.println("hotel5**"+ hotel5.precioHabitaciones());
        aloja.crearAlojamientoExtraHotelero();
        camping.crearCamping();
        residencia.crearResidencia();
        lista.add(a);
        lista.add(hotel4);
        lista.add(hotel5);
        lista.add(camping);
        lista.add(residencia);

        for (Alojamiento aux : lista) {
            System.out.println(aux);
        }

    }

}
