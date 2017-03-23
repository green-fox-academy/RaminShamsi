/**
 * Created by HP on 3/23/2017.
 */

import java.lang.String;
public class Reverse {
  static String sR = "";
  static String reversed = "";
  public static void main(String... args) {
    reversed = ".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI";
    // Create a function that can reverse a String, which is passed as the parameter
    // Use it on this reversed string to check it!
    // Try to solve this using charAt() first, and optionally anything else after.
    //  reversed.charAt(10);
    sR = rev(reversed);
    System.out.println(sR);
  }
  public static String rev(String s) {
    for (int i = s.length() - 1; i >= 0; i--) {
      sR += s.charAt(i);
    }
    return sR;
  }
}
