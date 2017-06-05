package hu.greenfox.ramin.models;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;

@Component
public class MealList {

  public Iterable<MealInfo> listOfMeal;

  public MealList(){
 //   listOfMeal = new ArrayList<>();
  }

  public Iterable<MealInfo> getListOfMeal() {
    return listOfMeal;
  }

  public void setListOfMeal(Iterable<MealInfo> listOfMeal) {
    this.listOfMeal = listOfMeal;
  }
}
