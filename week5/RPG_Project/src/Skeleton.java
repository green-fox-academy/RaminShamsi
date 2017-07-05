/**
 * Created by HP on 4/12/2017.
 */
public class Skeleton extends PositionedImage {
  public Skeleton(int posX, int posY) {
    super("assets/skeleton.png", posX, posY);
  }

  WallArea area = new WallArea();

  public void move() {
    if ((int) (Math.random() * 2 % 2) == 1) {
      if (posX - 72 > 0 && !area.isWall(posX - 72, posY)) {
        posX -= 72;
      }
      if (posY - 72 > 0 && !area.isWall(posX, posY - 72)) {
        posY -= 72;
      }
    } else {
      if (posX < 720 - 72 && !area.isWall(posX + 72, posY)) {
        posX += 72;
      }
      if (posY < 720 - 72 && !area.isWall(posX, posY + 72)) {
        posY += 72;
      }
    }
  }
}
