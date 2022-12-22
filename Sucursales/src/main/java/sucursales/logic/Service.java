package sucursales.logic;

import sucursales.data.Container;
import sucursales.data.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Service {
    private static Service theInstance;

    public static Service instance(){
        if (theInstance == null){
            theInstance = new Service();
        }
        return theInstance;
    }

    private Data data;

    private Service(){
        data = new Data();
    }

    public List<Empleado> empleadosSearch(String filtro){
        return data.getEmpleados().stream().filter(e->e.getNombre().contains(filtro)).collect(Collectors.toList());
    }

    // tarea moral verificar que no se repitan empleados
    public void empleadoAdd(Empleado e) {
        if (this.empleadosSearch(e.nombre).isEmpty()) {
            data.getEmpleados().add(e);
        } else {
            throw new IllegalArgumentException("Empleado ya ingresado");
        }
    }

    /*private Container<Empleado> empleados;

    private Service() {
        empleados = new Container<Empleado>();
        empleados.push(new Empleado("111", "Franklin Chang"));
        empleados.push(new Empleado("222", "Sandra Cauffman"));
        empleados.push(new Empleado("333", "Ivan Vargas"));
    }

    public <T> ArrayList<Empleado> empleadosSearch(T something) {
        return empleados.certain_objects(something);
    }

    public void empleadoAdd(Empleado e) {
        if (empleados.certain_objects(e).isEmpty())
            empleados.push(e);
        else
            throw new IllegalArgumentException("Empleado ya esta ingresado");
    }*/
 }
