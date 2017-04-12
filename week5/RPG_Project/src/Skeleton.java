/**
 * Created by HP on 4/12/2017.
 */
public class Skeleton extends PositionedImage {
  public Skeleton(int posX, int posY) {
    super("assets/skeleton.png", posX, posY);
  }

  public void move() {
    if (posX > 0 && posY > 0 && posX <= 720 - 72 && posY <= 720 - 72) {

        posX -= (int) (Math.random() * 2 % 2) * 72;
        posY -= (int) (Math.random() * 2 % 2) * 72;
        setImage("assets/skeleton.png");
      } else if ((int) (Math.random() * 2 % 2) == 0){
        posX += (int) (Math.random() * 2 % 2) * 72;
        posY += (int) (Math.random() * 2 % 2) * 72;
        setImage("assets/skeleton.png");
      }
    }
  }
