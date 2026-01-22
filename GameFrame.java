import java.util.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

import static java.lang.System.*;

public class GameFrame extends JFrame {
    private void init() {
        // set window size
        this.setSize(300, 300);
        // make the window close
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        // make non-resizable
        this.setResizable(false);
        // make visible
        this.setVisible(true);
        // set background color
        this.getContentPane().setBackground(Color.LIGHT_GRAY);
        // Create panel and button for start
        JPanel panel = new JPanel();
        JButton button1 = new JButton("START");
        // add panel with button to window
        this.add(panel);
        panel.add(button1);
        // set the layout and minimun size
        this.setLayout(new FlowLayout());
        this.setMinimumSize(new Dimension(300, 300));
        // pack
        this.pack();
        // make visible
        this.setVisible(true);
        // give the button a purpose
        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                JOptionPane.showMessageDialog(getComponent(0), "START");
            }
        });
    }
    // title and starting the window
    public GameFrame() {
        super("Snake");
        init();
    }
}