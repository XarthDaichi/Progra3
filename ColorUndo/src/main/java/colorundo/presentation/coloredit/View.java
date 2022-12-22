package colorundo.presentation.coloredit;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Observable;
import java.util.Observer;

public class View implements Observer {
    private JPanel panel;
    private JSlider red;
    private JSlider green;
    private JSlider blue;
    private JPanel result;
    private JButton undo;

    public View() {
        super();
        red.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                controller.change(new Color(red.getValue(),green.getValue(),blue.getValue()));
            }
        });
        green.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                controller.change(new Color(red.getValue(),green.getValue(),blue.getValue()));
            }
        });
        blue.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                controller.change(new Color(red.getValue(),green.getValue(),blue.getValue()));
            }
        });
        undo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.undo();
            }
        });
    }

    public JPanel getPanel() {
        return panel;
    }

    Model model;
    Controller controller;

    public void setModel(Model model){
        this.model=model;
        model.addObserver(this);
    }

    public void setController(Controller controller){
        this.controller = controller;
    }

    public void update(Observable updatedModel, Object param){
        Color current = model.getCurrent();
        this.result.setBackground(current);
        this.red.setValue(current.getRed());
        this.green.setValue(current.getGreen());
        this.blue.setValue(current.getBlue());
    }

}
