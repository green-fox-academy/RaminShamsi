
import java.util.Scanner;

/**
 * Created by HP on 3/22/2017.
 */
public class DrawPyramid {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Give a number:");
    int n = input.nextInt();
    int line = 1;
    while (line < n + 1) {
      for (int empty = 0; empty < (n - line); empty++) {
        System.out.print(" ");
      }
      for (int star = 0; star < (2 * line - 1); star++) {
        System.out.print("*");
      }
      line += 1;
      System.out.print("\n");
    }
  }
}

