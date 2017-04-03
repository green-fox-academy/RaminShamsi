/**
 * Created by HP on 4/3/2017.
 */
public class Sharpie {
  String color;
  float width;
  float inkAmount;

  public Sharpie(String color, float width) {
    this.inkAmount = 100;
  }

  public void use(float cosumption) {
    this.inkAmount -= cosumption;
  }

  public static void main(String[] args) {
    Sharpie pen1 = new Sharpie("Red", 2);
    pen1.use(63);
    System.out.println(pen1.inkAmount);
  }
}