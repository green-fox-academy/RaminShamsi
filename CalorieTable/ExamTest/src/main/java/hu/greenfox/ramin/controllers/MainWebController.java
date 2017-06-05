package hu.greenfox.ramin.controllers;


import hu.greenfox.ramin.models.Meal;
import hu.greenfox.ramin.models.MealInfo;
import hu.greenfox.ramin.repository.MealInfoRepo;
import hu.greenfox.ramin.repository.MealRepo;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainWebController {

  @Autowired
  MealRepo mealRepo;

  @Autowired
  MealInfoRepo mealInfoRepo;

  Meal breakfast = new Meal("Breakfast");
  Meal elevenses = new Meal("Elevenses");
  Meal lunch = new Meal("Lunch");
  Meal snack = new Meal("Snack");
  Meal dinner = new Meal("Dinner");
  Meal midnightSnack = new Meal("Midnight Snack");


  @GetMapping(value = {"/index", ""})
  public String home(Model model) {
 /*   mealRepo.save(breakfast);
    mealRepo.save(elevenses);
    mealRepo.save(lunch);
    mealRepo.save(snack);
    mealRepo.save(dinner);
    mealRepo.save(midnightSnack);  */
    List<MealInfo> listOfMeal = new ArrayList<>();
    int totalCalorie = 0;
    for (MealInfo item : mealInfoRepo.findAll()) {
      listOfMeal.add(item);
      totalCalorie += item.getCalories();
    }
    model.addAttribute("numberOfMeals", listOfMeal.size());
    model.addAttribute("totalCalorie", totalCalorie);
    model.addAttribute("list", mealInfoRepo.findAll());
    return "index";
  }

  @GetMapping("/add")
  public String add(Model model, MealInfo mealInfo) {
    //   model.addAttribute("mealInfo", new MealInfo());  //if the Object name is "mealInfo" either we can use Model or Object itself
    model.addAttribute("mealType", mealRepo.findAll());
    return "add";
  }

  /*
    @PostMapping("/submit")
    public String submit(@RequestParam(value = "date", required = true) String date,
        @RequestParam(value = "mealtype", required = true) String mealType,
        @RequestParam(value = "description", required = false) String description,
        @RequestParam(value = "calorie", required = true) int calorie, @Valid MealInfo mealInfo) {
      System.out.println(mealType + calorie + description + date);
      mealInfo.setDate(date);
      mealInfo.setType(mealType);
      mealInfo.setDescription(description);
      mealInfo.setCalories(calorie);
      mealInfoRepo.save(mealInfo);
      return "redirect:/index";
    }
  */
  @PostMapping("/submit")
  public String submit(@Valid MealInfo mealInfo, BindingResult bindingResult,
      @RequestParam(value = "mealtype", required = true) String mealType, Model model) {
    //   System.out.println(mealType + calorie + description + date);
    if (bindingResult.hasErrors()) {
      model.addAttribute("mealType", mealRepo.findAll());
      return "add";
    }
   /*
    mealInfo.setId(mealInfo.getId());
    mealInfo.setDate(mealInfo.getDate());
    mealInfo.setDescription(mealInfo.getDescription());
    mealInfo.setCalories(mealInfo.getCalories());
    */
    mealInfo.setType(mealType);
    mealInfoRepo.save(mealInfo);
    return "redirect:/index";
  }

  @GetMapping("/delete/{id}")
  public String delete(@PathVariable long id) {
    mealInfoRepo.delete(mealInfoRepo.findOne(id));
    return "redirect:/index";
  }

  @GetMapping("/edit/{id}")
  public String edit(@PathVariable long id, Model model) {
    model.addAttribute("mealInfo", mealInfoRepo.findOne(id));
    model.addAttribute("mealType", mealRepo.findAll());
    return "add";
  }
}
