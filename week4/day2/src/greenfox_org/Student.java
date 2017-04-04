package greenfox_org;

/**
 * Created by HP on 4/4/2017.
 */
public class Student extends Person {
  String previousOrganization;
  int skippedDay;

  public Student(String name, int age, String gender, String previousOrganization, int skippedDay) {
    super(name, age, gender);               //overriding the parent fields, which we need it.
    this.previousOrganization = previousOrganization;
    this.skippedDay = skippedDay;
   }

  public Student() {
    this.previousOrganization = "The School of Life";
    this.skippedDay = 0;
  }

  public void introduce() {
    System.out.println("\"Hi,I'm " + name + ", a " + age + " years old " + gender + " from " + previousOrganization +
            " who skipped " + skippedDay + "days from the course already.\"");
  }

  public void skipDays(int numberOfDays) {
    this.skippedDay += numberOfDays;
  }
}
