/**
 * Created by HP on 3/28/2017.
 */

import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class SuperHexagon {
  public static void mainDraw(Graphics graphics) {
    // reproduce this:
    // [https://github.com/greenfox-academy/teaching-materials/blob/master/exercises/drawing/super-hexagon/r6.gif]
    int edge = 20;
    int xTop = 200;
    int yPickPoint = 100;
    int numberOfLines = 5;
    hexagon(graphics, xTop, yPickPoint, edge, numberOfLines);

  }

  private static void hexagon(Graphics graphics, int xTop, int yPickPoint, int edge, int numberOfLines) {
    int xStart, xS;
    double h = 0.5 * edge * Math.pow(3, 0.5);
    for (int j = 0; j < numberOfLines; j++) {
      xStart = xTop - j * (3 * edge / 2);          // xStart = x coordinate of top point of first triangle at each line
      for (int i = 0; i < j + 1; i++) {
        xS = xStart + 3 * edge * i;
        int x1 = xS - edge / 2;
        int x2 = xS + edge / 2;
        int x3 = xS + edge;
        int x4 = x2;
        int x5 = x1;
        int x6 = xS - edge;
        int y1 = yPickPoint - (int) h;
        int y2 = y1;
        int y3 = yPickPoint;
        int y4 = yPickPoint + (int) h;
        int y5 = y4;
        int y6 = yPickPoint;
        int[] xP = {x1, x2, x3, x4, x5, x6};
        int[] yP = {y1, y2, y3, y4, y5, y6};
        int nP = 6;
        graphics.drawPolygon(xP, yP, nP);
      }
      yPickPoint += h;
    }
  }

  //    Don't touch the code below
  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setSize(new Dimension(300, 300));
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
