package listeners.window;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class ButtonMouseListener extends MouseAdapter implements MouseListener {
    private Color sourceBackground;

    @Override
    public void mouseClicked(MouseEvent e) {
        JButton button = (JButton) e.getSource();
        System.out.println(button.getText());
    }
    @Override
    public void mouseEntered(MouseEvent e) {
        JButton button = (JButton) e.getSource();
        sourceBackground = button.getBackground();
        button.setBackground(Color.blue);
    }
    @Override
    public void mouseExited(MouseEvent e) {
        JButton button = (JButton) e.getSource();
        button.setBackground(sourceBackground);
    }
}
