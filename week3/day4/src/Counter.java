/**
 * Created by HP on 3/30/2017.
 */
public class Counter {
  public static void main(String[] args) {
    int n = 6;
    counter(n);
  }

  private static int counter(int n) {
    if (n == 0) {
      return 0;
    } else {
      System.out.println(n);
      return counter(--n);

    }
  }
}

