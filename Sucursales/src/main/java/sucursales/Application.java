package sucursales;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Application {
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");}
        catch (Exception ex) {};

        sucursales.presentation.empleados.Model empleadosModel= new sucursales.presentation.empleados.Model();
        sucursales.presentation.empleados.View empleadosView = new sucursales.presentation.empleados.View();
        empleadosController = new sucursales.presentation.empleados.Controller(empleadosView,empleadosModel);

        sucursales.presentation.main.Model mainModel= new sucursales.presentation.main.Model();
        sucursales.presentation.main.View mainView = new sucursales.presentation.main.View();
        mainController = new sucursales.presentation.main.Controller(mainView, mainModel);

        mainView.getPanel().add("Empleados",empleadosView.getPanel());

        window = new JFrame();
        window.setSize(400,300);
        window.setExtendedState(JFrame.MAXIMIZED_BOTH);
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        window.setTitle("SISTEMA...");
        window.setVisible(true);
        mainController.show();
    }

    public static sucursales.presentation.empleados.Controller empleadosController;
    public static sucursales.presentation.main.Controller mainController;

    public static JFrame window;
}
