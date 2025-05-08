package main.functions;

import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

public class GameGraphics {
    
    private static JFrame frame;
    
    private static final String DIE_ONE_PATH = "./imgs/die_one.png";

    public static void show() {
        frame = new JFrame();

        frame.setSize(1600, 900);

        GameGraphics.drawDie(DIE_ONE_PATH);

        frame.setVisible(true);
    }

    private static void drawDie(String path) {
        ImageIcon img = new ImageIcon(path);

        JLabel imgLabel = new JLabel(img);

        frame.add(imgLabel);
    }
}