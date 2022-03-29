package guiapoo.ejercicio6extra.entidades;

public class Ahorcado {

    private String palabra[];
    private int letrasEncontradas;
    private int cantidadJugadas;

    public Ahorcado() {
    }

    public Ahorcado(String[] palabra, int letrasEncontradas, int cantidadJugadas) {
        this.palabra = palabra;
        this.letrasEncontradas = letrasEncontradas;
        this.cantidadJugadas = cantidadJugadas;
    }

    public String[] getPalabra() {
        return palabra;
    }

    public void setPalabra(String[] palabra) {
        this.palabra = palabra;
    }

    public int getLetrasEncontradas() {
        return letrasEncontradas;
    }

    public void setLetrasEncontradas(int letrasEncontradas) {
        this.letrasEncontradas = letrasEncontradas;
    }

    public int getCantidadJugadas() {
        return cantidadJugadas;
    }

    public void setCantidadJugadas(int cantidadJugadas) {
        this.cantidadJugadas = cantidadJugadas;
    }

}
