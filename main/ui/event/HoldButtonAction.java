package main.ui.event;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import main.logic.GameLogic;
import main.logic.GameGraphics;

public class HoldButtonAction implements ActionListener { // extends AbstractAction {
    
    private int btnIndex;
    private String text;
    private ImageIcon img;

    public HoldButtonAction(String text, ImageIcon img, int index) {
        this.text = text;
        this.img = img;
        this.btnIndex = index;
    }

    public void actionPerformed(ActionEvent e) {
        //GameLogic.holdDie(GameGraphics.allDice[this.btnIndex]);
    }
}
