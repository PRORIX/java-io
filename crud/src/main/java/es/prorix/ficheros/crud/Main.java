package es.prorix.ficheros.crud;

import es.prorix.ficheros.crud.model.Empleado;
import es.prorix.ficheros.crud.model.file.FileOperations;


/**
 * Clase principal donde se comprueba todo el codigo
 * @author prorix
 * @version 1.0.0
 */


public class Main {
    public static void main(String[] args) {
        Empleado empleado = new Empleado("1", "Romen", "Programador", 20000,"08/11/2006");
        System.out.println(empleado);
        System.out.println(empleado.getEdad(empleado.getFechaDeNacimiento()));

        FileOperations operaciones = new FileOperations();
        boolean insertar = operaciones.create(empleado);
        if (insertar) {
            System.out.println("insertado correctamente");
        }  else{
            System.out.println("error al insertar el elemento");
        }
        Empleado personaBuscar = new Empleado("1");
        
        personaBuscar = operaciones.read(personaBuscar);

        System.out.println(personaBuscar);

        Empleado personaBuscar2 = new Empleado("1","Carla","Administradora",100000,"08/11/2007");

        System.out.println(operaciones.update(personaBuscar2));

        System.out.println(operaciones.empleadosPorPuesto("Administradora"));

        System.out.println(operaciones.empleadosPorEdad("08/11/2007", "08/11/2025"));
    }   
}