package progra3.payroll;
import progra3.payroll.logic.Person;
import progra3.payroll.logic.Container;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class Application {
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch(Exception ex) {
            System.out.println("Error de Nimbus Look and Feel");
        }

        Container appPeople = new Container();

        // simple window only title and size 400x200

        /*JFrame gui = new  JFrame("Hello World");
        gui.setSize(400,200);
        gui.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        gui.setVisible(true);
        System.out.println("Main terminal!");*/


        // simple window with user label, text field, and button

        /*JFrame gui = new JFrame ("PERSONA");
        gui.setSize(400, 200);
        gui.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        gui.setLayout(null);

        JLabel id_l=new JLabel("Id:");
        id_l.setBounds(20, 10, 40, 30);
        gui.add(id_l);

        JTextField id_t=new JTextField("");
        id_t.setBounds(60, 10, 150, 30);
        gui.add(id_t);

        JButton guardar_b=new JButton("Guardar");
        guardar_b.setBounds(60, 100, 100, 30);
        guardar_b.setBackground(Color.GREEN);
        gui.add(guardar_b);*/

        // JFrame is a container of JComponents

        // DIFFERENT JCOMPONENTS THAT CAN BE ADDED

        /*
        JLabel Displays uneditable text and/or icons
        JTextField Typically receives input from the user.
        JButton Triggers and event when clicked with the mouse.
        JCheckBox Specifies an option that can be selected or not selected.
        JComboBox A drop-down list of items from which the user can make a selection.
        JList A list of items from which the user can make a selection by clicking on any one of them. Multiple elements can be selected.
        JPanel An area in which components can be placed an organized.

        Others: JScrollBar, JOptionPane, JMenuBar
         */

        // gui.setVisible(true);


        // Simple window with a menu
        /*JFrame p = new JFrame();
        p.setTitle("JFrameEjemplo");
        p.setSize(400, 200);
        p.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        p.setLayout(null);

        JButton b=new JButton("Button");
        b.setBounds(50, 50, 200, 30);
        b.setBackground(Color.GREEN);
        p.add(b);

        Menu m = new Menu("Archivo");
        m.add(new MenuItem("Guardar"));
        m.add(new MenuItem("Recuperar"));
        MenuBar mb = new MenuBar();
        mb.add(m);
        p.setMenuBar(mb);
        p.setVisible(true);*/

        // trying to make the PERSONA interface from start of presentation

        JFrame gui = new JFrame("PERSONA");
        gui.setSize(500, 350);
        gui.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        gui.setLayout(null);

        JLabel id_l = new JLabel("Id");
        id_l.setBounds(20, 10, 40, 30);
        gui.add(id_l);

        JTextField id_t = new JTextField("");
        id_t.setBounds(90, 10, 120, 30);
        gui.add(id_t);

        JLabel name_l = new JLabel("Name");
        name_l.setBounds(20, 50, 70, 30);
        gui.add(name_l);

        JTextField name_t = new JTextField("");
        name_t.setBounds(90, 50, 120, 30);
        gui.add(name_t);

        JLabel sex_l = new JLabel("Sex");
        sex_l.setBounds(20, 90, 60, 30);
        gui.add(sex_l);

        ButtonGroup sexGroup = new ButtonGroup();

        JRadioButton male_b = new JRadioButton();
        male_b.setBounds(90, 95, 20, 20);
        sexGroup.add(male_b);
        gui.add(male_b);

        JLabel male_l = new JLabel("Male");
        male_l.setBounds(110, 90, 30, 30);
        gui.add(male_l);

        JRadioButton female_b = new JRadioButton();
        female_b.setBounds(150, 95, 20, 20);
        sexGroup.add(female_b);
        gui.add(female_b);

        JLabel female_l = new JLabel("Female");
        female_l.setBounds(170, 90, 70, 30);
        gui.add(female_l);

        JLabel civil_state_l = new JLabel("Civil State");
        civil_state_l.setBounds(20, 130, 60, 30);
        gui.add(civil_state_l);

        JComboBox civil_state_cb = new JComboBox(new String[]{"Single", "Married", "LoL Player"});
        civil_state_cb.setBounds(90, 130, 120, 30);
        gui.add(civil_state_cb);

        JLabel hobbies_l = new JLabel("Hobbies");
        hobbies_l.setBounds(20, 170, 60, 30);
        gui.add(hobbies_l);

        JCheckBox music_b = new JCheckBox();
        music_b.setBounds(90, 175, 20, 20);
        gui.add(music_b);

        JLabel music_l = new JLabel("Music");
        music_l.setBounds(110, 170, 40, 30);
        gui.add(music_l);

        JCheckBox movies_b = new JCheckBox();
        movies_b.setBounds(150, 175, 20, 20);
        gui.add(movies_b);

        JLabel movies_l = new JLabel("Movies");
        movies_l.setBounds(170, 170, 40, 30);
        gui.add(movies_l);

        JCheckBox sports_b = new JCheckBox();
        sports_b.setBounds(210, 175, 20, 20);
        gui.add(sports_b);

        JLabel sports_l = new JLabel("Sports");
        sports_l.setBounds(230, 170, 40, 30);
        gui.add(sports_l);

        JCheckBox videogames_b = new JCheckBox();
        videogames_b.setBounds(90, 205, 20, 20);
        gui.add(videogames_b);

        JLabel videogames_l = new JLabel("Videogames");
        videogames_l.setBounds(110, 200, 70, 30);
        gui.add(videogames_l);

        JCheckBox cooking_b = new JCheckBox();
        cooking_b.setBounds(180, 205, 20, 20);
        gui.add(cooking_b);

        JLabel cooking_l = new JLabel("Cooking");
        cooking_l.setBounds(200, 200, 50, 30);
        gui.add(cooking_l);

        JCheckBox other_b = new JCheckBox();
        other_b.setBounds(250, 205, 20, 20);
        gui.add(other_b);

        JLabel other_l = new JLabel("Other");
        other_l.setBounds(270, 200, 30, 30);
        gui.add(other_l);

        JTextField other_t = new JTextField("");
        other_t.setBounds(305, 200, 70, 30);
        gui.add(other_t);

        JButton save_b = new JButton("Save");
        save_b.setBounds(140, 240, 70, 30);
        save_b.setBackground(Color.GREEN);
        gui.add(save_b);
        save_b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                java.util.List<String> tempHobbies = new java.util.ArrayList<String>();
                if (music_b.isSelected())
                    tempHobbies.add(music_l.getText());
                if (movies_b.isSelected())
                    tempHobbies.add(movies_l.getText());
                if (sports_b.isSelected())
                    tempHobbies.add(sports_l.getText());
                if (videogames_b.isSelected())
                    tempHobbies.add(videogames_l.getText());
                if (cooking_b.isSelected())
                    tempHobbies.add(cooking_l.getText());
                if (other_b.isSelected())
                    tempHobbies.add(other_t.getText());
                Person newPerson = new Person(Integer.parseInt(id_t.getText()), name_t.getText(), male_b.isSelected(), civil_state_cb.getSelectedItem().toString(), tempHobbies);
                appPeople.add(newPerson);

                id_t.setText("");
                name_t.setText("");
                other_t.setText("");
                sexGroup.clearSelection();
                music_b.setSelected(false);
                movies_b.setSelected(false);
                sports_b.setSelected(false);
                videogames_b.setSelected(false);
                cooking_b.setSelected(false);
                other_b.setSelected(false);

                System.out.println(appPeople.toString());
            }
        });

        JButton cancel_b = new JButton("Cancel");
        cancel_b.setBounds(210, 240, 70, 30);
        cancel_b.setBackground(Color.RED);
        gui.add(cancel_b);
        cancel_b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        gui.setVisible(true);
        System.out.println("Main terminal!");
    }
}
