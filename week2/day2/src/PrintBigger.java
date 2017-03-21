import java.util.Scanner;

/**
 * Created by HP on 3/21/2017.
 */
public class PrintBigger {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Give me a number (n1):");
    int n1 = input.nextInt();
    System.out.println("Give me another number (n2):");
    int n2 = input.nextInt();
    if (n1 > n2){
      System.out.println(n1 + " is bigger");
    } else
    {System.out.println(n2 + " is bigger");
    }
  }
}
