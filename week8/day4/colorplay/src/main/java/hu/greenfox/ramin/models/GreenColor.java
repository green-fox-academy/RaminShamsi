package hu.greenfox.ramin.models;


import org.springframework.stereotype.Component;

@Component
public class GreenColor implements MyColor {

  @Override
  public void printColor() {
    System.out.println("It is Green Color class...");
  }
}
