package garden;

/**
 * Created by HP on 4/4/2017.
 */
public class Flower extends Plant{


  public Flower(int waterAmount, String color) {
    super(waterAmount, color);
    this.type = "flower";
  }

  public Flower(int waterAmount) {
    super(waterAmount);
  }

  public void getInfo() {
    if (waterAmount < 5) {
      System.out.println("The " + color + " flower needs water");
    }
  }
}
