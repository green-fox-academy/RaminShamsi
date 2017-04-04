package aircraft_carrier;

/**
 * Created by HP on 4/4/2017.
 */
public class AircraftBattleApp {
  public static void main(String[] args) {
    Carrier myCarrier = new Carrier();
    myCarrier.addAircrafts("F16");
    myCarrier.getStatus();
  }
}
