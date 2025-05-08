package main.functions;

import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

public class GameGraphics {
    
    private static JFrame frame;
    
    public static void show() {
        frame = new JFrame();

        frame.setSize(1600, 900);

        // frame.add(new JLabel("Hello World!"));

        GameGraphics.drawDie();

        // ImageIcon img = new ImageIcon("./imgs/die_one.png");

        // JLabel imgLabel = new JLabel(img);

        // frame.add(imgLabel);

        frame.setVisible(true);
    }

    private static void drawDie() {
        ImageIcon img = new ImageIcon("./imgs/die_one.png");

        JLabel imgLabel = new JLabel(img);

        frame.add(imgLabel);
    }
}