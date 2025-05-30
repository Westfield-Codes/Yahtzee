import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.swing.JFrame;
import javax.swing.JPanel;

import main.Main;

public class rectanglePanel extends JPanel {
    
    int x1 = 200;
    int x2 = 350;

    public void paintComponent(Graphics g) {
      super.paintComponent(g);
      g.setColor(Color.BLACK);
      g.drawRect(x1, 200, 150, 400);
      g.drawLine(x1, 225, x2, 225);
      g.drawLine(x1, 250, x2, 250);
      g.drawLine(x1, 275, x2, 275);
      g.drawLine(x1, 300, x2, 300);
      g.drawLine(x1, 325, x2, 325);
      g.drawLine(x1, 350, x2, 350);
      g.drawLine(x1, 375, x2, 375);
      g.drawLine(x1, 400, x2, 400);
      g.drawLine(x1, 425, x2, 425);
      g.drawLine(x1, 450, x2, 450);
      g.drawLine(x1, 475, x2, 475);
      g.drawLine(x1, 500, x2, 500);
      g.drawLine(x1, 525, x2, 525);
      g.drawLine(x1, 550, x2, 550);
      g.drawLine(x1, 575, x2, 575);

   } 
    public static void main(String[] args) {
        JFrame f = new JFrame("rectangle");
        rectanglePanel p = new rectanglePanel();
        f.setSize(400, 400);
        f.add(p);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);





}

}
