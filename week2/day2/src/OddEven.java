/**
 * Created by HP on 3/21/2017.
 */
import java.util.Scanner;
public class OddEven {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Give me a number:");
    int n = input.nextInt();
    if ((n % 2) != 0){
      System.out.println("It is Odd!");
    } else
    {System.out.println("It is Even!");}
  }
}
