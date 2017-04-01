import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Triangels {
  public static void mainDraw(Graphics graphics) {


    int[] xP = {300,450,150};
    int [] yP = {50,(int)(50+300*Math.sin(Math.toRadians(60))),(int)(50+300*Math.sin(Math.toRadians(60)))};
   // int n =2;


    tRecursion(graphics, 2);

  }
  private static void tRecursion(Graphics graphics, int n) {
      if(n<1){

      } else {

        int[] xP = {300* (int) (1 + 1 / n), 300 , 150 * (int) (1 - 1 / n)};
        int[] yP = {50, (int) (50 + 300 * Math.sin(Math.toRadians(60))) * (int) (1 + 1 / n), (int) (50 + 300 * Math.sin(Math.toRadians(60))) * (int) (1 + 1 / n)};
        int nP = 3;
        graphics.drawPolygon(xP, yP, nP);
        tRecursion(graphics, n - 1);
      }
  }


  private static void triangle(int[] xP, int[] yP) {

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

