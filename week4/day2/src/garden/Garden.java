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
    info();
  }

  public void info() {
    for (int i = 0; i < mygarden.size(); i++) {
      mygarden.get(i).getInfo();                //calls "getInfo" method of Plant class for each member of arrayList,
    }                                       // but since there is subclass, it goes to that method in specific subclass
    System.out.println("-------------------");
  }

  public void wateringGarden(float givenWater) {
    float waterAmountForEach = givenWater / 4f;
    for (Plant p : mygarden) {    // the "p" can be tree or flower, when I apply the "giveWater" method to that, it works like "getInfo" described up.
      p.giveWater(waterAmountForEach);  //"waterAmountForEach" is same for each plant, BUT when gets specific it is better
    }                                   // to define in each class, which we did now inside each class
    info();
  }
}
