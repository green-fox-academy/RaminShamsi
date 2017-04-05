import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by HP on 4/5/2017.
 */
class CountLettersTest {
  @Test
  public void dictionaryTest() {
  CountLetters myObject = new CountLetters();
  String test = "ababbaa";
    HashMap<Character, Integer> testHasMap = new HashMap<>();
    testHasMap.put('a',4);
    testHasMap.put('b',3);

  assertEquals(testHasMap, myObject.myDictionary(test));
  }
}