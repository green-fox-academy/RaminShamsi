import javax.swing.*;
import java.awt.*;

/**
 * Created by HP on 4/10/2017.
 */
public class GameObject {
  int heroPosX;
  int heroPosY;
  Graphics graphics;

  public GameObject() {
    heroPosX = 0;
    heroPosY = 0;
  }

  public int getTestBoxX() {
    return heroPosX;
  }

  public int getHeroPosY() {
    return heroPosY;
  }

  public void setHeroPosX(int heroPosX) {
    this.heroPosX = heroPosX;
  }

  public void setHeroPosY(int heroPosY) {
    this.heroPosY = heroPosY;
  }


//  public void movingDown(Graphics graphics) {
//    PositionedImage heroDown = new PositionedImage("assets/hero-down.png", heroPosX, heroPosY);
//    heroDown.draw(graphics);
//  }
//
//  public void movingRight() {
//    PositionedImage heroRight = new PositionedImage("assets/hero-right.png", heroPosX, heroPosY);
//    heroRight.draw(graphics);
//  }
//
//  public void movingLeft(Graphics graphics) {
//    PositionedImage heroLeft = new PositionedImage("assets/hero-left.png", heroPosX, heroPosY);
//    heroLeft.draw(graphics);
//  }
//
//  public void movingUp(Graphics graphics) {
//    PositionedImage heroUp = new PositionedImage("assets/hero-up.png", heroPosX, heroPosY);
//    heroUp.draw(graphics);
//  }
//
//  public void drawFloorObject(Graphics graphics, int x, int y) {
//    PositionedImage floor = new PositionedImage("assets/floor.png", x * (72 ), y * (72 ));
//    floor.draw(graphics);
//  }
//+ heroPosX+ heroPosY
  public void drawWallObject(Graphics graphics, int x, int y) {
    PositionedImage wall = new PositionedImage("assets/wall.png", x * (72 ), y * (72 ));
    wall.draw(graphics);
  }
}