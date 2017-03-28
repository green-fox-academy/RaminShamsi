/**
 * Created by HP on 3/28/2017.
 */
import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class CenteredSquare {

    public static void mainDraw(Graphics graphics){
      // draw a green 10x10 square to the canvas' center.

      for (int i = 1; i < 10 ; i++) {
        Square(graphics,10 * i, 20 * i, 20 * i, 10 * i);
      }

    }
    public static void Square (Graphics gra, int length, int r, int g, int b){
      gra.setColor(new Color(r, g, b));
      int [] xPoints = {150 - length/2, 150 + length/2, 150 + length/2, 150 - length/2};
      int [] yPoints = {150 - length/2, 150 - length/2, 150 + length/2, 150 + length/2};
      int nPoints = 4;
      gra.drawPolygon(xPoints, yPoints, nPoints);
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