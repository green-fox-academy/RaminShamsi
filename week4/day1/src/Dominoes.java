import java.util.ArrayList;
import java.util.List;

public class Dominoes {
  public static void main(String[] args) {
    List<Domino> dominoes = initializeDominoes();
    // You have the list of Dominoes
    // Order them into one snake where the adjacent dominoes have the same numbers on their adjacent sides
    // eg: [2, 4], [4, 3], [3, 5] ...
    List<Domino> modifiedVersion = new ArrayList<>();
    modifiedVersion.add(dominoes.get(0));             //put the 1st domino inside modified version
    for (int j = 0; j < dominoes.size(); j++) {
      int[] part1 = modifiedVersion.get(j).getValues(); //pick up the each element from modified version to compare
      for (int i = 0; i < dominoes.size(); i++) {     //comparing each element of modified version with original one
        int[] part2 = dominoes.get(i).getValues();
        if (part1[1] == part2[0]) {
          modifiedVersion.add(dominoes.get(i));
        }
      }
    }
    System.out.println(dominoes);
    System.out.println(modifiedVersion);
  }

  static List<Domino> initializeDominoes() {
    List<Domino> dominoes = new ArrayList<>();
    dominoes.add(new Domino(5, 2));
    dominoes.add(new Domino(4, 6));
    dominoes.add(new Domino(1, 5));
    dominoes.add(new Domino(6, 7));
    dominoes.add(new Domino(2, 4));
    dominoes.add(new Domino(7, 1));
    return dominoes;
  }
}