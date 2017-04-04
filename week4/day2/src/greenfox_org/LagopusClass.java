package greenfox_org;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by HP on 4/4/2017.
 */
public class LagopusClass {
  String className;
  List<Student> students;
  List<Mentor> mentors;

  public LagopusClass(String className) {
    this.className = className;
    students = new ArrayList<>();
    mentors = new ArrayList<>();
  }

  public void addStudent(Student typicalStudent) {
    students.add(typicalStudent);
  }

  public void addMentor(Mentor typicalMentor) {
    mentors.add(typicalMentor);
  }

  public void info() {
    System.out.println("\"Lagopus " + className + " class has " + students.size() + " students and " +
            mentors.size() + " mentors\"");
  }
}
