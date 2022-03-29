
package guiapoo.ejercicio9.entidades;

public class Matematica {
    
    private double n1;
    private double n2;

    public Matematica(double n1, double n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    public Matematica() {
    }

    public double getN1() {
        return n1;
    }

    public void setN1(double n1) {
        this.n1 = n1;
    }

    public double getN2() {
        return n2;
    }

    public void setN2(double n2) {
        this.n2 = n2;
    }

    @Override
    public String toString() {
        return "Matematica{" + "n1=" + n1 + ", n2=" + n2 + '}';
    }
    
    
    
    
}
