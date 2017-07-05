package aircraft_carrier;

import java.util.ArrayList;
import java.util.List;

public class Carrier {
  int healthLevel;
  int carrierAmmos;
  int totalDamge;
  List<Aircraft> aircraftList;

  public Carrier(int totalAmmo) {
    this.healthLevel = 500;
    this.carrierAmmos = totalAmmo;
    totalDamge = 0;
    aircraftList = new ArrayList<>();
    System.out.println("What type of Aircraft would you like to add to your Carrier, \"F16\" or \"F35\"?");
  }

  public void addAircrafts(String typeOfAircraft) {

    if (typeOfAircraft.equals("F16")) {
      F16 newF16 = new F16();
      aircraftList.add(newF16);
    } else if (typeOfAircraft.equals("F35")) {
      F35 newF35 = new F35();
      aircraftList.add(newF35);
    }
  }

  public void addAircraft(String typeOfAircraft) {
    switch (typeOfAircraft) {
      case "F16":
        aircraftList.add(new F16());
        break;
      case "F35":
        aircraftList.add(new F35());
        break;
      default:
        System.out.println("huh");
        break;
    }
  }

  public void getStatus() {
    System.out.println("Aircraft count: " + (aircraftList.size()) + ", ammo storage: " + carrierAmmos
            + ", total damage: " + totalDamge);
    System.out.println("Aircrafts:");
    for (int i = 0; i < aircraftList.size(); i++) {
      System.out.println(aircraftList.get(i).getStatus());
    }
    if (healthLevel <= 0) {
      System.out.println("It's dead Jim :(");
    }
    System.out.println("=========================================");
  }

  public void fight(Carrier enemy) {
    for (Aircraft aircraft : aircraftList) {
      enemy.healthLevel -= aircraft.fight();
    }
    enemy.carrierAmmos = 0;
    getStatus();
  }

  public void refill() throws Exception {
    if (carrierAmmos <= 0) throw new Exception("There is no enough amoo");
    int maxAmmoAmount = 0;
    for (Aircraft item : aircraftList) {
      maxAmmoAmount += item.maxAmmo;
    }
    if (carrierAmmos < maxAmmoAmount) {
      for (Aircraft item : aircraftList) {
        if (item instanceof F35) {
          item.refill(carrierAmmos);
        }
      }
    } else {
      for (Aircraft item : aircraftList) {
        item.refill(carrierAmmos);
      }
    }
    getStatus();
  }
}
