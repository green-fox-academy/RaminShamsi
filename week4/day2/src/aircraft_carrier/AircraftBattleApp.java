package aircraft_carrier;


public class AircraftBattleApp {
  public static void main(String[] args) throws Exception {
    Carrier myCarrier = new Carrier(13);
    myCarrier.addAircrafts("F16");
    myCarrier.addAircrafts("F35");
    myCarrier.addAircrafts("F35");
    myCarrier.getStatus();

    System.out.println(myCarrier.aircraftList.get(0).refill(100));
    System.out.println(myCarrier.aircraftList.get(0).ammoNumber);
    System.out.println(myCarrier.aircraftList.get(1).refill(100));
    System.out.println(myCarrier.aircraftList.get(1).ammoNumber);
    myCarrier.getStatus();

    Carrier enemy = new Carrier(50);
    enemy.addAircrafts("F16");
    enemy.aircraftList.get(0).refill(100);
    enemy.getStatus();

    myCarrier.fight(enemy);
    System.out.println( myCarrier.healthLevel);
    System.out.println(enemy.healthLevel);

    myCarrier.refill();
  }
}
