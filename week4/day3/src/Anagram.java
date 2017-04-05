import java.util.Arrays;

/**
 * Created by HP on 4/5/2017.
 */
public class Anagram {

  public Boolean isAnagram(String string1, String string2) {
    if (string1.length() == string2.length()) {
      char[] c1 = string1.toCharArray();
      char[] c2 = string2.toCharArray();
      Arrays.sort(c1);
      Arrays.sort(c2);
      for (int i = 0; i < c1.length; i++) {
        if (c1[i] == c2[i]) {
          return true;
        }
      }
    }
    return false;
  }
}
