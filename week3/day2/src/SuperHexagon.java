import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class SuperHexagon {
  public static void mainDraw(Graphics graphics) {
    // reproduce this:
    // [https://github.com/greenfox-academy/teaching-materials/blob/master/exercises/drawing/super-hexagon/r6.gif]
    int edge = 20;
    int xTop = 300;    //  x coordinate of center of the Top first hexagon at Middle column
    int yTop = 50;     //  y coordinate of center of the Top first hexagon at Middle column
    int maxNumInMiddle = 11;
    superHexagon(graphics, xTop, yTop, edge, maxNumInMiddle);
  }

  private static void superHexagon(Graphics graphics, int xTop, int yTop, int edge, int maxNumInMiddle) {
    int xStartLeft, xStartRight, yS;
    double h = 0.5 * edge * Math.pow(3, 0.5);
    yS = yTop;
    for (int j = 0; j < (maxNumInMiddle - 1) / 2 + 1; j++) {
      xStartLeft = xTop - j * (3 * edge / 2);    //!!!! x coordinate of center of the first hexagon at LEFT column
      hexagon(graphics, xStartLeft, yS, edge, maxNumInMiddle, j);
      xStartRight = xTop + j * (3 * edge / 2);    //!!!! x coordinate of center of the first hexagon at RIGHT column
      hexagon(graphics, xStartRight, yS, edge, maxNumInMiddle, j);
      yS = yTop + (j + 1) * (int) h;    //!!!! yS coordinate of center of the first hexagon at RIGHT&LEFT column
    }
  }

  private static void hexagon(Graphics graphics, int xStart, int yS, int edge, int maxNumInMiddle, int j) {
    int xS;
    double h = 0.5 * edge * Math.pow(3, 0.5);
    for (int i = 0; i < maxNumInMiddle - j; i++) {
      xS = xStart;
      int x1 = xS - edge / 2;
      int x2 = xS + edge / 2;
      int x3 = xS + edge;
      int x4 = x2;
      int x5 = x1;
      int x6 = xS - edge;
      int y1 = yS - (int) h;
      int y2 = y1;
      int y3 = yS;
      int y4 = yS + (int) h;
      int y5 = y4;
      int y6 = yS;
      int[] xP = {x1, x2, x3, x4, x5, x6};
      int[] yP = {y1, y2, y3, y4, y5, y6};
      int nP = 6;
      graphics.drawPolygon(xP, yP, nP);
      yS += 2 * h;
    }
  }

  //    Don't touch the code below

  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setSize(new Dimension(600, 600));
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