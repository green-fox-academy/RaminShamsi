import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by HP on 5/11/2017.
 */
public class FizzBuzzTest {


  @Test
  public void NotSameSizeTest(){
    List<Object> testListExpected = new ArrayList<>(Arrays.asList(1,2,"Fizz",4,"Buzz"));
    List<Integer> testList = new ArrayList<>(Arrays.asList(1,2,3,4,5));
    assertArrayEquals(testListExpected.toArray(), FizzBuzz.FizzBuzzChecker(testList).toArray());

  }

  @Test
  public void test(){
    List<Object> testListExpected = new ArrayList<>(Arrays.asList(1,2,"Fizz",4,"Buzz"));
    List<Integer> testList = new ArrayList<>(Arrays.asList(1,2,3,4));
       assertArrayEquals(testListExpected.toArray(), FizzBuzz.FizzBuzzChecker(testList).toArray());

  }

}