package hu.greenfox.ramin.controllers;

import com.sun.org.apache.xpath.internal.operations.Mod;
import hu.greenfox.ramin.models.Fox;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Arrays;

/**
 * Created by HP on 5/4/2017.
 */

@Controller
public class MainController {

  @Autowired
  Fox fox;

  @RequestMapping("/")
  public ModelAndView info() {
    ModelAndView m = new ModelAndView();
    m.setViewName("information");
    m.addObject("food", fox.getFood());
    m.addObject("drink", fox.getDrink());
 //   System.out.println(fox.foodList.get(3));
    return m;
  }

  @RequestMapping("/nutritionStore")
  public ModelAndView nutrition() {
    ModelAndView m = new ModelAndView();
    m.setViewName("nutrition");
    m.addObject("foodList", fox.foodList);
    m.addObject("drinkList", fox.drinkList);
    return m;
  }

  //, params = {"food", "drink"}   , HttpServletRequest request,  HttpServletResponse response , method = RequestMethod.GET
//  @RequestMapping("/submit")
//  public String submit(HttpServletRequest request) {
//    String actualFood =  request.getParameter("food");
//    String actualDrink =  request.getParameter("drink");
//   // System.out.println(actualFood);
//   // System.out.println(actualDrink);
//    fox.setActualFood(actualFood);
//    fox.setActualDrink(actualDrink);
//    return "redirect:/";
//  }

  @RequestMapping(value="/submit")
  public String change(@RequestParam("food") String actualFood, @RequestParam("drink") String actualDrink){
    fox.setActualFood(actualFood);
    fox.setActualDrink(actualDrink);
  //  fox.foodList.remove(fox.foodList.indexOf(actualFood));
    return "redirect:/";
  }


  @RequestMapping("/trick")
  public ModelAndView trick() {
    ModelAndView m = new ModelAndView();
    m.setViewName("trick");
    return m;
  }
}
