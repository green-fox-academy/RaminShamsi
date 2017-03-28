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
    int xPickPoint = 100;
    int yPickPoint = 100;
    hexagon(graphics, xPickPoint,yPickPoint,edge);

  }
  private static void hexagon(Graphics graphics, int xPickPoint, int yPickPoint, int edge) {
    double h = 0.5 * edge * Math.pow(3, 0.5);
    int x1 = xPickPoint - edge / 2;
    int x2 = xPickPoint + edge / 2;
    int x3 = xPickPoint + edge;
    int x4 = x2;
    int x5 = x1;
    int x6 = xPickPoint - edge;
    int y1 = yPickPoint - (int) h;
    int y2 = y1;
    int y3 = yPickPoint;
    int y4 = yPickPoint + (int) h;
    int y5 = y4;
    int y6 = yPickPoint;
    int[] xP = {x1, x2, x3, x4, x5, x6};
    int[] yP = {y1, y2,y3,y4,y5,y6};
    int nP = 6;
    graphics.drawPolygon(xP, yP, nP);

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
