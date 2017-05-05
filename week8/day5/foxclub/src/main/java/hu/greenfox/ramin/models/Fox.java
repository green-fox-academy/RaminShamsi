package hu.greenfox.ramin.models;

import lombok.Getter;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@Component
public class Fox {

  String name;
  List<Trick> trickList;
  String drink;
  String food;
  public List<String> foodList;
  public List<String> drinkList;

  public Fox() {
    foodList = new ArrayList<String>(Arrays.asList("Honey", "Salad", "Hamburger", "Soup","Indian Food", "chicken", "Hummus"));
    drinkList = new ArrayList<String>(Arrays.asList("Water", "Beer", "Wine", "Pálinka","Sex on the Beach", "tea", "Coffee"));
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
}
