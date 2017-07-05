package farm.house;

/**
 * Created by HP on 4/3/2017.
 */
public class Animal {
  int hunger;
  int thirst;

  public Animal() {
    this.hunger = 50;
    this.thirst = 50;
  }

  public void eat(int food) {
    this.hunger -= food;
  }

  public void drink(int liquid) {
    this.thirst -= liquid;
  }

  public void play(int game) {
    this.hunger += game;
    this.thirst += game;
  }
}
