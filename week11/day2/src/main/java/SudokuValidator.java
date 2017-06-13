/**
 * Created by HP on 6/13/2017.
 */
public class SudokuValidator {

  public static void main(String[] args) {
    int[][] input = new int[][]{
        {5, 3, 4, 6, 7, 8, 9, 1, 2},
        {6, 7, 2, 1, 9, 5, 3, 4, 8},
        {1, 9, 8, 3, 4, 2, 5, 6, 7},
        {8, 5, 9, 7, 6, 1, 4, 2, 3},
        {4, 2, 6, 8, 5, 3, 7, 9, 1},
        {7, 1, 3, 9, 2, 4, 8, 5, 6},
        {9, 6, 1, 5, 3, 7, 2, 8, 4},
        {2, 8, 7, 4, 1, 9, 6, 3, 5},
        {3, 4, 5, 2, 8, 6, 1, 7, 9}};

    System.out.println(isItValid(input));
  }

  public static boolean isItValid(int[][] input) {
    boolean valid = true;
    int numberToCheck;
    int numberToCheckAgainst;
    for (int i = 0; i < 9; i++) {
      for (int j = 0; j < 9; j++) {
        numberToCheck = input[i][j];
        for (int k = 0; k < 9; k++) {
          numberToCheckAgainst = input[i][k];
          if (j != k && numberToCheck == numberToCheckAgainst) {
            valid = false;
          }
          numberToCheckAgainst = input[k][j];
          if (i != k && numberToCheck == numberToCheckAgainst) {
            valid = false;
          }
        }
      }
    }
    return valid;
  }
}


