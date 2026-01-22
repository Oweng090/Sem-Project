import java.util.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

import static java.lang.System.*;

public class GameFrame {
    public static void main(String[] args) {
        // Create a JFrame named gameFrame for all of the game components
        JFrame gameFrame = new JFrame("Snake");
        // Set size and properties.
        gameFrame.setSize(600, 600);
        gameFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gameFrame.setResizable(false);
        gameFrame.setVisible(true);
        gameFrame.getContentPane().setBackground(Color.LIGHT_GRAY);
        // create a panel to hold button1
        JPanel panel = new JPanel();
        // create button1
        JButton button1 = new JButton();
        // add panel and button to the main frame
        gameFrame.add(panel);
        panel.add(button1);
        // make sure gameFrame is visible
        gameFrame.setVisible(true);
        // Set an action listener so the button shows a message when pressed
        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                JOptionPane.showMessageDialog(gameFrame.getComponent(0), "START");
            }
        });
    }
}