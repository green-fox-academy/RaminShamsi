/**
 * Created by HP on 3/28/2017.
 */

import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Checkerboard {
  public static void mainDraw(Graphics graphics) {
    // fill the canvas with a checkerboard pattern.
    int x = 0;
    int y = 0;
    for (int i = 0; i < 8; i++) {
      for (int j = 0; j < 8; j++) {
        x = i * 2 * 20;
        y = j * 2 * 20;
        graphics.fillRect(x, y, 20, 20);
      }
    }
    for (int i = 0; i < 8; i++) {
      for (int j = 0; j < 8; j++) {
        x = (i * 2 * 20) + 20;
        y = (j * 2 * 20) + 20;
        graphics.fillRect(x, y, 20, 20);
      }
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
