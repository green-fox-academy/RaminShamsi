/**
 * Created by HP on 3/21/2017.
 */
public class ConditionalVariableMutation {
  public static void main(String[] args) {
    double a = 24;
    int out = 0;
    // if w is even increment out by one

    System.out.println(out);
    String out2 = "";
    int b = 13;
    if (b > 10 && b < 20){
      out2 = "Sweet!";
    } else if (b < 10){
        out2 = "More!";
    } else if (b > 20){
        out2 = "Less!";
    }
    System.out.println(out2);



    int c = 123;
    int credits = 100;
    boolean isBonus = false;
    // if credits are at least 50,
    // and isBonus is false decrement c by 2
    // if credits are smaller than 50,
    // and isBonus is false decrement c by 1
    // if isBonus is true c should remain the same


    System.out.println(c);




    int d = 8;
    int time = 120;
    String out3 = "";
    // if d is dividable by 4
    // and time is not more than 200
    // set out3 to "check"
    // if time is more than 200
    // set out3 to "Time out"
    // otherwise set out3 to "Run Forest Run!"


    System.out.println(out3);
  }

}
