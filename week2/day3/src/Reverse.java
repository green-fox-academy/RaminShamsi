import java.util.Arrays;

/**
 * Created by HP on 3/22/2017.
 */
public class Reverse {
  public static void main(String[] args) {
  int [] aj = {3, 4, 5, 6, 7};
    System.out.println("Original Array: " + Arrays.toString(aj));
    int [] reversed = new int[aj.length];
    for (int i = 0; i < aj.length; i++ ) {
      reversed[i] = aj[aj.length - 1 - i];
    }
    System.out.println("Reversed Array: " + Arrays.toString(reversed));
  }
}
