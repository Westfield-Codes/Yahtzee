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

    layout.setHorizontalGroup(hGroup);

    GroupLayout.SequentialGroup vGroup = layout.createSequentialGroup();

    vGroup.addGroup(layout.createParallelGroup().addComponent(ones));

    vGroup.addComponent(twos);
    vGroup.addComponent(threes);
    vGroup.addComponent(fours);
    vGroup.addComponent(fives);
    vGroup.addComponent(sixes);
    vGroup.addComponent(threeOfAKind);
    vGroup.addComponent(fourOfAKind);
    vGroup.addComponent(fullHouse);
    vGroup.addComponent(smallStraight);
    vGroup.addComponent(largeStraight);
    vGroup.addComponent(yahtzee);
    vGroup.addComponent(chance);

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
