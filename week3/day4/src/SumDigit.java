/**
 * Created by HP on 3/30/2017.
 */
public class SumDigit {
  public static void main(String[] args) {
    // Given a non-negative int n, return the sum of its digits recursively (no loops).
    // Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6), while
    // divide (/) by 10 removes the rightmost digit (126 / 10 is 12).
  int n = 1264;
  int R =sumDigit(n);
    System.out.println(R);

  }

  private static int sumDigit(int n) {
    int result, rightMostDigit, rest;
    if (n / 10 < 9) {                  //checking if just 2 digits left
      return n / 10 + n % 10;          //adding the last 2 MostLft remaining digits
    } else {
      rightMostDigit = n % 10;
      rest = n / 10;
      System.out.println("rest: " + rest + "  rightMostDigit: " + rightMostDigit);
      result = sumDigit(rest) + rightMostDigit;
      return result;
    }
  }
}
