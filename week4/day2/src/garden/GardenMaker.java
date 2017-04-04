package garden;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by HP on 4/4/2017.
 */
public class GardenMaker {
  String color;
  List<Plant> mygarden;

  public GardenMaker() {
    mygarden = new ArrayList<>();
  }

  public void fillGarden() {
    Plant flower1 = new Flower(0, "yellow");
    mygarden.add(flower1);
    Plant flower2 = new Flower(0, "blue");
    mygarden.add(flower2);
    Plant tree1 = new Tree(0, "purple");
    mygarden.add(tree1);
    Plant tree2 = new Tree(0, "orange");
    mygarden.add(tree2);
  }

  public void info(){
    for (int i = 0; i < mygarden.size(); i++) {
      mygarden.get(i).getInfo();
    }
  }

  public void wateringGarden(int givingWater) {

  }
}
