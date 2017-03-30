/**
 * Created by HP on 3/30/2017.
 */
public class String1 {
  public static void main(String[] args) {
    // Given a string, compute recursively (no loops) a new string where all the
    // lowercase 'x' chars have been changed to 'y' chars.
    String word = "RbRaxinpxnn";
    String result = xChangeToY(word);
    System.out.println(result);
  }

  private static String xChangeToY(String word) {
    String modified = "";
    int ind = word.indexOf("x");
    if (ind < 0) {
      return word;
    } else {
      System.out.println(ind);
      System.out.println(word);
      String firstCut = word.substring(0, ind);  //First cut from left side
      String rest = word.substring(ind + 1);      // the rest of string after cutting first part
      modified = firstCut + "y" + xChangeToY(rest);
      return modified;
    }
  }

}
