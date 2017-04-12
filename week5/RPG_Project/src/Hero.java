/**
 * Created by HP on 4/12/2017.
 */
public class Hero extends PositionedImage {

  public Hero() {
    super("assets/hero-down.png", 0, 0);
  }

  public void moveDown() {
    posY += 72;
    setImage("assets/hero-down.png");
  }

  public void moveUp() {
    posY -= 72;
    setImage("assets/hero-up.png");
  }

  public void moveRight() {
    posX += 72;
    setImage("assets/hero-right.png");
  }

  public void moveLeft() {
    posX -= 72;
    setImage("assets/hero-left.png");
  }
}
