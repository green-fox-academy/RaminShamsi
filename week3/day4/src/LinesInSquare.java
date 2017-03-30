import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinesInSquare {
  public static void mainDraw(Graphics graphics) {


    lines(graphics, 200);

  }

  public static int lines(Graphics graphics, int size) {


    if (size == 0) {
      graphics.drawRect(0, 0, 0, 0);
      return size;
    } else {
      graphics.drawRect(0, 0, size, size);
      return lines(graphics, size - 50);

    }
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
