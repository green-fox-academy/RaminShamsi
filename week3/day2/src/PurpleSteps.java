/**
 * Created by HP on 3/28/2017.
 */

import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class PurpleSteps {
  public static void mainDraw(Graphics graphics) {
    // reproduce this:
    // [https://github.com/greenfox-academy/teaching-materials/blob/master/exercises/drawing/purple-steps/r3.png]

    for (int repeat = 0; repeat < 20; repeat++) {
      int r = (int) (255 * Math.random());
      int g = (int) (255 * Math.random());
      int b = (int) (255 * Math.random());
      graphics.setColor(new Color(r, g, b));
      Square(graphics, 10, repeat);
    }
  }

  public static void Square(Graphics g, int size, int n) {
    int xStart = 10;
    int yStart = 10;
    int[] xPoint = {xStart + n * size, xStart + (n + 1) * size, xStart + (n + 1) * size, xStart + n * size};
    int[] yPoint = {yStart + n * size, yStart + n * size, yStart + (n + 1) * size, yStart + (n + 1) * size,};
    int nPoints = 4;
    g.fillPolygon(xPoint, yPoint, nPoints);
  }

  //    Don't touch the code below
  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setSize(new Dimension(320, 343));
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
