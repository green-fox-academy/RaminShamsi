package aircraft_carrier;


public class F16 extends Aircraft {

  static int F16_counter = 0;


  public F16() {
    F16_counter++;
    baseDamage = 30;
    ammoNumber = 0;
    maxAmmo = 8;
  }

  public int getF16_counter() {
    return F16_counter;
  }

  public String get_type() {
    return "Type F16";
  }

}
