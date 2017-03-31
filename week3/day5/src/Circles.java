import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Circles {
  public static void mainDraw(Graphics graphics) {

//    graphics.drawOval(100, 100, 500, 500);
   circle(graphics, 100, 100, 400);


  }

  public static void circle(Graphics graphics, int xCorner, int yCorner, int d) {


    if (d < 100) {
      graphics.drawOval(xCorner, yCorner, d, d);
      //    return r;
    } else {
      graphics.drawOval(xCorner, yCorner, d,d);
      circle(graphics, xCorner + d/4, yCorner , d / 2);
      circle(graphics, xCorner , yCorner+ d/4 , d / 2);
  //    circle(graphics, xCorner+d , yCorner+d , d / 2);
  //    circle(graphics, xCorner+ d/2 , yCorner+ d/2 , d / 2);
   //   circle(graphics, xCorner+ (d/2 -d/8*(int)Math.sqrt(2))-d/4 , yCorner+ (int)(d/2*(1.5)-d/8)-d/4 , d / 2);
    }
  }


  //    Don't touch the code below

  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setSize(new Dimension(700, 700));
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
