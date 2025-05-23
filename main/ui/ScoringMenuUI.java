package main.ui;

import java.awt.Color;
import javax.swing.border.Border;
import javax.swing.*;

import main.ui.GameGraphics;

public class ScoringMenuUI {
  private static JPanel container;

  public static void createScoringMenu() {
    container = new JPanel();

    // container.setBounds(100, 100, 250, 500);

    // NOTE: Actual bounds are below. The ones above are for TESTING ONLY.
    container.setBounds(1300, 100, 250, 500);

    // container.setBackground(Color.BLUE);

    Border b = BorderFactory.createLineBorder(Color.BLACK);

    container.setBorder(b);

    // NOTE: The labels have to be on both the x and y coordinates for this to work!
    // For example, l2 has to be connected to both hGroup and vGroup.

    GroupLayout layout = new GroupLayout(container);

    JLabel ones = new JLabel("Ones");
    JLabel twos = new JLabel("Twos");
    JLabel threes = new JLabel("Threes");
    JLabel fours = new JLabel("Fours");
    JLabel fives = new JLabel("Fives");
    JLabel sixes = new JLabel("Sixes");

    JLabel threeOfAKind = new JLabel("3 of a Kind");
    JLabel fourOfAKind = new JLabel("4 of a Kind");
    JLabel fullHouse = new JLabel("Full House");
    JLabel smallStraight = new JLabel("Small Straight");
    JLabel largeStraight = new JLabel("Large Straight");
    JLabel yahtzee = new JLabel("Yahtzee");
    JLabel chance = new JLabel("Chance");

    JButton[] btnsScore = new JButton[13];

    for (int i = 0; i < 13; i++) {
      btnsScore[i] = new JButton("Score");
    }

    // JButton btnOnes = new JButton("Score");
    // JButton btnTwo = new JButton("Score");
    // JButton btnOnes = new JButton("Score");
    // JButton btnOnes = new JButton("Score");
    // JButton btnOnes = new JButton("Score");
    // JButton btnOnes = new JButton("Score");
    // JButton btnOnes = new JButton("Score");
    // JButton btnOnes = new JButton("Score");

    layout.setAutoCreateGaps(true);

    layout.setAutoCreateContainerGaps(true);

    GroupLayout.SequentialGroup hGroup = layout.createSequentialGroup();

    hGroup.addGroup(layout.createParallelGroup()
        .addComponent(ones)
        .addComponent(twos)
        .addComponent(threes)
        .addComponent(fours)
        .addComponent(fives)
        .addComponent(sixes)
        .addComponent(threeOfAKind)
        .addComponent(fourOfAKind)
        .addComponent(fullHouse)
        .addComponent(smallStraight)
        .addComponent(largeStraight)
        .addComponent(yahtzee)
        .addComponent(chance));

    hGroup.addGroup(layout.createParallelGroup()
        .addComponent(btnsScore[0])
        .addComponent(btnsScore[1])
        .addComponent(btnsScore[2])
        .addComponent(btnsScore[3])
        .addComponent(btnsScore[4])
        .addComponent(btnsScore[5])
        .addComponent(btnsScore[6])
        .addComponent(btnsScore[7])
        .addComponent(btnsScore[8])
        .addComponent(btnsScore[9])
        .addComponent(btnsScore[10])
        .addComponent(btnsScore[11])
        .addComponent(btnsScore[12]));

    layout.setHorizontalGroup(hGroup);

    GroupLayout.SequentialGroup vGroup = layout.createSequentialGroup();

    vGroup.addGroup(layout.createParallelGroup().addComponent(ones).addComponent(btnsScore[0]));

    vGroup.addComponent(twos).addComponent(btnsScore[1]);
    vGroup.addComponent(threes).addComponent(btnsScore[2]);
    vGroup.addComponent(fours).addComponent(btnsScore[3]);
    vGroup.addComponent(fives).addComponent(btnsScore[4]);
    vGroup.addComponent(sixes).addComponent(btnsScore[5]);
    vGroup.addComponent(threeOfAKind).addComponent(btnsScore[6]);
    vGroup.addComponent(fourOfAKind).addComponent(btnsScore[7]);
    vGroup.addComponent(fullHouse).addComponent(btnsScore[8]);
    vGroup.addComponent(smallStraight).addComponent(btnsScore[9]);
    vGroup.addComponent(largeStraight).addComponent(btnsScore[10]);
    vGroup.addComponent(yahtzee).addComponent(btnsScore[11]);
    vGroup.addComponent(chance).addComponent(btnsScore[12]);

    // vGroup.addGroup(layout.createParallelGroup().addComponent(new
    // JLabel("3")).addComponent(new JLabel("6")));

    // vGroup.addComponent(new JLabel("3"));
    //
    // vGroup.addComponent(new JLabel("4"));

    layout.setVerticalGroup(vGroup);

    container.setLayout(layout);

    GameGraphics.frame.add(container);
  }
}
