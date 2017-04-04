package greenfox_org;

/**
 * Created by HP on 4/4/2017.
 */
public class Mentor extends Person {
  String level;

  public Mentor(String name, int age, String gender, String level) {
    super(name, age, gender);
    this.level = level;
  }

  public Mentor() {
    this.level = "intermediate";
  }

  public void introduce() {
    System.out.println("\"Hi,I'm " + name + ", a " + age + " years old " + gender + " " + level + " mentor\"");
  }
}
