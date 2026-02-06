// imports
import java.util.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

import static java.lang.System.*;

public class GameFrame extends JFrame implements Runnable {
    private Thread gameThread;
    private boolean running = false;
    private JFrame window;

    private void init() {
        // set window size
        this.setSize(800, 800);
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
        panel.setBackground(Color.DARK_GRAY);
        JButton button1 = new JButton("START");
        button1.setBackground(Color.LIGHT_GRAY);
        // add panel with button to window
        this.add(panel);
        panel.add(button1);
        // set the layout and minimun size
        this.setLayout(new FlowLayout());
        this.setMinimumSize(new Dimension(800, 800));
        // pack
        this.pack();
        // make visible
        this.setVisible(true);
        // give the button a purpose
        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                // Remove the panel containing 'button1'
                GameFrame.this.remove(panel);
                GameFrame.this.SnakeSpawn(getGraphics());
                GameFrame.this.revalidate();
                GameFrame.this.repaint();
            }
        });
    }
    // title and starting the window
    public GameFrame() {
        super("Snake");
        init();
    }

    public void startGameThread() {
        gameThread = new Thread(this);
        gameThread.start();

    }

    @Override
    public void run() {
        // game loop
        while (running) {
            // update game state
            // Draw/Render to screen
            repaint();
        }
    }

    @Override
    public void paint(Graphics g) { 
        super.paint(g); // Clears the screen
        // Custom drawing code here using Graphics object g
        // This is the background for snake 
        g.fillRect(0, 0, 800, 800); // makes a rectangle (x, y, width, height)
        g.dispose(); // release graphics resources
    }
    
    public void SnakeSpawn(Graphics g) {
        super.paint(g);
        g.setColor(Color.GREEN);
        g.drawRect(50, 50, 15, 15);
    }
}