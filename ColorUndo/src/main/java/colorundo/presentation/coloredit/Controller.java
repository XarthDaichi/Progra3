package colorundo.presentation.coloredit;

import colorundo.Application;

import java.awt.Color;
/**
 *
 * @author Escinf
 */
public class Controller  {
    Model model;
    View view;

    public Controller(Model model, View view) {
        model.change(Color.black);
        this.model = model;
        this.view = view;
        view.setController(this);
        view.setModel(model);
    }

    public void show(){
        Application.window.setContentPane(view.getPanel());
    }

    public void change(Color c){
        model.change(c);
        model.commit();
    }

    public void undo(){
        model.undo();
        model.commit();
    }
}
