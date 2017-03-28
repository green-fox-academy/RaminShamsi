/**
 * Created by HP on 3/28/2017.
 */
import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class RainbowBoxFunction {
  public static void mainDraw(Graphics graphics){
    // create a square drawing function that takes 2 parameters:
    // the square size, and the fill color,
    // and draws a square of that size and color to the center of the canvas.
    // create a loop that fills the canvas with rainbow colored squares.
    for (int i = 1; i < 40; i++) {
      int size = (int) (255 * Math.random());
      int g = (int) (255 * Math.random());
      int b = (int) (255 * Math.random());
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
  static class ImagePanel extends JPanel{
    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      mainDraw(graphics);

    }
  }

}
