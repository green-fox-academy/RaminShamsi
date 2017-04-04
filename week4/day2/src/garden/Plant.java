package garden;

/**
 * Created by HP on 4/4/2017.
 */
public class Plant {
  int waterAmount;
  String color;
  String type;

  public Plant(int waterAmount, String type, String color) {
    this.waterAmount = waterAmount;
    this.color = color;

  }

  public Plant(int waterAmount) {
    this.waterAmount = 0;
  }

  public void getInfo() {

    }

  public void giveWater() {

  }
}

