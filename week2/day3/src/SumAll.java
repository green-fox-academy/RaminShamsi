import java.util.Arrays;

/**
 * Created by HP on 3/22/2017.
 */
public class SumAll {
  public static void main(String[] args) {
    int [] ai = {3, 4, 5, 6, 7};
    int sumAll = 0;
    for (int i = 0; i < ai.length; i++) {
      sumAll = sumAll+ ai[i];
    }
    System.out.println("sum up all elements are: " + sumAll);
  }
}
