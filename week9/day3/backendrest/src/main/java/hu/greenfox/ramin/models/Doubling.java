package hu.greenfox.ramin.models;

import org.springframework.stereotype.Component;

/**
 * Created by HP on 5/10/2017.
 */

@Component
public class Doubling {

  private int received, result;

  public Doubling() {

  }

  public void cal(int recieved) {
    this.result = 2 * recieved;
  }

 //// We need all getters and setters, because JACKSON library needs them for transfering between Object and JSON respond
  ///// in the controller when Return the Object
  public int getReceived() {
    return received;
  }

  public int getResult() {
    return result;
  }

  public void setReceived(int received) {
    this.received = received;
  }

  public void setResult(int result) {
    this.result = result;
  }
}
