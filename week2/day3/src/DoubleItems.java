import java.util.Arrays;

/**
 * Created by HP on 3/22/2017.
 */
public class DoubleItems {
  public static void main(String[] args) {
    int[] ag = {3, 4, 5, 6, 7};
    System.out.println("ag = " + Arrays.toString(ag));
    int i=0;
    int[] agDuobeled = new int[ag.length];
    while (i < ag.length) {
      agDuobeled[i] = 2 * ag[i];
      i++;
    }
    System.out.println("Doubeled ag: " + Arrays.toString(agDuobeled));
  }
}
