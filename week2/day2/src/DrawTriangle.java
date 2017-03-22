import java.util.Scanner;

/**
 * Created by HP on 3/22/2017.
 */
public class DrawTriangle {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Give a number:");
    int n = input.nextInt();
    int line = 1;
    while (line < n + 1) {
      for (int star = 0; star < line; star++) {
        System.out.print("*");
      }
      line += 1;
      System.out.print("\n");
    }
  }
}

