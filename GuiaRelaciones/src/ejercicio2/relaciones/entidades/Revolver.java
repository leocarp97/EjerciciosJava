package ejercicio2.relaciones.entidades;

public class Revolver {

    private int posicionActual;
    private int posicionAgua;

    public Revolver() {
    }

    public Revolver(int posicionActual, int posicionAgua) {
        this.posicionActual = posicionActual;
        this.posicionAgua = posicionAgua;
    }

    public int getPosicionActual() {
        return posicionActual;
    }

    public void setPosicionActual(int posicionActual) {
        this.posicionActual = posicionActual;
    }

    public int getPosicionAgua() {
        return posicionAgua;
    }

    public void setPosicionAgua(int posicionAgua) {
        this.posicionAgua = posicionAgua;
    }

    @Override
    public String toString() {
        return "Revolver{" + "posicionActual=" + posicionActual + ", posicionAgua=" + posicionAgua + '}';
    }

    public void llenarRevolver() {

        posicionActual = (int) (Math.random() * 10);
        posicionAgua = (int) (Math.random() * 10);

    }

    public boolean mojar() {

        return posicionAgua == posicionActual;
    }

    public void siguienteChorro() {
        if (posicionActual > 8) {
            posicionActual = 0;
        } else {
            posicionActual = posicionActual + 1;
        }

    }

    public void mostrar() {

        System.out.println("La posicion actual es: " + posicionActual + "La posicon del agua es: " + posicionAgua);

    }

}
