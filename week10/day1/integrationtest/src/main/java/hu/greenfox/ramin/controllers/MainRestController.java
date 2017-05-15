package hu.greenfox.ramin.controllers;


import hu.greenfox.ramin.models.Guardian;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainRestController {

  @Autowired
  Guardian guardian;
  @GetMapping("/groot")
  public Guardian GuardianController(@RequestParam String message){
    guardian.setReceived(message);
    return guardian;
  }
}
