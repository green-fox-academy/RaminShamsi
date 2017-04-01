import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class HexagonRecursion {
  public static void mainDraw(Graphics graphics) {
    int xStart = 320;
    int yStart = 300;
    int edge = 300;
    hRecursion(graphics, xStart, yStart, edge);
  }

  private static void hRecursion(Graphics graphics, double xStart, double yStart, double edge) {
    if (edge < 75) {
      // if the edge gets smaller than 10, finish Recursion
    } else {

      hexagon(graphics, xStart, yStart, edge);
      hRecursion(graphics,
              xStart -  (edge / 2 * Math.cos(Math.toRadians(60))),
              yStart -  (edge / 2 * Math.sin(Math.toRadians(60))),
              edge / 2);
      hRecursion(graphics, xStart + edge / 2, yStart, edge / 2);
      hRecursion(graphics,
              xStart -  (edge / 2 * Math.cos(Math.toRadians(60))),
              yStart +  (edge / 2 * Math.sin(Math.toRadians(60))),
              edge / 2);
    }
  }

  private static void hexagon(Graphics graphics, double xStart, double yStart, double edge) {

    double xS;
    double h = 0.5 * edge * Math.pow(3, 0.5);
    xS = xStart;
    double x1 = xS - edge / 2;
    double x2 = xS + edge / 2;
    double x3 = xS + edge;
    double x4 = x2;
    double x5 = x1;
    double x6 = xS - edge;
    double y1 = yStart -  h;
    double y2 = y1;
    double y3 = yStart;
    double y4 = yStart +  h;
    double y5 = y4;
    double y6 = yStart;
    int[] xP = {(int)x1, (int)x2, (int)x3, (int)x4, (int)x5, (int)x6};
    int[] yP = {(int)y1,(int) y2, (int)y3,(int) y4, (int)y5, (int)y6};
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
