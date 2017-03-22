
/**
 * Created by HP on 3/22/2017.
 */
import java.util.Arrays;
public class DiagonalMatrix {
  public static void main(String[] args) {

    int [][] test = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
  for (int [] L : test)
    System.out.println(Arrays.toString(L));

    int [][] matrix = new int[4][4];
      for (int i=0; i < 4; i++ ){
      for(int j=0; j < 4; j++) {
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
    for (int [] L : matrix)
      System.out.println(Arrays.toString(L));
  }
}
