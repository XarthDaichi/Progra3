package sucursales.presentation.empleados;

import sucursales.Application;
import sucursales.logic.Empleado;
import sucursales.logic.Service;

import java.util.List;

public class Controller {
    View view;
    Model model;

    public Controller(View view, Model model) {
        model.setEmpleados(Service.instance().empleadosSearch(""));
        this.view = view;
        this.model = model;
        view.setController(this);
        view.setModel(model);
    }

    public void buscar(String filtro){
        List<Empleado> rows = Service.instance().empleadosSearch(filtro);
        model.setEmpleados(rows);
        model.commit();
    }

    public void agregar(Empleado e) {
        Service.instance().empleadoAdd(e);
        this.update();
//        this.buscar(""); // en vez de hacer esto hacer un metodo update para que muestre la lista, esto es solo para no repetir el codigo de buscar
    }

    public void update() {
        List<Empleado> rows = Service.instance().empleadosSearch("");
        model.setEmpleados(rows);
        model.commit();
    }

    public void show(){
        Application.window.setContentPane(view.getPanel());
    }
}
