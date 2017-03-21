/**
 * Created by HP on 3/21/2017.
 */
import java.util.Scanner;
public class AverageOfInput {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int n1 = input.nextInt();
    Scanner input2 = new Scanner(System.in);
    int n2 = input2.nextInt();
    Scanner input3 = new Scanner(System.in);
    int n3 = input3.nextInt();
    Scanner input4 = new Scanner(System.in);
    int n4 = input4.nextInt();
    Scanner input5 = new Scanner(System.in);
    int n5 = input5.nextInt();
    int sum = n1 + n2 + n3 + n4 + n5;
    int ave = sum / 5;
    System.out.println("Sum: " + sum + "\nAverage: " + ave);
  }
}
