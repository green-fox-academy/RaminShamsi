import java.awt.*;

/**
 * Created by HP on 4/12/2017.
 */
public class Floor extends PositionedImage {
  public Floor() {
    super("assets/floor.png", 0, 0);
  }

  public void drawFloor(Graphics graphics, int tileNumberX, int tileNumberY) {
    posX = tileNumberX;
    posY = tileNumberY;
    setImage("assets/floor.png");
    draw(graphics);
  }
}
