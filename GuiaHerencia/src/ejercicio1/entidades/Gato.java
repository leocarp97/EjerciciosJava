
package ejercicio1.entidades;

public class Gato extends Animal {

    public Gato() {
    }

    public Gato(String nombre, String alimento, int edad, String raza) {
        super(nombre, alimento, edad, raza);
    }



    @Override
    public void alimentar() {
        super.alimentar(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setRaza(String raza) {
        super.setRaza(raza); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getRaza() {
        return super.getRaza(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setEdad(int edad) {
        super.setEdad(edad); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getEdad() {
        return super.getEdad(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setAlimento(String alimento) {
        super.setAlimento(alimento); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getAlimento() {
        return super.getAlimento(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setNombre(String nombre) {
        super.setNombre(nombre); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getNombre() {
        return super.getNombre(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
