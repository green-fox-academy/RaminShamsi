/**
 * Created by HP on 4/20/2017.
 */
public class LotteryFilter {
  public static void main(String[] args) {

    if (args.length == 6 && args[0].equals("-y") && args[2].equals("-f") && args[4].equals("-o")) {
      String inputFileName = "otos.csv";
      DataHandler.filterByYear(args[1], inputFileName, args[5]);

    }else if (args.length == 4 && args[0].equals("-y") && args[2].equals("-o")) {
      String inputFileName = "otos.csv";
      DataHandler.filterByYear(args[1], inputFileName, args[3]);

    } else if (args.length == 4 && args[0].equals("-y") && args[2].equals("-f")) {
      String outputFileName = "output.csv";
      DataHandler.filterByYear(args[1], args[3], outputFileName);

    } else if (args.length == 2 && args[0].equals("-y")) {
      String inputFileName = "otos.csv";
      String outputFileName = "output.csv";
      DataHandler.filterByYear(args[1], inputFileName, outputFileName);

    } else if (args.length == 1 && args[0].equals("-y")) {
      System.out.println("Print the year after -y");

    } else if (args.length == 0) {
      DataHandler.printUsage();
    }
  }
}
