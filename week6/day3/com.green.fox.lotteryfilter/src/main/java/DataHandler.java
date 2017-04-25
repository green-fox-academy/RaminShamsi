import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by HP on 4/20/2017.
 */
public class DataHandler {

  static void printUsage() {
    System.out.println("Input command has to be as following format:\n" +
            "-y <year> -f <input .csv file> -o <output .csv file>\n" +
            "e.g: -y 2000 -f otos.csv -o result.csv\n" +
            "This would read data of year 2000 from the otos.csv input file and write it to result.csv output file.");
  }

  static void filterByYear(String year, String inputFileName, String outputFileName) {
    List<String[]> result = new ArrayList<>();
    try {
      FileReader path = new FileReader("src/main/resources/" + inputFileName);
      CSVReader reader = new CSVReader(path, ';');
      List<String[]> lines = reader.readAll();
      for (String[] line : lines) {
        for (String yearAtStartingOfLine : line) {
          if (yearAtStartingOfLine.equals(year)) {
            System.out.println(Arrays.toString(line));
            result.add(line);
          }
        }
      }
      writeToFile(result, outputFileName);
    } catch (IOException e) {
      System.out.println("error in reading the input file.");
      e.printStackTrace();
    }
  }

  static void writeToFile(List<String[]> lines, String outputFileName) {
    try {
      CSVWriter writer = new CSVWriter(new FileWriter("src/main/resources/" + outputFileName),
              ';', CSVWriter.NO_QUOTE_CHARACTER);
      writer.writeAll(lines);
      writer.close();
    } catch (IOException e) {
      System.out.println("error in writing the output file.");
      e.printStackTrace();
    }
  }
}
