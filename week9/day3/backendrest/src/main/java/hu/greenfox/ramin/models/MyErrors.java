package hu.greenfox.ramin.models;


import org.springframework.stereotype.Component;

@Component
public class MyErrors {

 private String error;

  public MyErrors(){

  }

  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }
}
