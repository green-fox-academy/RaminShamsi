import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by HP on 5/11/2017.
 */

public class AnagramTest {

  @Test
  public void nullTest(){
    assertEquals(true, Anagram.isAnagram(null,null));
  }
  @Test
  public void caseSensitivity(){
    assertEquals(true, Anagram.isAnagram("Dog","dog"));
  }

}