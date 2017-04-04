package aircraft_carrier;

/**
 * Created by HP on 4/4/2017.
 */
public class F35 extends Aircraft {
  //int F35_id = 1;
  static int F35_counter = 0;

  public F35() {
    F35_counter++;
    ammoNumber = 12;
    baseDamage = 50;
  }

  public void getStatus() {
    System.out.println("Ammo: " + ammoNumber + " Base damage: " + baseDamage + " Total damage: " + totalldamge);
  }
}
