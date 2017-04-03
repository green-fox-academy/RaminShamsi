/**
 * Created by HP on 4/3/2017.
 */
public class Car {
  int gasAmount;
  int capcity;

  public Car() {
    this.gasAmount = 0;
    this.capcity = 100;
  }

  public static void main(String[] args) {
    Car bmw = new Car();
    Station mole = new Station(1000);
    int[] gasAmountInCarAndStation = mole.refill(bmw);
    System.out.println("Gas remains in Mole station = " + gasAmountInCarAndStation[0]);
    System.out.println("Gas remains in bmw = " + gasAmountInCarAndStation[1]);
  }
}
