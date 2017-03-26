import java.lang.reflect.Array;
import java.util.*;

/**
 * Created by HP on 3/24/2017.
 */
public class PalindromeBuilder {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Write a word, I will create palindrome:\nYour Word:");
    String inPutWord = scanner.nextLine();
    String palindrome = "";
    palindrome = CreatePalindrome(inPutWord);
    System.out.println(palindrome);
  }

  public static String CreatePalindrome(String originalS) {

    ArrayList<Object> dummyS = new ArrayList<>();
    char[] characters = originalS.toCharArray();       //make array of each character
    for (int i = 0; i < originalS.length(); i++) {
      dummyS.add(i, characters[i]);                    //put that array inside dummyS ArrayList
    }
    Collections.reverse(dummyS);                        //Since that ArrayList is Object type, we can reverse it,
    for (int i = 0; i < dummyS.size(); i++) {           // which does inside ArrayList without any output(void)
      originalS += dummyS.get(i);                        //add each elements of ArrayList to original String
    }
    return originalS;
  }
}
