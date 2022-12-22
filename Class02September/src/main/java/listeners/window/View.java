package listeners.window;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;

public class View {
    private Color add_background;
    private Color cancel_background;
    private JButton addButton;
    private JButton cancelButton;
    private JPanel panel;

    public JPanel getPanel() {
        return panel;
    }

    void playSound(String soundFile) {
        try {
            File audioFile = new File(soundFile).getAbsoluteFile();
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(audioFile);
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
                //Plays audio once
            clip.start();
                //Plays the audio in a loop
            clip.loop(Clip.LOOP_CONTINUOUSLY);
                //Stop the audio
//            clip.stop();
                //optional
//            clip.close();
        } catch (Exception ex) {
            System.out.println("Error loading file");
            System.out.println(System.getProperty("user.dir"));
        }

    }
    public View() {
//        ButtonMouseListener bml = new ButtonMouseListener();
//        addButton.addMouseListener(bml);
//        cancelButton.addMouseListener(bml);
        addButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("Add Clicked!!!");
                add_background = Color.blue;
                addButton.setBackground(Color.blue);
                cancel_background = Color.blue;
                cancelButton.setBackground(Color.blue);
                panel.setBackground(Color.blue);
            }
        });
        cancelButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("Cancel Clicked!!!");
                if (panel.getBackground() == Color.blue)
                    playSound("\\C:\\Users\\Xarthy\\Desktop\\Blue.wav");
            }
        });
        addButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                add_background = addButton.getBackground();
                addButton.setBackground(Color.blue);
            }
        });
        addButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseExited(MouseEvent e) {
                addButton.setBackground(add_background);
            }
        });
        cancelButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                cancel_background = cancelButton.getBackground();
                cancelButton.setBackground(Color.blue);
            }
        });
        cancelButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseExited(MouseEvent e) {
                cancelButton.setBackground(cancel_background);
            }
        });
    }
}
