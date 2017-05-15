package hu.greenfox.ramin.controllers;


import hu.greenfox.ramin.models.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class MainRestController {

  @Autowired
  Guardian guardian;

  @GetMapping("/groot")
  public Guardian GuardianController(@RequestParam String message) {
    guardian.setReceived(message);
    return guardian;
  }


  /////////////////// 2nd exercise: Yondu ////////////////

  @Autowired
  Yondu yondu;

  @GetMapping("/yondu")
  public Yondu getYondu(@RequestParam float distance, @RequestParam float time) {
    yondu.setDistance(distance);
    yondu.setTime(time);
    float result = yondu.speed(distance, time);
    yondu.setSpeed(result);
    return yondu;
  }

  /////////////////////4th exercise: Drax's calorie table ///////////

  @Autowired
  FoodList myFoodList;

  @Autowired
  CalorieList calorieList;

  @GetMapping("/drax")
  public CalorieList getCalorie() {
    for (int i = 0; i < myFoodList.foodList.size(); i++) {
      calorieList.getCalorie().add(myFoodList.foodList.get(i).getCalorie());
    }
    return calorieList;
  }

  @PostMapping("/add")
  public FoodList getFood(@RequestBody Food food) {
    myFoodList.foodList.add(food);
    return myFoodList;
  }

  @DeleteMapping("/{name}/delete")
  public FoodList removeFood(@PathVariable String name) {
    for (int i = 0; i < myFoodList.foodList.size(); i++) {
      if (myFoodList.foodList.get(i).getName().contains(name)) {
        myFoodList.foodList.remove(i);
      }
    }
    return myFoodList;
  }

  @Autowired
  Amount amount;

  @PutMapping("/{name}/update")
  public FoodList updateFood(@PathVariable String name, @RequestBody Amount amount) {
    for (int i = 0; i < myFoodList.foodList.size(); i++) {
      if (myFoodList.foodList.get(i).getName().contains(name)) {
        myFoodList.foodList.get(i).setAmount(amount.getAmount());
      }
    }
    return myFoodList;
  }

  ///////////////////// Error Handling ///// exercise 1, 2 /////////////

  @Autowired
  ErrorHandler errorHandler;

  @ExceptionHandler(MissingServletRequestParameterException.class)
  public ErrorHandler getGuardianError(MissingServletRequestParameterException e) {
    if (e.getParameterName().equals("message")) {
      errorHandler.setError("I am Groot!");
    } else if (e.getParameterName().equals("distance") || e.getParameterName().equals("time")) {
      errorHandler.setError("Distance or Time is missing!");
    }
    return errorHandler;
  }
}

