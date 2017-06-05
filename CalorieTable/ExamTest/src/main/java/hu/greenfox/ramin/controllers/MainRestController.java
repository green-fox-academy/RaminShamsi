package hu.greenfox.ramin.controllers;


import hu.greenfox.ramin.models.MealInfo;
import hu.greenfox.ramin.models.MealList;
import hu.greenfox.ramin.models.Respond;
import hu.greenfox.ramin.repository.MealInfoRepo;
import java.util.HashMap;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@CrossOrigin("*")
@RestController
public class MainRestController {

  @Autowired
  MealInfo mealInfo;

  @Autowired
  MealInfoRepo mealInfoRepo;

  @Autowired
  MealList mealList;

  /*     // this version add the field of MealList CLass name in front of result! (other method HashMap)
    @GetMapping("/getmeals")
    public MealList getMealList() {
      mealList.setListOfMeal(mealInfoRepo.findAll());
      return mealList;
    }
  */
  @GetMapping("/getmeals")
  public Iterable getMealList() {
    return mealInfoRepo.findAll();
  }

  @GetMapping("/getstats")
  public HashMap<String, Integer> getStats() {
    HashMap<String, Integer> stats = new HashMap<>();
    stats.put("Number of meals", (int) mealInfoRepo.findAll().spliterator().getExactSizeIfKnown());
    int totalCalorie = 0;
    for (MealInfo item : mealInfoRepo.findAll()) {
      totalCalorie += item.getCalories();
    }
    stats.put("Total calories", totalCalorie);
    return stats;
  }

  @PostMapping("/meal")
  public ResponseEntity addMeal(@Valid @RequestBody MealInfo mealInfo, BindingResult bindingResult) {
    if (!bindingResult.hasErrors()) {
      mealInfoRepo.save(mealInfo);
      ResponseEntity responseEntity = new ResponseEntity(new Respond("ok"), HttpStatus.OK);
      return responseEntity;
    }
    return new ResponseEntity(new Respond("error"), HttpStatus.BAD_REQUEST);
  }

  @DeleteMapping("/meal")
  public ResponseEntity deleteMeal(@RequestBody MealInfo mealInfo) {
    if (mealInfoRepo.findOne(mealInfo.getId()) == null) {
      return new ResponseEntity(new Respond("error: ID is wrong or missing!"), HttpStatus.BAD_REQUEST);
    }
    mealInfoRepo.delete(mealInfoRepo.findOne(mealInfo.getId()));
    return new ResponseEntity(new Respond("ok"), HttpStatus.OK);
  }

  RestTemplate restTemplate = new RestTemplate();

  @PutMapping("/meal")
  public ResponseEntity edit(@Valid @RequestBody MealInfo mealInfo, BindingResult bindingResult) {
    if (!bindingResult.hasErrors()) {
      //  mealInfoRepo.save(mealInfo);

      Respond r = restTemplate.postForObject("http://localhost:8080/meal", mealInfo, Respond.class);

      return new ResponseEntity(r, HttpStatus.OK);
      //   return new ResponseEntity(new Respond("ok"), HttpStatus.OK);
    }
    return new ResponseEntity(new Respond("error"), HttpStatus.BAD_REQUEST);
  }
}
