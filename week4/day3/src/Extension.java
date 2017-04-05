import java.util.Arrays;
import java.util.List;

/**
 * Created by aze on 2017.04.04..
 */
public class Extension {
  int add(int a, int b) {
    return a + b;
  }

  int maxOfThree(int a, int b, int c) {
    if (a >= b && a >= c)
      return a;
    else if (b >= a && b >= c) {
      return b;
    }
    return c;
  }

  int median(List<Integer> pool) {
    if (((Integer)(pool.size()) == null ) || (pool.size() == 0)) {
      return 0;
    } else
      return pool.get((pool.size() - 1) / 2);
  }

  boolean isVowel(char c) {
   String letter = Character.toString(c);
  char [] b = letter.toLowerCase().toCharArray();
    return Arrays.asList('a', 'u', 'o', 'e', 'i').contains(b[0]);
  }

  String translate(String hungarian) {
    String teve = hungarian;
    int length = teve.length();
    for (int i = 0; i < length; i++) {
      char c = teve.charAt(i);
      if (isVowel(c)) {
        teve = String.join(c + "v" + c, teve.split("" + c));
        i += 2;
        length += 2;
      }
    }
    return teve;
  }
}