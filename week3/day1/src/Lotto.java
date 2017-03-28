import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.lang.*;

/**
 * Created by HP on 3/27/2017.
 */
public class Lotto {
  public static void main(String[] args) {
    Path fileAddress = Paths.get("assets/otos.txt");
    try {
      List<String> lines = Files.readAllLines(fileAddress);

      //  System.out.println(lineString);

      HashMap<Integer, Integer> frequeny = new HashMap<>();


      for (int i = 0; i < lines.size(); i++) {
        String lineString = lines.get(i);
        int lastFt = lineString.lastIndexOf("Ft");
        String lastPart = lineString.substring(lastFt + 3);
        String[] stringNums = lastPart.split(";");
        //   System.out.println(Arrays.toString(stringNums));
        // System.out.println(stringNums[0]);
        for (int j = 0; j < stringNums.length; j++) {
          Integer integerNums = Integer.parseInt(stringNums[j]);
          if (frequeny.containsKey(integerNums)) {
            frequeny.put(integerNums, frequeny.get(integerNums) + 1);
          } else {
            frequeny.put(integerNums, 1);
          }
        }
      }

//      List<Collection> dummy = new List<Collection>;
//      for (int i = 0; i < frequeny.size(); i++) {
//        dummy(i) = frequeny.values(i);
//      }
//      Collections.sort(dummy);
      System.out.println(frequeny.values());
      System.out.println(frequeny);
      System.out.println(frequeny.keySet());

    } catch (Exception e) {
    }
  }
}
