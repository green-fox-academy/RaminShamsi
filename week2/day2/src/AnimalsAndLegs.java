/**
 * Created by HP on 3/21/2017.
 */
import java.util.Scanner;
public class AnimalsAndLegs {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Number of chickens?");
    int chicken = input.nextInt();
    System.out.println("Number of pigs?");
    int pig = input.nextInt();
    System.out.println("How many legs \n farmer has = " + (chicken*2+pig*4));
  }
}

