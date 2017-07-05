package character.sequence;

/**
 * Created by HP on 4/18/2017.
 */
public class MyMain {

  public static void main(String[] args) {
    CharSequence myString = new CharOperations("Ramin");
    String revers = "";
    for (int i = 1; i < myString.length(); i++) {
      revers += myString.charAt(myString.length() - i);
    }
    System.out.println(revers);
    System.out.println(myString.subSequence(0, 2));
    System.out.println(myString.toString());
  }
}
