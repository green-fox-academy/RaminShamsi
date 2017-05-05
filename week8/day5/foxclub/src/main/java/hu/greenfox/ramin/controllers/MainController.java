package hu.greenfox.ramin.controllers;

import com.sun.org.apache.xpath.internal.operations.Mod;
import hu.greenfox.ramin.models.Fox;
import hu.greenfox.ramin.models.Trick;
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
  @Autowired
  Trick trick;


  @RequestMapping("/")
  public ModelAndView info() {
    ModelAndView m = new ModelAndView();
    m.setViewName("information");
    m.addObject("food", fox.getFood());
    m.addObject("drink", fox.getDrink());
    //////////////////Object /////////////
 //   m.addObject("trickListSize", fox.trickList.size());
//    m.addObject("eachTrick", fox.trickList.toString());                        /////  sharing this part
    //////////////////String/////////////////
    m.addObject("trickListSize2", fox.trickList2.size());
    m.addObject("eachTrick2", fox.trickList2);
    m.addObject("isEmpty", fox.trickList2.isEmpty());
  //  System.out.println(fox.trickList.size());
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

  @RequestMapping(value="/addNutrition")
  public String changeNutrition(@RequestParam("food") String actualFood, @RequestParam("drink") String actualDrink){
    fox.setActualFood(actualFood);
    fox.setActualDrink(actualDrink);
  //  fox.foodList.remove(fox.foodList.indexOf(actualFood));
    return "redirect:/";
  }


  @RequestMapping("/trick")
  public ModelAndView trick() {
    ModelAndView m = new ModelAndView();
    m.setViewName("trick");
    m.addObject("trickList", trick.ListofTricks);
    m.addObject("trickList2", fox.ListofTricks2);
 //   fox.trickList2.remove(fox.trickList2.indexOf(trick.removedTrick));
    return m;
  }

  @RequestMapping(value="/addTrick")
  public String addTrick(@RequestParam("trick") String actualTrick){
    fox.setActualTrick(actualTrick);

    //  fox.foodList.remove(fox.foodList.indexOf(actualFood));
    return "redirect:/";
  }

  @RequestMapping(value="/addTrick2")
  public String addTrick2(@RequestParam("trick") String actualTrick){
    fox.setActualTrick2(actualTrick);

    trick.setRemovedTrick(actualTrick);

    //  fox.foodList.remove(fox.foodList.indexOf(actualFood));
    return "redirect:/";
  }
}
