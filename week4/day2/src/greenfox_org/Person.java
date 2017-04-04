package greenfox_org;

/**
 * Created by HP on 4/4/2017.
 */
public class Person {
  String name;
  String gender;
  int age;

  public Person(String name, int age, String gender) {
    this.name = name;
    this.age = age;
    this.gender = gender;
  }

  public Person() {
    this.name = "Jane Doe";
    this.age = 30;
    this.gender = "female";
  }

  public void introduce() {
    System.out.println("\"Hi,I'm " + name + ", a " + age + " years old " + gender+"\"");
  }

  public void getGoal(){
    System.out.println("\"My goal is: Live for the moment!\"");
  }
}
