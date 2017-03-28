/**
 * Created by HP on 3/28/2017.
 */

import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class PurpleSteps3d {
  public static void mainDraw(Graphics graphics) {
    int n = 6;
    int size = 8;
    graphics.setColor(new Color(177, 70, 244));
    Square(graphics, size, n);

  }

  private static void Square(Graphics graphics, int size, int n) {
    int x = 0;
    int y = 0;
    for (int i = 0; i < n; i++) {
      x += size;
      y += size;
      size *= 1.5;
      graphics.fillRect(x, y, size, size);
    }
  }


  //    Don't touch the code below
  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setSize(new Dimension(300, 300));
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
