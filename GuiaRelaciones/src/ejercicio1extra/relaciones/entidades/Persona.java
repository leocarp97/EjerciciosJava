package ejercicio1extra.relaciones.entidades;


import java.util.ArrayList;
import java.util.Scanner;

public class Persona {

   
    private String nombre;
    private String apellido;
    private int edad;
    private int dni;
    private Perro perro;
    private Scanner leer;
    private ArrayList<Persona> personas;
    public Persona() {
        leer = new Scanner(System.in).useDelimiter("\n");
    personas=new ArrayList();
    }

    public Persona(String nombre, String apellido, int edad, int dni, Perro perro, Scanner leer) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.dni = dni;
        this.perro = perro;
        this.leer = leer;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public Perro getPerro() {
        return perro;
    }

    public void setPerro(Perro perro) {
        this.perro = perro;
    }

    public Scanner getLeer() {
        return leer;
    }

    public void setLeer(Scanner leer) {
        this.leer = leer;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", dni=" + dni + ", perro=" + perro + '}';
    }

    public Persona crearPersona() {

        Persona persona = new Persona();
        System.out.println("Ingrese su nombre");
        nombre = leer.next();

        System.out.println("Ingrese su apellido");
        apellido = leer.next();

        System.out.println("Ingrese su edad");
        edad = leer.nextInt();

        System.out.println("Ingrese su DNI");
        dni = leer.nextInt();

        return persona;

    }

   public void agregarPersona(Persona persona){
       
      personas.add(persona);
       
   } 
   
  public void mostrar(){
      
      for (Persona persona : personas) {
          System.out.println(persona);
      }
  } 
   
}
