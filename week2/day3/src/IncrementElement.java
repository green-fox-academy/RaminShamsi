import java.util.Arrays;

/**
 * Created by HP on 3/22/2017.
 */
public class IncrementElement {
  public static void main(String[] args) {
    int[] t = {1, 2, 3, 4, 5};
    System.out.println("t = " + Arrays.toString(t));
    int i=0;
    int[] tIncremented = new int[t.length];
    while (i < t.length) {
      tIncremented[i] = t[i] + 1;
      i++;
    }
    System.out.println("Incremented version = " +  Arrays.toString(tIncremented));

  // Better solution to work on it
    for (int tIncremented2 : t) {
      tIncremented2++;
      System.out.println("Incremented version = " + tIncremented2);
    }
  }
}
