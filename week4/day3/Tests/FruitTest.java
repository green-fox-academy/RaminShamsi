import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by HP on 4/5/2017.
 */
class FruitTest {

  Fruit apple = new Fruit("Apple");

  @Test
  public void fruitTest() {
    assertEquals("Apple", apple.getApple());
  }
}