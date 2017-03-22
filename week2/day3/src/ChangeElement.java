import java.util.Arrays;

/**
 * Created by HP on 3/22/2017.
 */
public class ChangeElement {
  public static void main(String[] args) {
    int[] s = {1, 2, 3, 8, 5, 6};
    System.out.println("s = " + Arrays.toString(s));
    s[3] = 4;
    System.out.println("4th element changed: " + Arrays.toString(s));
    System.out.println("4th element: " + s[3]);
  }
}
