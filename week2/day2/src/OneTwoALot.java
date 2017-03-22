import java.util.Scanner;

/**
 * Created by HP on 3/21/2017.
 */
public class OneTwoALot {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Give me a number:");
    int n = input.nextInt();
    if (n <= 0) {
      System.out.println("Not enough");
    } else if (n == 1) {
      System.out.println("One");
    } else if (n == 2) {
      System.out.println("Two");
    }else if (n > 2) {
      System.out.println("A Lot");
    }

  }
}
