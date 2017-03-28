/**
 * Created by HP on 3/28/2017.
 */

import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FunctionToCenter {
  public static void mainDraw(Graphics graphics) {
    // create a line drawing function that takes 2 parameters:
    // the x and y coordinates of the line's starting point
    // and draws a line from that point to the center of the canvas.
    // fill the canvas with lines from the edges, every 20 px, to the center.
    int n = 20;
    toCenter(graphics, n);
  }

  private static void toCenter(Graphics graphics, int n) {
    int x, y;
    for (int i = 0; i < 16; i++) {
      graphics.drawLine(150, 150, i * n, 0);
      graphics.drawLine(150, 150, i * n, 300);
      graphics.drawLine(150, 150, 0, i * n);
      graphics.drawLine(150, 150, 300, i * n);
    }
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
