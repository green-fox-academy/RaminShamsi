import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Tree {
  private static void mainDraw(Graphics graphics) {
    int xStart = 700;
    int yStart = 600;
    float alpha = 90;
    int length = 50;
    int numberOfIteration = 10;

    graphics.setColor(Color.black);
    graphics.fillRect(0, 0, 1400, 750);

    Branch(graphics, xStart, yStart, alpha, length, numberOfIteration);
  }

  private static void Branch(Graphics graphics, double xStart, double yStart,
                             float alpha, int length, int n) {
/*
    graphics.setColor(new Color((float) Math.random(), (float) Math.random(), (float) Math.random()));
    double xEnd = xStart +  (length * Math.cos(Math.toRadians(alpha)));
    double yEnd = yStart -  (length * Math.sin(Math.toRadians(alpha)));
    graphics.drawLine((int) xStart, (int) yStart, (int) xEnd, (int) yEnd);
*/
    double[] Ends = makeLine(graphics, xStart, yStart, alpha, length);
    double xEnd = Ends[0];                                                 // reading back the return values
    double yEnd = Ends[1];

    if (n > 0) {
      Branch(graphics, xEnd, yEnd, alpha + 20, length, n - 1);
      Branch(graphics, xEnd, yEnd, alpha, length, n - 1);
      Branch(graphics, xEnd, yEnd, alpha - 20, length, n - 1);
    }
  }

  private static double[] makeLine(Graphics graphics, double xStart, double yStart,
                                   float alpha, int length) {
    double[] Ends = new double[2];
    graphics.setColor(new Color((float) Math.random(), (float) Math.random(), (float) Math.random()));
    Ends[0] = xStart + (int) (length * Math.cos(Math.toRadians(alpha)));
    Ends[1] = yStart - (int) (length * Math.sin(Math.toRadians(alpha)));
    graphics.drawLine((int) xStart, (int) yStart, (int) Ends[0], (int) Ends[1]); // casting back to integer for drawing
    return Ends;                          // Bringing back xEnds, yEnds in form of array
  }

  //    Don't touch the code below
  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setSize(new Dimension(1400, 750));
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