package hu.greenfox.ramin.models;


import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CalorieList {
  private List<Float> calorie;

  public CalorieList() {
    this.calorie = new ArrayList<>();
  }

  public List<Float> getCalorie() {
    return calorie;
  }

  public void setCalorie(List<Float> calorie) {
    this.calorie = calorie;
  }
}
