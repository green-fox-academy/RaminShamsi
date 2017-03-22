import java.util.Scanner;

/**
 * Created by HP on 3/22/2017.
 */
public class Sum {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Give me a number:");
    int n = input.nextInt();
    sum(n);
  }

  public static void sum(int n) {
    int s = 0;
    for (int i = 1; i < n+1; i++){
      s  = s + i;
    }
    System.out.println("sum = " + s);
  }


}
