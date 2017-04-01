import javafx.util.Pair;

import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Tree {

  public static void mainDraw(Graphics graphics) {
    int xStart = 280;
    int yStart = 500;
    float alpha = 90;
    int length = 30;
    int numberOfIteration =10;
    graphics.setColor(Color.black);
    graphics.fillRect(0, 0, 600, 600);

    Branch(graphics, xStart, yStart, alpha,  length, numberOfIteration);

  }

  private static void Branch(Graphics graphics, double xStart, double yStart,
                             float alpha,  int length, int n) {

    graphics.setColor(new Color((float) Math.random(), (float) Math.random(), (float) Math.random()));
    double xEnd = xStart +  (length * Math.cos(Math.toRadians(alpha)));
    double yEnd = yStart -  (length * Math.sin(Math.toRadians(alpha)));
    graphics.drawLine((int) xStart, (int) yStart, (int) xEnd, (int) yEnd);

//    makeLine <xEnd, yEnd>( graphics,  xStart,  yStart,  alpha,  length);
//    System.out.println(xEnd);

    if (n > 0) {
      Branch(graphics, xEnd, yEnd, alpha + 20, length, n-1);
      Branch(graphics, xEnd, yEnd, alpha , length, n-1);
      Branch(graphics, xEnd, yEnd, alpha - 20,  length, n-1);

    }
  }

  private static Pair <Integer, Integer> makeLine(Graphics graphics, int xStart, int yStart,
                                                  float alpha, int length) {

    graphics.setColor(new Color((float) Math.random(), (float) Math.random(), (float) Math.random()));
    int xEnd = xStart + (int) (length * Math.cos(Math.toRadians(alpha)));
    int yEnd = yStart - (int) (length * Math.sin(Math.toRadians(alpha)));
    graphics.drawLine( xStart,  yStart,  xEnd,  yEnd);
    return new Pair<>(xEnd, yEnd);
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