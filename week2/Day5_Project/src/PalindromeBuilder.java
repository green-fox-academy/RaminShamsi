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
    String sR = "";
    sR = Createpalindrome(inPutWord);
    System.out.println(sR);
  }

  public static String Createpalindrome(String s1) {

    ArrayList<Object> s11 = new ArrayList<>();
    char [] characters = s1.toCharArray();  //make array of each character
    for (int i = 0; i < s1.length(); i++) {
      s11.add(i, characters[i]);            //put that array inside s11 ArrayList
    }
    Collections.reverse(s11);               //Since that ArrayList is Object type, we can reverse it,
    for (int i = 0; i < s11.size(); i++) {    // which does inside ArrayList without any output(void)
      s1 += s11.get(i);                     //add each elements of ArrayList to original String
    }
    return s1;
  }
}
