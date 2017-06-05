package hu.greenfox.ramin.models;


import java.sql.Timestamp;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Meal {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  long id;

  String type;

  public Meal() {

  }

  public Meal(String type) {
    this.type = type;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }
}
