import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class HexagonRecursion {
  public static void mainDraw(Graphics graphics) {
    int xStart = 300;
    int yStart = 300;
    int edge = 300;
    hRecursion(graphics, xStart, yStart, edge);
  }

  private static void hRecursion(Graphics graphics, int xStart, int yStart, int edge) {
    if (edge < 10) {
      // if the edge gets smaller than 10, finish Recursion
    } else {
      hexagon(graphics, xStart, yStart, edge);
      hRecursion(graphics,
              xStart - (int) (edge / 2 * Math.cos(Math.toRadians(60))),
              yStart - (int) (edge / 2 * Math.sin(Math.toRadians(60))),
              edge / 2);
      hRecursion(graphics, xStart + edge / 2, yStart, edge / 2);
      hRecursion(graphics,
              xStart - (int) (edge / 2 * Math.cos(Math.toRadians(60))),
              yStart + (int) (edge / 2 * Math.sin(Math.toRadians(60))),
              edge / 2);
    }
  }

  private static void hexagon(Graphics graphics, int xStart, int yStart, int edge) {
    int xS;
    double h = 0.5 * edge * Math.pow(3, 0.5);
    xS = xStart;
    int x1 = xS - edge / 2;
    int x2 = xS + edge / 2;
    int x3 = xS + edge;
    int x4 = x2;
    int x5 = x1;
    int x6 = xS - edge;
    int y1 = yStart - (int) h;
    int y2 = y1;
    int y3 = yStart;
    int y4 = yStart + (int) h;
    int y5 = y4;
    int y6 = yStart;
    int[] xP = {x1, x2, x3, x4, x5, x6};
    int[] yP = {y1, y2, y3, y4, y5, y6};
    int nP = 6;
    graphics.drawPolygon(xP, yP, nP);
  }

  //    Don't touch the code below

  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setSize(new Dimension(650, 650));
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
