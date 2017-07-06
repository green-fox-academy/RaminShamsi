package helloworld.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


public class HelloWorld {

  private String message;

  public void setMessage(String message) {
    this.message = message;
  }

  public String getMessage() {
    System.out.println("Your message: " + message);
    return message;
  }
}
