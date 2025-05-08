package main.functions.event;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.ActionEvent;

import main.functions.GameLogic;

public class HoldButtonAction extends AbstractAction {
    
    public HoldButtonAction(String text, ImageIcon icon) {
        super(text, icon);
    }

    public void actionPerformed(ActionEvent e) {
        GameLogic.holdDie();

    }
}
