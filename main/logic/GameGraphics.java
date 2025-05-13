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

        // Sets up the JFrame (window that holds the graphics)
        frame = new JFrame();

        frame.setSize(1600, 900);

        // This allows us to place elements absolutely, so that it does not default to a grid-like shape.
        // May be changed in the future, but for early in the project, this works.
        frame.setLayout(null);

        // Draws the dice, with the formate IMG_FILE_PATH, x position, y position
        GameGraphics.drawDie(DIE_ONE_PATH, 275, 150);
        GameGraphics.drawDie(DIE_ONE_PATH, 500, 150);
        GameGraphics.drawDie(DIE_ONE_PATH, 725, 150);
        GameGraphics.drawDie(DIE_ONE_PATH, 950, 150);
        GameGraphics.drawDie(DIE_ONE_PATH, 1175, 150);

        // Draws the hold buttons under the dice, with the x and y coordinates, then the button index.
        // The button index is currently used to identify which button is pressed, through a JButton[] array.
        GameGraphics.drawHoldButton(300, 350, 0);
        GameGraphics.drawHoldButton(525, 350, 1);
        GameGraphics.drawHoldButton(750, 350, 2);
        GameGraphics.drawHoldButton(975, 350, 3);
        GameGraphics.drawHoldButton(1200, 350, 4);

        // Informally creates the frame, so that the user can see it.
        frame.setVisible(true);
    }

    /*
     * Draws the die to the screen.
     * Parameters: path is the path to the image to draw,
     *             x is the x coordinate to draw, from the top left corner,
     *             y is the y coordinate to draw, from the top-left corner.
     * Returns: None
     */
    public static void drawDie(String path, int x, int y) {
        Die img = new Die(path);

        JLabel imgLabel = new JLabel(img);

        // Parameters for setBounds(): X-pos, Y-pos, Width, Height
        imgLabel.setBounds(x, y, 150, 150);

        frame.add(imgLabel);
    }

    /*
     * Draws the "Hold" Button to the screen, currently under the die.
     * Parameters: x is the x coordinate to draw, from the top left corner,
     *             y is the y coordinate to draw, from the top-left corner.
     *             btnIndex is a number [0-4] (inclusive) that allows the program to determine what button is being used.
     * Returns: None
     */
    private static void drawHoldButton(int x, int y, int btnIndex) {
        JButton button = new JButton("Hold");

        // The String in the first parameter of HoldButtonAction is what is printed when the button is pressed.
        button.addActionListener(new HoldButtonAction("Hello World! TEST", new ImageIcon(DIE_ONE_PATH), btnIndex));

        button.setBounds(x, y, 100, 20);

        frame.add(button);
    }
}
