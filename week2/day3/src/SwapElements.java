import java.util.Arrays;

/**
 * Created by HP on 3/22/2017.
 */
public class SwapElements {
  public static void main(String[] args) {
    String[] abc = {"first", "second", "third"};
    String dummy = abc [2];
    abc [2] = abc [0];
    abc [0] = dummy;
    System.out.println(Arrays.toString(abc));
  }
}
