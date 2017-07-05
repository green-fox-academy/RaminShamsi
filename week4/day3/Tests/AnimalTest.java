import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by HP on 4/17/2017.
 */
class AnimalTest {
  Animal myAnimal;

  @BeforeEach
  void beforeEach() {
    myAnimal = new Animal();
    this.myAnimal.hunger = 60f;
    this.myAnimal.thirst = 50f;
  }

  @Test
  void eat() {
    float food = 10.5f;
    assertEquals(myAnimal.hunger - food, myAnimal.eat(food));
  }

  @Test
  void drink() {
    float liquid = 10.5f;
    assertEquals(myAnimal.thirst - liquid, myAnimal.drink(liquid));
  }

  @Test
  void play() {
    float game = 10.5f;
    List<Float> testResult = new ArrayList<>();
    testResult.add(60f + 10.5f);
    testResult.add(myAnimal.thirst + game);
    assertEquals(testResult, myAnimal.play(game));
  }

}