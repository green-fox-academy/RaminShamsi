/**
 * Created by HP on 4/3/2017.
 */
public class Station {
  int gasAmount;

  public Station(int gasAmount) {
    this.gasAmount = gasAmount;
  }

  public int [] refill (Car typicalCar){
    int[] gasAmountInCarAndStation = new int[2];
    gasAmountInCarAndStation[0]= gasAmount-typicalCar.capcity;
    gasAmountInCarAndStation[1]=typicalCar.gasAmount += 100;
    return gasAmountInCarAndStation;
  }
}
