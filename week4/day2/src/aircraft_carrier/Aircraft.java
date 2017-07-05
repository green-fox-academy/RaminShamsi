package aircraft_carrier;


public class Aircraft {

  int ammoNumber;
  int baseDamage;
  int totalldamge;
  int maxAmmo;

  public int getTotalldamge() {
    return totalldamge;
  }

  public String getStatus() {
    return get_type() + " Ammo: " + ammoNumber + " Base damage: " + baseDamage + " Total damage: " + (ammoNumber
        * baseDamage);
  }

  public String get_type() {
    return "";
  }

  public int refill(int carrierAmmo) {
    if (carrierAmmo >= maxAmmo) {
      ammoNumber = maxAmmo;
    } else {
      System.out.println("Not enough Ammo");
    }
    return carrierAmmo - maxAmmo;
  }

  public int fight() {
    int damage = ammoNumber * baseDamage;
    ammoNumber = 0;
    return damage;
  }

}
