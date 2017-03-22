import java.util.Scanner;

/**
 * Created by HP on 3/22/2017.
 */
public class DrawDiamond {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Give a number:");
    int n = input.nextInt();

    int evenOdd = 0;
    if (n % 2 != 0) {
      evenOdd = n / 2 + 1;
    } else {
      evenOdd = n / 2;
    }
////// Upper Side
    int line = 1;
    while (line < evenOdd + 1) {
      for (int empty = 0; empty < (evenOdd - line); empty++) {
        System.out.print(" ");
      }
      for (int star = 0; star < (2 * line - 1); star++) {
        System.out.print("*");
      }
      line += 1;
      System.out.print("\n");
    }
////// Lower Side
    for (int line2 = n / 2; 0 < line2; line2 -= 1) {
      for (int empty = 0; empty < (evenOdd - line2); empty++) {
        System.out.print(" ");
      }
      for (int star = 0; star < (2 * line2 - 1); star++) {
        System.out.print("*");
      }
      System.out.print("\n");
    }
  }
}