import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by HP on 3/26/2017.
 */
public class StudentCounter {
  public static void main(String... args) {
    ArrayList<Map<String, Object>> map = new ArrayList<Map<String, Object>>();

    Map<String, Object> row0 = new HashMap<String, Object>();
    row0.put("name", "Rezso");
    row0.put("age", 9.5);
    row0.put("candies", 2);
    map.add(row0);

    Map<String, Object> row1 = new HashMap<String, Object>();
    row1.put("name", "Gerzson");
    row1.put("age", 10);
    row1.put("candies", 1);
    map.add(row1);

    Map<String, Object> row2 = new HashMap<String, Object>();
    row2.put("name", "Aurel");
    row2.put("age", 7);
    row2.put("candies", 3);
    map.add(row2);


    Map<String, Object> row3 = new HashMap<String, Object>();
    row3.put("name", "Zsombor");
    row3.put("age", 12);
    row3.put("candies", 5);
    map.add(row3);


    Map<String, Object> row4 = new HashMap<String, Object>();
    row4.put("name", "Olaf");
    row4.put("age", 12);
    row4.put("candies", 7);
    map.add(row4);


    Map<String, Object> row5 = new HashMap<String, Object>();
    row5.put("name", "Teodor");
    row5.put("age", 3);
    row5.put("candies", 2);
    map.add(row5);

    Double sum = 0.0D;
    for (Map<String, Object> row_n : map) {  //By Enhanced Loop getting each element of ArrayList called "map" which are
                                             // Map type and putting them in row_n which is also Map type
      int candyNumber = (int) row_n.get("candies"); //candies numbers are treating as an Object and have to be Casted
      if (candyNumber > 4) {                              // back to integer numbers.
        System.out.println("\"" + row_n.get("name") + "\"" + " ");
      } else if (candyNumber < 5){
        Double ages =  Double.parseDouble(row_n.get("age").toString()); //From inside: get the value of the key called
        sum += ages;                                               // "age", transfer to string then "parse rule" search
      }                                                            // into it to make the numbers Double.
    }
    System.out.print("Sum of the ages of people who have less than 5 candies: " + sum);
  }
}
