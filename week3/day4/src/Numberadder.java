/**
 * Created by HP on 3/30/2017.
 */
public class Numberadder {
  public static void main(String[] args) {
    int n = 6;
    int R = sum(n);
    System.out.println(R);
  }

  private static int sum(int n) {
    int result;
    if (n == 0) {
      return 0;
    } else {
     System.out.println(n);
     result = sum(--n) + n;
     return result;
    }
  }
}
