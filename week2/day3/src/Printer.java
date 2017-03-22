import java.util.Scanner;

/**
 * Created by HP on 3/22/2017.
 */
public class Printer {
  public static void main(String[] args) {
    String a1 = "itt";
    String a2 = "van";
    String a3 = "a kutya!";

    printer(a1, a2, a3);
  }

  public static void printer(String... s1) {
    for (String i : s1)
    System.out.print(i + " ");
  }
}
