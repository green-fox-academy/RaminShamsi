package hu.greenfox.ramin.models;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@Component
public class Fox {

  @Autowired
  Trick trick;

  String name;

  public String trick2;
  public List<String> trickList2 = new ArrayList<>();
  public List<String> ListofTricks2 = new ArrayList<>(Arrays.asList(
          "Make Coffee", "Clean the Flat", "Pick up a girl", "Cook a food", "Java programming", "Dancing", "Not get drunk"));

  public List<Trick> trickList = new ArrayList<>();
  String drink;
  String food;
  public List<String> foodList;
  public List<String> drinkList;


  public Fox() {
    foodList = new ArrayList<String>(Arrays.asList("Honey", "Salad", "Hamburger", "Soup", "Indian Food", "chicken", "Hummus"));
    drinkList = new ArrayList<String>(Arrays.asList("Water", "Beer", "Wine", "Pálinka", "Sex on the Beach", "tea", "Coffee"));
    this.food = "honey";
    this.drink = "beer";
  }

  public String getFood() {
    return food;
  }

  public String getDrink() {
    return drink;
  }

  public void setActualFood(String actualFood) {
    this.food = actualFood;
  }

  public void setActualDrink(String actualDrink) {
    this.drink = actualDrink;
  }

  //////////////////////Object////////////////////////////////////
  public void setActualTrick(String actualTrick) {
    trick.skill = actualTrick;
    this.trickList.add(trick);
  }

  ////////////////////String//////////////6
  public void setActualTrick2(String actualTrick) {
    this.trick2 = actualTrick;
    trickList2.add(actualTrick);
  }

  public boolean empty() {
    return (trickList2.size() == 0) ? true : false;
  }
}
