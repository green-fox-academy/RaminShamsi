package hu.greenfox.ramin.controllers;


import hu.greenfox.ramin.models.ErrorHandler;
import hu.greenfox.ramin.models.Guardian;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.*;

@RestController
public class MainRestController {

  @Autowired
  Guardian guardian;
  @GetMapping("/groot")
  public Guardian GuardianController(@RequestParam String message){
    guardian.setReceived(message);
    return guardian;
  }

  @Autowired
  ErrorHandler errorHandler;

  @ExceptionHandler(MissingServletRequestParameterException.class)
  public ErrorHandler getGuardianError(){
      errorHandler.setError("I am Groot!");
    return errorHandler;
  }
}
