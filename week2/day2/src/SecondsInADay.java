/**
 * Created by HP on 3/21/2017.
 */
public class SecondsInADay {
  public static void main(String[] args) {
    int currentHours = 14;
    int currentMinutes = 34;
    int currentSeconds = 42;
    int sec;
    sec = 60 - currentSeconds;
    sec += (60 - currentMinutes) * 60;
    sec += (24 - (currentHours + 1)) * 60 * 60;
    System.out.println("Current time: 14:34:42, Remaining seconds till mid night is: " + sec + " sec");
  }
}
