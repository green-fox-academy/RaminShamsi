package hu.greenfox.reddit.ramin.models;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Timestamp;

//@Getter
//@Setter
//@AllArgsConstructor
//@Component
@Entity
public class Post {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  Long id;
  String title;
  String href;
  Timestamp timeStamp;
  int score;

  public Post(){
    this.timeStamp = new Timestamp(System.currentTimeMillis());
    this.score =0;
  }

  public Post(String title, String href) {
    this.title = title;
    this.href = href;
    this.timeStamp = new Timestamp(System.currentTimeMillis()/1000);
    this.score =0;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getHref() {
    return href;
  }

  public void setHref(String href) {
    this.href = href;
  }

  public Timestamp getTimeStamp() {
    return timeStamp;
  }

  public void setTimeStamp(Timestamp timeStamp) {
    this.timeStamp = timeStamp;
  }

  public int getScore() {
    return score;
  }

  public void setScore(int score) {
    this.score = score;
  }
}
