package es.prorix.ficheros.crud.Interface;
import java.util.Set;
import es.prorix.ficheros.crud.model.Empleado;


/**
 * Interfaz con todas las posibles operaciones al fichero
 * @author prorix
 * @version 1.0.0
 */



public interface Operations {
    public boolean create (Empleado empleado);
    public Empleado read (String identificador);
    public Empleado read (Empleado empleado);
    public boolean update (Empleado empleado);
    public boolean delete (String identificcador);
    public Set<Empleado> empleadosPorPuesto (String puesto);
    public Set<Empleado> empleadosPorEdad (String fechaInicio, String fechaFin);
}
