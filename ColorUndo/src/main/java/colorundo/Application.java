/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colorundo;

import javax.swing.*;

/**
 *
 * @author Escinf
 */
public class Application {

    public static void main(String[] args) {
        try { UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");}
        catch (Exception ex) {};

        colorundo.presentation.coloredit.Model coloreditModel=new colorundo.presentation.coloredit.Model() ;
        colorundo.presentation.coloredit.View coloreditView = new colorundo.presentation.coloredit.View();
        coloreditController = new colorundo.presentation.coloredit.Controller(coloreditModel,coloreditView);

        window = new JFrame();
        window.setSize(350,200);
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        window.setTitle("Color Editor");
        window.setVisible(true);
        coloreditController.show();
    }

    public static  colorundo.presentation.coloredit.Controller coloreditController;
    public static JFrame window;
}
