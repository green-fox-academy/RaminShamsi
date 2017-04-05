/**
 * Created by HP on 4/5/2017.
 */
public class Fibonacci {

  public int fibonacci(Integer n) {
    if (n == null) {
      return 0;
    } else if (n == 1) {
      return 1;
    } else if (n == 0) {
      return 0;
    } else
      return fibonacci(n - 1) + fibonacci(n - 2);
  }
}
