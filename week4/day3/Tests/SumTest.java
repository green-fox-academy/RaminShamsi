import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by HP on 4/5/2017.
 */
class SumTest {

  ArrayList<Integer> myList;
  Sum mySum;

  @BeforeEach
  public void beforeEach() {
    mySum = new Sum();
  }

  @Test

   public void sumTest1() {
    myList= new ArrayList<>(Arrays.asList(1, 2, 3));
    assertEquals(6, mySum.sumOfList(myList));
  }

  @Test

  public void sumTest2() {
    myList= new ArrayList<>(Arrays.asList(1, 2, 3,4));
    assertEquals(10, mySum.sumOfList(myList));
  }

  @Test
// empty ArrayList
  public void sumTestEmpty() {
    myList= new ArrayList<>();
    assertEquals(0, mySum.sumOfList(myList));
     }

  @Test
// No Object
  public void sumTestNull() {
    myList = null;
    assertEquals(0, mySum.sumOfList(myList));
  }
}