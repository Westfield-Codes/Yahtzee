package main.functions;

import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

import main.functions.Die;

public class GameGraphics {

    private static JFrame frame;

    // All of the image paths
    // NOTE: Only DIE_ONE_PATH currently has an image!
    private static final String DIE_ONE_PATH = "./imgs/die_1.png";
    // private static final String DIE_TWO_PATH = "./imgs/die_2.png";
    // private static final String DIE_THREE_PATH = "./imgs/die_3.png";
    // private static final String DIE_FOUR_PATH = "./imgs/die_4.png";
    // private static final String DIE_FIVE_PATH = "./imgs/die_5.png";
    // private static final String DIE_SIX_PATH = "./imgs/die_6.png";

    /* 
     * Shows the UI.
     * Currently a work in progress. 
     */
    public static void show() {
        frame = new JFrame();

        frame.setSize(1600, 900);

        frame.setLayout(null);

        GameGraphics.drawDie(DIE_ONE_PATH, 275, 150);
        GameGraphics.drawDie(DIE_ONE_PATH, 500, 150);
        GameGraphics.drawDie(DIE_ONE_PATH, 725, 150);
        GameGraphics.drawDie(DIE_ONE_PATH, 950, 150);
        GameGraphics.drawDie(DIE_ONE_PATH, 1175, 150);

        frame.setVisible(true);
    }

    /*
     * Draws the die to the screen.
     */
    public static void drawDie(String path, int x, int y) {
        Die img = new Die(path);

        JLabel imgLabel = new JLabel(img);

        imgLabel.setBounds(x, y, 150, 150);

        frame.add(imgLabel);
    }
}
