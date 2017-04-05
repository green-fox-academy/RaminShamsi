import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by HP on 4/5/2017.
 */
class FibonacciTest {

  @Test
  public void fiboTest() {
    Fibonacci myFibo = new Fibonacci();

    assertEquals(0, myFibo.fibonacci(null));
  }
}