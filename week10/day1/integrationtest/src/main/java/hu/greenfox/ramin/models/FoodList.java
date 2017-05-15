package hu.greenfox.ramin.models;


import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class FoodList {

  public List<Food> foodList;


  public FoodList() {
    foodList = new ArrayList<>();

  }

}
