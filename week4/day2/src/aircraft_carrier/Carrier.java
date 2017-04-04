package aircraft_carrier;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by HP on 4/4/2017.
 */
public class Carrier {
  int healthLevel;
  int ammoNumber;
  List<Aircraft> myCarrier;

  public Carrier() {
    this.healthLevel = 500;
    this.ammoNumber = 100;
    myCarrier = new ArrayList<>();
  }

}
