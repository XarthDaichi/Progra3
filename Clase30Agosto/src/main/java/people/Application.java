package people;

import people.logic.Container;
import people.logic.Person;
import people.window.View;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Application {
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (Exception ex) {};

        Container appPeople = new Container();

        View view = new View();
        JFrame window = new JFrame();
        window.setSize(600, 300);
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        window.setTitle("People");
        window.setContentPane(view.getSavingPanel());
        view.getSaveButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                java.util.ArrayList<String> tempHobbies = new java.util.ArrayList<String>();
                if (view.getMusicCheckBox().isSelected())
                    tempHobbies.add(view.getMusicCheckBox().getText());
                if (view.getMoviesCheckBox().isSelected())
                    tempHobbies.add(view.getMoviesCheckBox().getText());
                if (view.getSportsCheckBox().isSelected())
                    tempHobbies.add(view.getSportsCheckBox().getText());
                if (view.getVideogamesCheckBox().isSelected())
                    tempHobbies.add(view.getVideogamesCheckBox().getText());
                if (view.getCookingCheckBox().isSelected())
                    tempHobbies.add(view.getCookingCheckBox().getText());
                if (view.getOtherCheckBox().isSelected())
                    tempHobbies.add(view.getOtherTxt().getText());

                String gender;

                if (view.getMaleButton().isSelected())
                    gender = view.getMaleButton().getText();
                else if (view.getFemaleButton().isSelected())
                    gender = view.getFemaleButton().getText();
                else
                    gender = view.getNbButton().getText();

                Person newPerson = new Person(Integer.parseInt(view.getIdTxt().getText()), view.getNameTxt().getText(), gender, view.getMaritalStatusCB().getSelectedItem().toString(), tempHobbies);
                appPeople.add(newPerson);
                view.getIdTxt().setText("");
                view.getNameTxt().setText("");
                view.getOtherTxt().setText("");
                view.getMaritalStatusCB().setSelectedIndex(0);
                view.getMaleButton().setSelected(false);
                view.getFemaleButton().setSelected(false);
                view.getNbButton().setSelected(false);
                view.getMusicCheckBox().setSelected(false);
                view.getMoviesCheckBox().setSelected(false);
                view.getSportsCheckBox().setSelected(false);
                view.getVideogamesCheckBox().setSelected(false);
                view.getCookingCheckBox().setSelected(false);
                view.getOtherCheckBox().setSelected(false);

                System.out.println(appPeople.toString());
            }
        });
        window.setVisible(true);

        System.out.println("Hello world!");
    }
}