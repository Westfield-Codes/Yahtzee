package main.ui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.border.Border;
import javax.swing.*;

import main.ui.GameGraphics;
import main.ui.event.ScoreButtonAction;

public class ScoringMenuUI {
  private static JPanel container;

  public static JButton[] btnsScore;

  private static String[] labelIDs = {
      "Ones", "Twos", "Threes", "Fours", "Fives", "Sixes",
      "Three of a Kind", "Four of a Kind", "Full House", "Small Straight",
      "Large Straight", "Yahtzee", "Chance"
  };

  public static void createScoringMenu() {
    container = new JPanel();

    // container.setBounds(100, 100, 250, 500);

    // NOTE: Actual bounds are below. The ones above are for TESTING ONLY.
    container.setBounds(1300, 100, 250, 500);

    // container.setBackground(Color.BLUE);

    // Creates a temporary border around the scoreboard.
    Border b = BorderFactory.createLineBorder(Color.BLACK);

    GridLayout layout = new GridLayout(13, 2, 10, 10);

    container.setLayout(layout);

    btnsScore = new JButton[13];

    JLabel[] jLabels = new JLabel[13];

    for (int i = 0; i < 13; i++) {
      jLabels[i] = new JLabel(labelIDs[i]);
      btnsScore[i] = new JButton("Score");

      jLabels[i].setBorder(b);
      btnsScore[i].setBorder(b);

      jLabels[i].setHorizontalAlignment(JLabel.CENTER);
      btnsScore[i].setHorizontalAlignment(JLabel.CENTER);

      // Uncomment the line below to disable the button when it is pressed.
      // btnsScore[i].addActionListener(new ScoreButtonAction(i));

      container.add(jLabels[i]);
      container.add(btnsScore[i]);
    }

    container.setBorder(b);

    GameGraphics.frame.add(container);
  }
}
