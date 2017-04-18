package character.sequence;

/**
 * Created by HP on 4/18/2017.
 */
public class CharOperations implements CharSequence {
  String myString;

  public CharOperations(String myString) {
    this.myString = myString;
  }

  @Override
  public int length() {
    return myString.length();
  }

  @Override
  public char charAt(int index) {

    return myString.charAt(index);
  }

  @Override
  public CharSequence subSequence(int start, int end) {
    String result = "";
    for (int i = end; i >= start; i--) {
      result += myString.charAt(i);
    }
    return result;
  }

  @Override
  public String toString() {
    String result = "";
    for (int i = myString.length() - 1; i >= 0; i--) {
      result += myString.charAt(i);
    }
    return result;
  }
}
