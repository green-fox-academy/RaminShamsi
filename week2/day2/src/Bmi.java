/**
 * Created by HP on 3/21/2017.
 */
public class Bmi {
  public static void main(String[] args) {

    double massInKg = 81.2;
    double heightInM = 1.78;
    double bmi;
    bmi = massInKg / (heightInM * heightInM);

    System.out.println("Your BMI is: " + bmi);
  }
}
