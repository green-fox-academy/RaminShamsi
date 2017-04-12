/**
 * Created by HP on 4/12/2017.
 */
public class Hero extends PositionedImage {

  public Hero() {
   super("assets/hero-down.png",0, 0);

  }

  public void moveRight(){
   posX += 72;
   setImage("assets/hero-right.png");
  }
}
