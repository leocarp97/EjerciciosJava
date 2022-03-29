package guiapoo.ejercicio4extra.principal;

import guiapoo.ejercicio4extra.entidades.Nif;
import guiapoo.ejercicio4extra.servicios.NifServicio;

public class Ejercicio4extra {

    public static void main(String[] args) {

        NifServicio ns = new NifServicio();

        Nif nif = ns.crearNif();
        ns.mostrar(nif.getDni());
    }

}
