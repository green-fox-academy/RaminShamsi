/**
 * Created by HP on 3/30/2017.
 */
public class String2 {
  public static void main(String[] args) {
    // Given a string, compute recursively a new string where all the 'x' chars have been removed.

    String word = "dcohbxllnlxjkbxxxgkkbs";
    String result = removeX(word);
    System.out.println(result);
  }
  private static String removeX(String word) {
    if (!word.contains("x")) {
      return word;
    } else {
      String leftSide = word.substring(0, word.indexOf("x"));
      String rightSide = word.substring(word.indexOf("x") + 1);
      word = leftSide + " " + rightSide;
      return removeX(word);
    }
  }
}
