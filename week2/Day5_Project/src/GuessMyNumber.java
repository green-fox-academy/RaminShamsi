import java.util.Scanner;

/**
 * Created by HP on 3/24/2017.
 */
public class GuessMyNumber {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("I will pick a number and you guess it, it is fun, right?\n" + "Ok, I picked it.");
    //int inPut = scanner.nextInt();
    int myGuess = 5;
    boolean win = false;
    while (win != true) {
      System.out.println("What is your guess:");
      int inPut = scanner.nextInt();
      if (myGuess == inPut) {
        System.out.println("Congratulations. You won!");
        win = true;
      } else if (myGuess < inPut) {
        System.out.println("Too high. Guess lower");
      } else if (myGuess > inPut) {
        System.out.println("Too low. Guess higher");
      }
    }
  }
}
