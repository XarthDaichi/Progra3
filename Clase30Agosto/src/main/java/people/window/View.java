package people.window;

import people.logic.Person;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class View {
    private JLabel idLbl;
    private JTextField idTxt;
    private JLabel nameLbl;
    private JTextField nameTxt;
    private JPanel savingPanel;
    private JLabel genderLbl;
    private JRadioButton maleButton;
    private JRadioButton femaleButton;
    private JRadioButton nbButton;
    private JLabel maritalStatusLbl;
    private JComboBox maritalStatusCB;
    private JLabel hobbiesLbl;
    private JPanel genderPanel;
    private JPanel hobbiesPanel;
    private JCheckBox musicCheckBox;
    private JCheckBox moviesCheckBox;
    private JCheckBox sportsCheckBox;
    private JCheckBox videogamesCheckBox;
    private JCheckBox cookingCheckBox;
    private JCheckBox otherCheckBox;
    private JTextField otherTxt;
    private JButton saveButton;
    private JButton cancelButton;
    private JPanel buttonPanel;

    public View() {
        cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }
    public JPanel getSavingPanel() {
        return savingPanel;
    }

    public JButton getSaveButton() {
        return saveButton;
    }

    public JTextField getIdTxt() {
        return idTxt;
    }

    public JTextField getNameTxt() {
        return nameTxt;
    }

    public JRadioButton getMaleButton() {
        return maleButton;
    }

    public JRadioButton getFemaleButton() {
        return femaleButton;
    }

    public JRadioButton getNbButton() {
        return nbButton;
    }

    public JComboBox getMaritalStatusCB() {
        return maritalStatusCB;
    }

    public JCheckBox getMusicCheckBox() {
        return musicCheckBox;
    }

    public JCheckBox getMoviesCheckBox() {
        return moviesCheckBox;
    }

    public JCheckBox getSportsCheckBox() {
        return sportsCheckBox;
    }

    public JCheckBox getVideogamesCheckBox() {
        return videogamesCheckBox;
    }

    public JCheckBox getCookingCheckBox() {
        return cookingCheckBox;
    }

    public JCheckBox getOtherCheckBox() {
        return otherCheckBox;
    }

    public JTextField getOtherTxt() {
        return otherTxt;
    }
}

