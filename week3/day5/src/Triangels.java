import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Triangels {
  public static void mainDraw(Graphics graphics) {
    int[] xP = {300,450,150};
    int [] yP = {50,(int)(50+300*Math.sin(Math.toRadians(60))),(int)(50+300*Math.sin(Math.toRadians(60)))};
    int nP =3;
    graphics.drawPolygon(xP,yP,nP);

  }


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

