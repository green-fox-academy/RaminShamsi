package garden;

/**
 * Created by HP on 4/4/2017.
 */
public class Flower extends Plant {
  String typeName = "flower";


  public Flower(int waterAmount, String color) {
    super(waterAmount, color);
  }

  public Flower(int waterAmount) {
    super(waterAmount);
  }

  public void getInfo() {
    if (waterAmount < 5) {
      System.out.println("The " + color + " " + typeName + " needs water");
    } else {
      System.out.println("The " + color + " " + typeName + " doesn't need water");
    }
  }

  public void giveWater(float givenWater) {
    waterAmount += 0.75 * givenWater;
  }

}
