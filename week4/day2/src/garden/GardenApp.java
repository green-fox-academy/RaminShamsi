package garden;

/**
 * Created by HP on 4/4/2017.
 */
public class GardenApp {
  public static void main(String[] args) {
    Garden myGarden = new Garden();
    myGarden.fillGarden();
    myGarden.wateringGarden(40);
    myGarden.wateringGarden(70);
  }
}
