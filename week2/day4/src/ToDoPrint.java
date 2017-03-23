/**
 * Created by HP on 3/23/2017.
 */
public class ToDoPrint {
  public static void main(String... args){
    String todoText = " - Buy milk\n";
    // Add "My todo:" to the beginning of the todoText
    // Add " - Download games" to the end of the todoText
    // Add " - Diablo" to the end of the todoText but with indention

    // Expected outpt:

    // My todo:
    //  - Buy milk
    //  - Download games
    //      - Diablo

    StringBuilder todoTextModified = new StringBuilder(todoText);
    todoTextModified.insert(0, "My todo:\n");
    todoTextModified.append(" - Download games\n");
    todoTextModified.append("\t - Diablo");
    System.out.println(todoTextModified);
  }
}
