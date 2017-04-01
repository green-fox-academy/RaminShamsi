import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Squares {
  public static void mainDraw(Graphics graphics) {
    int xPickUp = 350;
    int yPickUp = 330;
    int edge = 150;
    int numberOfIteration = 5;
    graphics.setColor(Color.black);
    square(graphics, xPickUp, yPickUp, edge);
    squareRecursion(graphics, xPickUp, yPickUp, edge, numberOfIteration);
  }

  private static void squareRecursion(Graphics graphics, int xPickUp, int yPickUp, int edge, int n) {
    if (n > 0) {
      square(graphics, xPickUp, yPickUp, edge);
      graphics.setColor(new Color((float) Math.random(), (float) Math.random(), (float) Math.random()));

      squareRecursion(graphics, xPickUp + edge, yPickUp, edge / 3, n - 1);
      squareRecursion(graphics, xPickUp - edge, yPickUp, edge / 3, n - 1);

      squareRecursion(graphics, xPickUp, yPickUp + edge, edge / 3, n - 1);
      squareRecursion(graphics, xPickUp, yPickUp - edge, edge / 3, n - 1);

      squareRecursion(graphics, xPickUp + edge, yPickUp + edge, edge / 3, n - 1);
      squareRecursion(graphics, xPickUp - edge, yPickUp - edge, edge / 3, n - 1);

      squareRecursion(graphics, xPickUp + edge, yPickUp - edge, edge / 3, n - 1);
      squareRecursion(graphics, xPickUp - edge, yPickUp + edge, edge / 3, n - 1);
    }
  }

  private static void square(Graphics graphics, int xPickUp, int yPickUp, int edge) {

    graphics.fillRect(xPickUp - edge / 2, yPickUp - edge / 2, edge, edge);
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

