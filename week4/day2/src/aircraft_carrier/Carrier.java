package aircraft_carrier;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by HP on 4/4/2017.
 */
public class Carrier {
  int healthLevel;
  int ammoNumber;
  int totalDamge;
  List<Aircraft> myCarrier;

  public Carrier() {
    this.healthLevel = 500;
    this.ammoNumber = 100;
    totalDamge = 0;
    myCarrier = new ArrayList<>();
    System.out.println("What type of Aircraft would you like to add to your Carrier, \"F16\" or \"F35\"?");
  }

  public void addAircrafts(String typeOfAircraft) {

    if (typeOfAircraft == "F16") {
      F16 newF16 = new F16();
      myCarrier.add(newF16);
    } else {
      F35 newF35 = new F35();
      myCarrier.add(newF35);
    }
  }

  public void getStatus() {
    System.out.println("Aircraft count: " + (F16.F16_counter + F35.F35_counter )+ ", ammo storage: " + ammoNumber
            + ", total damage: " + totalDamge);
    for (int i = 0; i < myCarrier.size(); i++) {
      myCarrier.get(i).getStatus();
    }
  }

  public void fight() {

  }
}
