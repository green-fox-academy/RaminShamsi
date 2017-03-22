import java.util.Arrays;

/**
 * Created by HP on 3/22/2017.
 */
public class Colors {
  public static void main(String[] args) {
    String[][] colors = {
            {"lime", "forest green", "olive", "pale green", "spring green"},
            {"orange red", "red", "tomato"}, {"orchid", "violet", "pink", "hot pink"}};
    for (String[] printColors : colors)
      System.out.println(Arrays.toString(printColors));
  }
}
