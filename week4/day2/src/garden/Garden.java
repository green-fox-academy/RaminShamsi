package garden;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by HP on 4/4/2017.
 */
public class Garden {

  List<Plant> mygarden;

  public Garden() {
    mygarden = new ArrayList<>();
  }

  public void fillGarden() {
    Flower flower1 = new Flower(0, "yellow");
    mygarden.add(flower1);
    Flower flower2 = new Flower(0, "blue");
    mygarden.add(flower2);
    Tree tree1 = new Tree(0, "purple");
    mygarden.add(tree1);
    Tree tree2 = new Tree(0, "orange");
    mygarden.add(tree2);
  }

  public void info() {
    for (int i = 0; i < mygarden.size(); i++) {
      mygarden.get(i).getInfo();
    }
  }

  public void wateringGarden(float givingWater) {
    float waterAmountForEach = givingWater / 4f;
    for (Plant p : mygarden) {
      p.giveWater(waterAmountForEach);
    }
  }

}
