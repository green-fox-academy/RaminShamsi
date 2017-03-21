/**
 * Created by HP on 3/21/2017.
 */

import java.util.Scanner;
public class HelloUser {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("What is your name?");
    String name = input.nextLine();
    System.out.println("Hello, " + name);
  }
}
