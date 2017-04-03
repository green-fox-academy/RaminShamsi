import java.util.ArrayList;
import java.util.List;

public class Dominoes {
  public static void main(String[] args) {
    List<Domino> dominoes = initializeDominoes();
    // You have the list of Dominoes
    // Order them into one snake where the adjacent dominoes have the same numbers on their adjacent sides
    // eg: [2, 4], [4, 3], [3, 5] ...
    List<Domino> modifiedVersion = new ArrayList<>();
    for (int j = 0; j < dominoes.size() - 1; j++) {
      for (int i = 0; i < dominoes.size() - 1; i++) {
        int[] part1 = dominoes.get(j).getValues();
        int[] part2 = dominoes.get(i + 1).getValues();
        if (part1[1] == part2[0]) {
          modifiedVersion.add(dominoes.get(j));
          modifiedVersion.add(dominoes.get(i + 1));
        }
      }
    }
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