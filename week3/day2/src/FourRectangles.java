/**
 * Created by HP on 3/28/2017.
 */
import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FourRectangles {
  public static void mainDraw(Graphics graphics){
    // draw four different size and color rectangles.

    for (int i = 0; i < 5; i++) {
      Rectangle(graphics, 20 * i, 10 * i);
    }


  }

  public static void Rectangle (Graphics g, int s1, int s2) {
    int xStart = (int) (300 * Math.random());                  // Casting from "double" to "int"
    int yStart = (int) (300 * Math.random());
    int[] xP = {xStart - s1/2, xStart + s1/2, xStart + s1/2, xStart - s1/2};
    int[] yP = {yStart - s2/2, yStart - s2/2, yStart + s2/2, yStart + s2/2};
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
  static class ImagePanel extends JPanel{
    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      mainDraw(graphics);

    }
  }

}
