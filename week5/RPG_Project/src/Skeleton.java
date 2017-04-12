/**
 * Created by HP on 4/12/2017.
 */
public class Skeleton extends PositionedImage {
  public Skeleton(int posX, int posY) {
    super("assets/skeleton.png", posX, posY);
  }

  WallArea wall = new WallArea();

  public void move() {
    if ((int) (Math.random() * 2 % 2) == 1) {
      if (posX - 72 > 0 && !wall.isWall(posX - 72, posY)) {
        posX -= 72;
        setImage("assets/skeleton.png");
      }
      if (posY - 72 > 0 && !wall.isWall(posX, posY - 72)) {
        posY -= 72;
        setImage("assets/skeleton.png");
      }
    } else {
      if (posX < 720 - 72 && !wall.isWall(posX + 72, posY)) {
        posX += 72;
        setImage("assets/skeleton.png");
      }
      if (posY < 720 - 72 && !wall.isWall(posX, posY + 72)) {
        posY += 72;
        setImage("assets/skeleton.png");
      }
    }
  }
}