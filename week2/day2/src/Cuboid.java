/**
 * Created by HP on 3/21/2017.
 */

import java.util.Scanner;

public class Cuboid {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    double s1, s2, s3, v;
    System.out.println("Enter 3 edges of cuboid");
    System.out.println("Edge 1:");
    s1 = input.nextDouble();
    System.out.println("Edge 2:");
    s2 = input.nextDouble();
    System.out.println("Edge 3:");
    s3 = input.nextDouble();
    System.out.println("Surface Area: " + (s1*s2 + s2*s3 + s3*s1) * 2);
    v = s1*s2*s3;
    System.out.println("Volume: " + v);
  }
}
