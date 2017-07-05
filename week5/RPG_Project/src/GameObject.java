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

  public void drawWallObject(Graphics graphics, int x, int y) {
    PositionedImage wall = new PositionedImage("assets/wall.png", x * (72 ), y * (72 ));
    wall.draw(graphics);
  }
}