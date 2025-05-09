package main.functions;

// Libraries for displaying the window, buttons, images, etc.
import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

// Custom implementations for an image and button, respectively
import main.functions.Die;
import main.functions.event.HoldButtonAction;

/*
 * Runs the graphics side of the program.
 * The majority of the code runs in the show() method. The rest are helper methods.
 */
public class GameGraphics {

    // The frame that contains the UI.
    private static JFrame frame;

    private static JButton[] allButtons;

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

        allButtons = new JButton[5];

        frame.setSize(1600, 900);

        frame.setLayout(null);

        GameGraphics.drawDie(DIE_ONE_PATH, 0, 275, 150);
        GameGraphics.drawDie(DIE_ONE_PATH, 1, 500, 150);
        GameGraphics.drawDie(DIE_ONE_PATH, 2, 725, 150);
        GameGraphics.drawDie(DIE_ONE_PATH, 3, 950, 150);
        GameGraphics.drawDie(DIE_ONE_PATH, 4, 1175, 150);

        GameGraphics.drawHoldButton(300, 350, 0);
        GameGraphics.drawHoldButton(525, 350, 1);
        GameGraphics.drawHoldButton(750, 350, 2);
        GameGraphics.drawHoldButton(975, 350, 3);
        GameGraphics.drawHoldButton(1200, 350, 4);

        frame.setVisible(true);
    }

    /*
     * Draws the die to the screen.
     */
    public static void drawDie(String path, int index, int x, int y) {
        Die img = new Die(path, index);

        JLabel imgLabel = new JLabel(img);

        // Parameters for setBounds(): X-pos, Y-pos, Width, Height
        imgLabel.setBounds(x, y, 150, 150);

        frame.add(imgLabel);
    }

    private static void drawHoldButton(int x, int y, int btnIndex) {
        JButton button = new JButton("Hold");

        // The String in the first parameter of HoldButtonAction is what is printed when the button is pressed.
        button.addActionListener(new HoldButtonAction("Hello World! TEST", new ImageIcon(DIE_ONE_PATH)));

        button.setBounds(x, y, 100, 20);

        allButtons[btnIndex] = button;

        frame.add(button);
    }

    /*
     * Changes the color of a hold button, such that it shows feedback for whether a die is held or not.
     * Parameters: Whether the button is to be enabled (now holding) or not, the index of the button (0-4).
     */
    public static void colorHoldButton(boolean colorEnabled, int btnIndex) {
        // TODO: Work on this function and ensure that it works with a GUI!
        JButton button = allButtons[btnIndex];

        // ? Not sure if this works...
        assert button != null;

        if (colorEnabled) {
            button.setBackground(Color.green);
        }
        else {
            button.setBackground(Color.gray);
        }
    }
}
