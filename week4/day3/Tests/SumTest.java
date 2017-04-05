import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by HP on 4/5/2017.
 */
class SumTest {
  Sum myList = new Sum(1,2,3);

  @Test
  public void sumTest(){
    assertEquals(myList, myList.sumOfList());
  }
}