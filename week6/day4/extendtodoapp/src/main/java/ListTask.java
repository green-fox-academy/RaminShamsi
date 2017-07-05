import com.opencsv.CSVReader;

import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by HP on 4/6/2017.
 */
public class ListTask {

  public List<String> readFile() {
       ArrayList<String> availableLines = new ArrayList<>();
   // String[] availableLines = new String[0];
    try {
      FileReader path = new FileReader("src/main/resources/ListTask.txt");
      CSVReader reader = new CSVReader(path, ' ');
      List<String[]> lines = reader.readAll();
      for (int i = 0; i < lines.size(); i++) {
        String toDo = "";
//        System.out.println(Arrays.toString(lines.get(i)));
        for(String item : lines.get(i)){
          toDo += item + " ";
        }
        availableLines.add(toDo);
   //     System.out.println(toDo);
      }
 //     System.out.println(availableLines.get(0));
      return availableLines;
    } catch (IOException e) {
      System.out.println("Uh-oh, could not read the file!");
    }
    return null;
  }

//  public void write(String string) {
//    List<String> content = new ArrayList();
//    content.add(string);
//    try { // Required by Files.write(filePath, content)
//      // Creates a new file if not exists and overwrites it's content
//      // The elements of the content lists will become the lines of the file
//      Path filePath = Paths.get("src/main/resources/modifiedListTask.txt");
//      Files.write(filePath, content);
//    } catch (Exception e) {
//      System.out.println("Uh-oh, could not write the file!");
//    }
//  }
}
