import java.util.ArrayList;
import java.util.List;

public class Animal {
  float hunger;
  float thirst;

  public Animal() {
    this.hunger = 50f;
    this.thirst = 50f;
  }

  public float eat(float food) {
    return this.hunger -= food;
  }

  public float drink(float liquid) {
    return this.thirst -= liquid;
  }

  public List<Float> play(float game) {
    List<Float> result = new ArrayList<>();
    this.hunger = this.hunger + game;
    result.add(this.hunger);
    this.thirst = this.thirst + game;
    result.add(this.thirst);
    return result;
  }
}
