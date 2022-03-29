package ejercicio1.principal;

import ejercicio1.entidades.Animal;
import ejercicio1.entidades.Caballo;
import ejercicio1.entidades.Gato;
import ejercicio1.entidades.Perro;

public class Ejercicio1 {

    public static void main(String[] args) {

        Animal perro = new Perro("fer", "carne", 5, "caniche");
        System.out.println(perro);
        perro.alimentar();

        Animal gato = new Gato("chiquito", "galletas", 3, "sdas");
        System.out.println(gato);
        gato.alimentar();

        Animal caballo = new Caballo("juan", "pasto", 10, "sdadsa");
        System.out.println(caballo);
        caballo.alimentar();
    }

}
