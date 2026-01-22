import java.util.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

import static java.lang.System.*;

public class GameFrame extends JFrame {
    private void init() {
        this.setSize(300, 300);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setVisible(true);
        this.getContentPane().setBackground(Color.LIGHT_GRAY);
        JPanel panel = new JPanel();
        JButton button1 = new JButton("START");
        this.add(panel);
        panel.add(button1);
        this.setLayout(new FlowLayout());
        this.setMinimumSize(new Dimension(300, 300));
        this.pack();
        this.setVisible(true);
        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                JOptionPane.showMessageDialog(getComponent(0), "START");
            }
        });
    }
    public GameFrame() {
        super("Snake");
        init();
    }
}