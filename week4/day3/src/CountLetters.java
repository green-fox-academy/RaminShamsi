
import java.util.HashMap;

/**
 * Created by HP on 4/5/2017.
 */
public class CountLetters {

  public HashMap myDictionary(String myString) {
    HashMap<Character, Integer> myHasmap = new HashMap<>();
    for (int i = 0; i < myString.length(); i++) {
      if (myHasmap.containsKey(myString.charAt(i))) {
        myHasmap.put(myString.charAt(i), myHasmap.get(myString.charAt(i)) + 1);
        } else {
        myHasmap.put(myString.charAt(i), 1);
      }
    }
    return myHasmap;
  }
}
