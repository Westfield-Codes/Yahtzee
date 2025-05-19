package main.ui;

import java.awt.Color;
import javax.swing.border.Border;
import javax.swing.*;

import main.ui.GameGraphics;

public class ScoringMenuUI {
    private static JPanel container;

    public static void createScoringMenu() {
        container = new JPanel();

        container.setBounds(1300, 100, 250, 500);

        // container.setBackground(Color.BLUE);

        Border b = BorderFactory.createLineBorder(Color.BLACK);

        container.setBorder(b);

        GameGraphics.frame.add(container);
    }
}
