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
    int edge = 20;
    int xTop = 250;
    int yStart = 0;
    int numberOfLines = 20;
    triangle (graphics, xTop, yStart, edge, numberOfLines);
  }

  private static void triangle(Graphics graphics, int xTop, int yStart, int edge, int numberOfLines) {
    int xStart, xS;
    double heightOfTriangle = 0.5 * edge * Math.pow(3, 0.5);
    for (int j = 0; j < numberOfLines; j++) {
      xStart = xTop  - j * (edge/2);          // xStart = x coordinate of top point of first triangle at each line
      for (int i = 0; i < j + 1 ; i++) {
        xS = xStart + edge * i;                 // xS = at each specific line, x coordinate of top point of triangle
        int[] xP = {xS, xS + edge/2, xS - edge/2};
        int[] yP = {yStart, yStart + (int)(heightOfTriangle), yStart + (int)(heightOfTriangle)};
        int nP = 3;
        graphics.setColor(Color.RED);
        graphics.drawPolygon(xP, yP, nP);
      }
      yStart += heightOfTriangle;
    }
  }

  //    Don't touch the code below
  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setSize(new Dimension(520, 443));
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
