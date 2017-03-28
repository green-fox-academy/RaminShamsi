/**
 * Created by HP on 3/28/2017.
 */
import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class PositionSquare {
  public static void mainDraw(Graphics graphics){
    // create a square drawing function that takes 2 parameters:
    // the x and y coordinates of the square's top left corner
    // and draws a 50x50 square from that point.
    // draw 3 squares with that function.

    for (int i = 1; i < 4; i++) {
      int xS = (int)(255 * Math.random());
      int yS = (int)(255 * Math.random());
      int b = (int)(255 * Math.random());
      graphics.setColor(new Color(xS, yS, b));
      Square(graphics, xS, yS,  50);
    }


  }

  public static void Square(Graphics g, int x, int y, int length) {
    int[] xP = {x, x + length, x + length, x};
    int[] yP = {y, y, y + length, y + length};
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
