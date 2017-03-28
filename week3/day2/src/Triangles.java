/**
 * Created by HP on 3/28/2017.
 */

import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Triangles {
  public static void mainDraw(Graphics graphics) {
    // reproduce this:
    // [https://github.com/greenfox-academy/teaching-materials/blob/master/exercises/drawing/triangles/r5.png]
    int s = 30;
    int xStart = 150;
    int xS;
    int yStart = 0;
    double yS = 0.5 * s * Math.pow(3, 0.5);
    for (int j = 0; j < 10; j++) {
      xStart = 150 - j * (s/2);
      for (int i = 0; i < j + 1 ; i++) {
        xS = xStart + s * i;
        int[] xP = {xS, xS + s/2, xS - s/2};
        int[] yP = {yStart, yStart + (int)(yS), yStart + (int)(yS)};
        int nP = 3;
        graphics.drawPolygon(xP, yP, nP);
      }
      yStart += yS;
    }



  }

  //    Don't touch the code below
  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setSize(new Dimension(320, 343));
    jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    jFrame.add(new ImagePanel());
    jFrame.setLocationRelativeTo(null);
    jFrame.setVisible(true);
  }

  static class ImagePanel extends JPanel {
    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      mainDraw(graphics);

    }
  }
}
