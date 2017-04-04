package garden;

/**
 * Created by HP on 4/4/2017.
 */
public class Tree extends Plant{


  public Tree(int waterAmount, String color) {
    super(waterAmount, color);
  }

  public Tree(int waterAmount) {
    super(waterAmount);
  }

public void getInfo(){
  if (waterAmount < 10) {
    System.out.println("The " + color + " tree needs water");
  }
}
}

