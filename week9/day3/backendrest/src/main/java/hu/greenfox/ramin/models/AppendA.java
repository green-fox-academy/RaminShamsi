package hu.greenfox.ramin.models;


import org.springframework.stereotype.Component;

@Component
public class AppendA {

  private String appended;

  public AppendA() {

  }

  public void append(String appendable) {
    this.appended = appendable + "a";
  }

  public String getAppended() {
    return appended;
  }

  public void setAppended(String appended) {
    this.appended = appended;
  }
}
