package main.ui.event;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import main.ui.GameGraphics;
import main.ui.ScoringMenuUI;

public class ScoreButtonAction implements ActionListener {

  private int btnIndex;

  public ScoreButtonAction(int index) {
    this.btnIndex = index;
  }

  public void actionPerformed(ActionEvent e) {
    JButton scoreButton = ScoringMenuUI.btnsScore[btnIndex];

    scoreButton.setEnabled(false);
  }
}
