import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by HP on 3/23/2017.
 */

public class Anagram {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Write 2 words, I will tell you if it is Anagram or not: \n 1st Word:");
    String inPutWord1 = scanner.nextLine();
    System.out.println("2nd Word:");
    String inPutWord2 = scanner.nextLine();
    System.out.println(IsAnagram(inPutWord1,inPutWord2));

  }

  public static boolean IsAnagram (String s1, String s2){
    if (s1.length() != s2.length()) return false;
    char[] c1 = s1.toCharArray();
    char[] c2 = s2.toCharArray();
    Arrays.sort(c1);
    Arrays.sort(c2);
    for(int i = 0; i < c1.length; i++) {
      if(c1[i] != c2[i]) return false;
    }
    return true;
  }
}
