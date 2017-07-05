import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class SharpieTest {
  Sharpie mySharpie;

  @BeforeEach
  public void beforeEach() {
    mySharpie = new Sharpie("Red", 5);
  }

  @Test
  public void SharpieTestConstruction() {
    String color = "Green";
    float width = 4f;
    Sharpie mySharpie = new Sharpie(color, width);
    assertEquals(100f, mySharpie.inkAmount);
  }

  @Test
  public void SharpieTestUse() {
    float consumption = 13.4f;
    assertEquals(100 - consumption, mySharpie.use(consumption));
  }

  @Test
  public void isUsableTest() {
    mySharpie.inkAmount = 5;
    assertFalse(mySharpie.isUsable());
  }
}
