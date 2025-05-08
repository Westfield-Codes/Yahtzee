package main.functions;

import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

/*
 * An implementation of the ImageIcon class, which allows us to specify the die's number.
 */
public class Die extends ImageIcon {
    private String PATH;
    
    private int num;

    public Die(String path) {
        super(path);
        this.PATH = path;
        this.num = 1;
    }

    public int getNum() {
        return this.num;
    }

    public String getPath() {
        return this.PATH;
    }

    /*
     * Both sets the num variable AND updates the PATH variable.
     */
    public void setDieNum(int newNum) {
        this.num = newNum;
        this.PATH = "./imgs/die_" + newNum + ".png";
    }

    public void setPath(String path) {
        this.PATH = path;
    }
}
