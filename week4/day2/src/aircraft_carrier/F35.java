package aircraft_carrier;

/**
 * Created by HP on 4/4/2017.
 */
public class F35 extends Aircraft {


  public F35() {
    ammoNumber = 12;
    baseDamage = 50;
  }

  public void getStatus(){
    System.out.println("Ammo: " + ammoNumber + " Base damage: " +baseDamage+ " Total damage: " + totalldamge);
  }
}
