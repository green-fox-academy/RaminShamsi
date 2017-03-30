import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinesInSquare {
  public static void mainDraw(Graphics graphics) {
    int xCorner = 20;
    int yCorner = 20;
    int width = 600;
    int height = 600;
    graphics.setColor(Color.YELLOW);
    graphics.fillRect(xCorner, yCorner, width, height);

    lines(graphics, xCorner, yCorner, width, height);

  }

  public static void lines(Graphics graphics, int xCorner, int yCorner, int width, int height) {
    int xP1, xP2, yP1, yP2, xP3, yP3, xP4, yP4, xP5, yP5, xP6, yP6, xP7, yP7, xP8, yP8;
    if (width == 0 && height == 0) {
    } else {
      graphics.setColor(Color.black);
      xP1 = xCorner + width / 3;
      xP2 = xCorner + 2 * width / 3;
      yP1 = yCorner;
      yP2 = yP1;

      xP3 = xP1;
      xP4 = xP2;
      yP3 = yCorner + height;
      yP4 = yP3;
      graphics.drawLine(xP1, yP1, xP3, yP3);
      graphics.drawLine(xP2, yP2, xP4, yP4);
////////////////////////////////////////////////////
      xP5 = xCorner;
      xP6 = xCorner + width;
      yP5 = yCorner + height / 3;
      yP6 = yP5;
      graphics.drawLine(xP5, yP5, xP6, yP6);
      xP7 = xP5;
      xP8 = xP6;
      yP7 = yCorner + 2 * height / 3;
      yP8 = yP7;
      graphics.drawLine(xP7, yP7, xP8, yP8);
////////////////////////////////////////////////
      lines(graphics, xCorner + width / 3, yCorner, width / 3, height / 3);
      lines(graphics, xCorner, yCorner + width / 3, width / 3, height / 3);
      lines(graphics, xCorner + width / 3, yCorner + 2 * width / 3, width / 3, height / 3);
      lines(graphics, xCorner + 2 * width / 3, yCorner + width / 3, width / 3, height / 3);
    }
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
