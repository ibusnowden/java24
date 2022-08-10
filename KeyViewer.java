package java24hours;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class KeyViewer extends JFrame {
    JTextField KeyText = new JTextField(80);
    JLabel KeyLabel = new JLabel("Press any key in the text field.");

    public KeyViewer() {
        super("KeyViewer");
        setSize(350, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Anonymous inner class
        KeyText.addKeyListener(new KeyAdapter() {
            public void KeyTyped(KeyEvent input) {
                char key = input.getKeyChar();
                KeyLabel.setText("You pressed " + key);
            }
        });
        BorderLayout bord = new BorderLayout();
        setLayout(bord);
        add(KeyLabel, BorderLayout.NORTH);
        add(KeyText, BorderLayout.CENTER);
        setVisible(true);
    }

    public static void main(String[] args) {
        new KeyViewer();
    }

}
