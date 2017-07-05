package farm.house;

import java.util.ArrayList;

import java.util.Collections;
import java.util.List;


public class Farm {
  List<Animal> animalList;
  int freeSlot = 3;


  public Farm() {
    animalList = new ArrayList<>();

  }

  public void farmInfo() {
    System.out.println("You have " + animalList.size() + " animal in farm.");
    System.out.println("Free available slot for breeding is : " + freeSlot);
    for (int i = 0; i < animalList.size(); i++) {
      System.out.println("Animal_" + i + " has " + animalList.get(i).hunger + " hunger");
    }
    System.out.println("====================================");
  }

  public void breed() throws Exception {
    if (freeSlot <= 0) throw new Exception("There is no free slot. You have to slut some animal.");
    if (freeSlot > 0) {
      animalList.add(new Animal());
      this.freeSlot -= 1;
      farmInfo();
    }
  }

  public void slaughter() {
    List<Integer> hungerList = new ArrayList<>();         //Making a list of hunger's value of animals
    for (int i = 0; i < animalList.size() - 1; i++) {
      hungerList.add(animalList.get(i).hunger);           //Adding of hunger of each animal to that list
    }
    Integer minHungerValue = Collections.min(hungerList); // Using min method of Collections Object to find the minimum value
    int indexOfLeastHunger = 0;
    for (int i = 0; i < animalList.size() - 1; i++) {
      if (animalList.get(i).hunger == minHungerValue) {
        indexOfLeastHunger = i;           // going through animal list to find out this minimum belongs to which index
      }
    }
    animalList.remove(indexOfLeastHunger);
    this.freeSlot += 1;
    System.out.println("Animal_" + indexOfLeastHunger + " was slaughtered");
    farmInfo();
  }

  public static void main(String[] args) throws Exception {
    Farm myFarm = new Farm();
    myFarm.farmInfo();

    myFarm.breed();
    myFarm.animalList.get(0).eat(10);
    myFarm.animalList.get(0).drink(20);
    myFarm.animalList.get(0).play(100);
    myFarm.farmInfo();
    myFarm.breed();
    myFarm.animalList.get(1).eat(20);
    myFarm.animalList.get(1).drink(30);
    myFarm.animalList.get(1).play(200);
    myFarm.farmInfo();
    myFarm.slaughter();
  }
}
