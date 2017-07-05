package aircraft_carrier;


public class F35 extends Aircraft {

  static int F35_counter = 0;


  public F35() {
    F35_counter++;
    maxAmmo = 12;
    ammoNumber = 0;
    baseDamage = 50;
  }

  public String get_type() {
    return "Type F35";
  }
}

