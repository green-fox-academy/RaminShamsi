/**
 * Created by HP on 3/21/2017.
 */
import java.util.Scanner;
public class MileToKmConverter {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Distance(km)?");
    int dis = input.nextInt();
    System.out.println("Distance (mil) = " + dis*0.621371);
  }
}
