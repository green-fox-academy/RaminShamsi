import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by HP on 4/5/2017.
 */
class AnagramTest {

  @Test
  public void isAnagramTest () {
    Anagram myStrings = new Anagram();
    String string1 = "asdfg";
    String string2 = "gsdfa";
    assertEquals(true, myStrings.isAnagram(string1,string2));
  }

}