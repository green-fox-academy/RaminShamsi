
/**
 * Created by HP on 3/22/2017.
 */

import java.util.Arrays;

public class DiagonalMatrix {
  public static void main(String[] args) {

    int[][] matrix = new int[4][4];
    for (int i = 0; i < 4; i++) {
      for (int j = 0; j < 4; j++) {
        if (i == j) {
          System.out.print("1");
          matrix[i][j] = 1;
        } else {
          System.out.print("0");
          matrix[i][j] = 0;
        }
      }
      System.out.print("\n");
    }
    for (int[] L : matrix)
      System.out.println(Arrays.toString(L));
  }
}
