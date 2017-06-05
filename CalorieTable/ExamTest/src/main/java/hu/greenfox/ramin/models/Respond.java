package hu.greenfox.ramin.models;

/**
 * Created by HP on 6/4/2017.
 */
public class Respond {

  private String status;

  public Respond(String status) {
    this.status = status;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }
}
