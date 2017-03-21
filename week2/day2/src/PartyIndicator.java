import java.util.Scanner;

/**
 * Created by HP on 3/21/2017.
 */
public class PartyIndicator {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Number of girls:");
    int g = input.nextInt();
    System.out.println("Number of boys:");
    int b = input.nextInt();
    System.out.println("The party is excellent with" + (g + b) + " people");
    if ((g == b) && (g + b > 20)) {
      System.out.println(" Quite cool party!");
    }
  }
}
