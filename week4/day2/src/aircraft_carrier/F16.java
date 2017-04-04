package aircraft_carrier;

/**
 * Created by HP on 4/4/2017.
 */
public class F16 extends Aircraft {
  //  int F16_Id = 1;
  static int F16_counter = 0;


  public F16() {
    F16_counter++;
    ammoNumber = 8;
    baseDamage = 30;
  }

  public int getF16_counter() {
    return F16_counter;
  }


  public void getStatus() {
    System.out.println("Ammo: " + ammoNumber + " Base damage: " + baseDamage + " Total damage: " + totalldamge);
  }
}
