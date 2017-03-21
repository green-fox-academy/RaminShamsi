/**
 * Created by HP on 3/21/2017.
 */
public class CodingHours {
  public static void main(String[] args) {

    int weeks = 17;
    int hrDay = 6;
    int hrSemester, c;
    hrSemester = weeks * 5 * 6;
    c = (hrSemester / weeks) * 100 / 52;

    System.out.println(hrSemester + " hours is spent with coding in a semester by an attendee");
    System.out.println(c + "% coding hours in the semester");


  }
}
