/**
 * Created by HP on 3/23/2017.
 */

import java.util.*;

public class AppendLetter {
  public static void main(String... args) {
    ArrayList<String> far = new ArrayList<String>(Arrays.asList("kuty", "macsk", "kacs", "rók", "halacsk"));
    // Add "a" to every string in the far list.

    for (int i = 0; i < far.size(); i++) {
      String s = far.get(i);
      far.set(i, s + "a");
    }
    System.out.println(far);
  }
}