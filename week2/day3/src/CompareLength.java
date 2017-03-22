import java.util.Arrays;

/**
 * Created by HP on 3/22/2017.
 */
public class CompareLength {
  public static void main(String[] args) {
    int[] p1 = {1, 2, 3};
    int[] p2 = {4, 5};
    System.out.println("p1 = " + Arrays.toString(p1) + " p2 = " + Arrays.toString(p2));
    int l1 = p1.length;
    int l2 = p2.length;
    if (l1 > l2){
      System.out.println("p1 is more element");
    } else {
      System.out.println("p2 is more element");
    }

  }
}
