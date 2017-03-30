/**
 * Created by HP on 3/30/2017.
 */
public class String3 {
  public static void main(String[] args) {
    // Given a string, compute recursively a new string where all the
// adjacent chars are now separated by a "*".

    String text = "ghj sajkhc khshlk sknh";
    String result = starBetweenLetters(text);
    System.out.println(result);

  }

  private static String starBetweenLetters(String text) {
    if (text.length()==0) {
      return text;
    } else {
      return text.substring(0,1) + "*" + starBetweenLetters(text.substring(1));
    }
  }
}
