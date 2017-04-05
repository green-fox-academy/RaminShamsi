import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by aze on 2017.04.04..
 */
class ExtensionTest {

  Extension extension = new Extension();

  @Test
  void testAdd_2and3is5() {
    assertEquals(5, extension.add(2, 3));
    assertEquals(2, extension.add(1, 1));
  }

  @Test
  void testAdd_1and4is5() {
    assertEquals(5, extension.add(1, 4));
    assertEquals(2, extension.add(1, 1));
  }

  @Test
  void testMaxOfThree_first() {
    assertEquals(5, extension.maxOfThree(5, 4, 3));
    assertEquals(4, extension.maxOfThree(1, 4, 3));
  }

  @Test
  void testMaxOfThree_third() {
    assertEquals(5, extension.maxOfThree(3, 4, 5));
    assertEquals(5, extension.maxOfThree(5, 4, 5));
  }

  @Test
  void testMedian_four() {
    assertEquals(3, extension.median(Arrays.asList(2,3,4,5)));
  }
  @Test
  void testMedian_null_0() {
    assertEquals(0, extension.median(Arrays.asList(0)));
  }

  @Test
  void testMedian_five() {
    assertEquals(3, extension.median(Arrays.asList(1,2,3,4,5)));
  }

  @Test
  void testIsVowel_a() {
    assertTrue(extension.isVowel('a'));
  }

  @Test
  void testIsVowel_CapitalVowels() {
    assertTrue(extension.isVowel('A'));
  }

  @Test
  void testIsVowel_u() {
    assertTrue(extension.isVowel('u'));
  }

  @Test
  void testTranslate_bemutatkozik() {
    assertEquals("bevemuvutavatkovozivik", extension.translate("bemutatkozik"));
  }

  @Test
  void testTranslate_kolbice() {
    assertEquals("lavagovopuvus", extension.translate("lagopus"));
  }

  @Test
  void testTranslate_fail() {
    assertEquals("marad", extension.translate("map"));
  }
}
