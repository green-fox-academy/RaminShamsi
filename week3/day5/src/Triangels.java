import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Triangels {
  public static void mainDraw(Graphics graphics) {
    int xPickUp = 350;
    int yPickUp = 100;
    int edge = 200;
    int numberOfIteration = 6;
    graphics.setColor(Color.yellow);
    triangle(graphics,xPickUp,yPickUp,edge);
    tRecursion(graphics, xPickUp, yPickUp, edge, numberOfIteration);
  }

  private static void tRecursion(Graphics graphics, int xPickUp, int yPickUp, int edge, int n) {
    if (n > 0) {
      triangle(graphics,xPickUp,yPickUp,edge);
      graphics.setColor(Color.RED);
      tRecursion(graphics, xPickUp + edge / 2, yPickUp, edge / 2, n - 1);
      graphics.setColor(Color.BLUE);
      tRecursion(graphics, xPickUp - edge / 2, yPickUp, edge / 2, n - 1);
      graphics.setColor(Color.green);
      tRecursion(graphics, xPickUp, (int) (yPickUp + edge * Math.sin(Math.toRadians(60))), edge / 2, n - 1);
    }
  }

  private static void triangle(Graphics graphics, int xPickUp, int yPickUp, int edge) {
    int[] xP = {xPickUp, xPickUp + edge / 2, xPickUp - edge / 2};
    int yS = (int) (yPickUp + edge * Math.sin(Math.toRadians(60)));
    int[] yP = {yPickUp, yS, yS};
    int nP = 3;
    graphics.fillPolygon(xP, yP, nP);
  }

  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setSize(new Dimension(700, 700));
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

