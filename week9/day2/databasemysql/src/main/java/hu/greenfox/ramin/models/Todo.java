package hu.greenfox.ramin.models;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@lombok.Getter
@lombok.Setter
@Entity
public class Todo {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  int id;
  String title;
  boolean isUrgent = false;
  boolean isDone = false;

  public Todo() {

  }


  public Todo(String title, boolean isUrgent, boolean isDone) {
    this.title = title;
    this.isUrgent = isUrgent;
    this.isDone = isDone;
  }

  @Override
  public String toString() {
    return "Todo{" +
            "id=" + id +
            ", title='" + title + '\'' +
            ", isUrgent=" + isUrgent +
            ", isDone=" + isDone +
            '}';
  }
}
