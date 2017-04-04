package greenfox_org;

/**
 * Created by HP on 4/4/2017.
 */
public class Sponsor extends Person {
  String company;
  int hiredStudents;
 // int hiredStudentsCounter;

  public Sponsor(String name, int age, String gender, String company) {
    super(name, age, gender);
    this.company = company;
    this.hiredStudents = 0;
  }

  public Sponsor() {
    company = "Google";
    hiredStudents = 0;
  }

  public void introduce() {
    System.out.println("\"Hi,I'm " + name + ", a " + age + " years old " + gender +
            " who represents " + company + " and hired " + hiredStudents +
            " students so far.\"");
  }

  public void getGoal() {
    System.out.println("\"My goal is: Hire brilliant junior software developers.\"");
  }

  public void hire() {
    this.hiredStudents++;
  }
}
