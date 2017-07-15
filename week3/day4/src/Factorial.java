import java.util.ArrayList;
import java.util.List;


public class Factorial {

  private static List<Integer> res = new ArrayList<>();

  public static void main(String[] args) {
    int n = 5;
    int result = factorial(n);
    System.out.println();
    for (int item : res) {
      System.out.println(item);
    }
  }

  private static int factorial(int n) {
    if (n == 0) {
      return 1;
    } else {
      int r = factorial(n - 1) * n;
      res.add(r);
      System.out.print(r + ", ");
      return r;
    }
  }
}
