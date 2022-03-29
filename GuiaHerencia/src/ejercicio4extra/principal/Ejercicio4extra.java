package ejercicio4extra.principal;

import ejercicio4extra.entidades.Empleado;
import ejercicio4extra.entidades.Estudiante;
import ejercicio4extra.entidades.Persona;
import ejercicio4extra.entidades.PersonalServicio;
import ejercicio4extra.entidades.Profesor;
import java.util.Scanner;

public class Ejercicio4extra {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        Persona p = new Persona();
        Estudiante e = new Estudiante();
        Profesor profe = new Profesor();
        PersonalServicio ps = new PersonalServicio();
        Empleado empleado = new Empleado();

        int opc;
    
        String o;
        do {
            System.out.println("1-Estudiante");
            System.out.println("2-Empleado");
            opc = leer.nextInt();
            switch (opc) {
                case 1:
                    e.crearEstudiante();

                    break;

                case 2:
                    String n;
                    System.out.println("Ingrese el tipo de empleado");
                    n = leer.next();
                    if (n.equalsIgnoreCase("profesor")) {
                        profe.crearProfesor();
                        empleado.crearEmpleado();
                        empleado.setProfesor(profe);
                    } else {
                        ps.crearPersonalServicio();
                        empleado.crearEmpleado();
                        empleado.setPersonal(ps);
                    }

                    break;
            }
             int op=0;
            while (op != 6) {
                System.out.println("1-Cambiar estado civil de una persona");
                System.out.println("2-Reasignar despacho a un empleado");
                System.out.println("3-Matricular a un estudiante a un nuevo curso");
                System.out.println("4-Cambiar de departamento a un profesor");
                System.out.println("5-Traslado de seccion a un empleado del personal de servicio");
                System.out.println("6-Salir");

                op = leer.nextInt();

                switch (op) {
                    case 1:
                        System.out.println("Ingrese si es un empleado o un estudiante");
                        String n = leer.next();
                        if (n.equalsIgnoreCase("estudiante")) {
                            e.cambiarEstadoCivil();
                            System.out.println(e);
                        } else if (n.equalsIgnoreCase("profesor")) {
                            profe.cambiarEstadoCivil();
                            System.out.println(profe);
                        } else {
                            ps.cambiarEstadoCivil();
                            System.out.println(ps);
                        }
                        ;
                        break;
                    case 2:
                        empleado.cambiarDespacho();
                        System.out.println(empleado);
                        break;
                    case 3:
                        e.cambiarMatricula();
                        System.out.println(e);
                        break;
                    case 4:
                        profe.cambiarDepartamento();
                        System.out.println(profe);
                        break;
                    case 5:
                        ps.cambiarSeccion();
                        System.out.println(ps);
                        break;
                }
            }
            System.out.println("Desea salir ? S/N");
            o = leer.next();
        } while (o.equalsIgnoreCase("n"));
    }

}
