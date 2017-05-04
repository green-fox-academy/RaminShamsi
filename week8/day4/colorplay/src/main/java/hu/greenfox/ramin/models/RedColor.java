package hu.greenfox.ramin.models;


import org.springframework.stereotype.Component;

@Component
public class RedColor implements MyColor {

  @Override
  public void printColor() {
    System.out.println("It is Red Color class...");
  }

}
