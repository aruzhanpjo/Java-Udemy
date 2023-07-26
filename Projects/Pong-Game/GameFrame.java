import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class GameFrame extends JFrame  {
    GamePanel panel;

    GameFrame() {
    
        panel = new GamePanel();
        this.add(panel);
        this.setTitle("the PONG game");

        // so no one would be able to change the size of the window
        this.setResizable(false);
        this.setBackground(Color.darkGray);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);

    }
}