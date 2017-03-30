/**
 * Created by HP on 3/30/2017.
 */
public class power {
  public static void main(String[] args) {
    // Given base and n that are both 1 or more, compute recursively (no loops)
// the value of base to the n power, so powerN(3, 2) is 9 (3 squared).

    int base = 2;
    int power = 4;
    int result = powerN(base, power);
    System.out.println(result);

  }

  private static int powerN(int base, int power) {
    int result;
    if (power == 0) {
      return 1;
    } else {
      System.out.println("result = " + base + " power = " + power );
      result = powerN(base, power - 1) * base;
      return result;
    }
  }
}
