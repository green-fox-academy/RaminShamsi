/**
 * Created by HP on 3/28/2017.
 */

import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class CenterBoxFunction {
  public static void mainDraw(Graphics graphics) {
    // create a square drawing function that takes 1 parameter:
    // the square size
    // and draws a square of that size to the center of the canvas.
    // draw 3 squares with that function.

    for (int i = 1; i < 4; i++) {
      int size = (int) (255 * Math.random());
      int g = (int) (255 * Math.random());
      int b = (size + g) / 2;
      graphics.setColor(new Color(size, g, b));
      Square(graphics, size);
    }
  }

  public static void Square(Graphics g, int length) {
    int[] xP = {150 - length / 2, 150 + length / 2, 150 + length / 2, 150 - length / 2};
    int[] yP = {150 - length / 2, 150 - length / 2, 150 + length / 2, 150 + length / 2};
    int nP = 4;
    g.drawPolygon(xP, yP, nP);
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
