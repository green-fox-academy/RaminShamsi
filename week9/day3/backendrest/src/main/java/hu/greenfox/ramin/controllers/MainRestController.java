package hu.greenfox.ramin.controllers;

import hu.greenfox.ramin.models.AppendA;
import hu.greenfox.ramin.models.Doubling;
import hu.greenfox.ramin.models.Greeting;
import hu.greenfox.ramin.models.MyErrors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.*;


@RestController
public class MainRestController {

  @Autowired
  Doubling doubleObj;

  @GetMapping(value = "/doubling")
  public Doubling doubling(@RequestParam(value = "input", required = true) int inputValue) {
    doubleObj.setReceived(inputValue);
    doubleObj.cal(inputValue);
    return doubleObj;
  }


  @Autowired
  Greeting greeting;

  @GetMapping(value = "/greeter")
  public Greeting getGreeting(@RequestParam(value = "name", required = true) String name,
                              @RequestParam(value = "title", required = true) String title) {

    greeting.greeter(name, title);
    return greeting;
  }

  @Autowired
  AppendA appendA;

  @GetMapping("/appenda/{appendable}")
  public AppendA getAppendA(@PathVariable String appendable) {
    appendA.append(appendable);
    return appendA;
  }

  @Autowired
  MyErrors myErrors;

  //   Creating JSON form of error respond(means inside the curly bracket) with Object of the class
  @ExceptionHandler(MissingServletRequestParameterException.class)
  public MyErrors errorHandler(MissingServletRequestParameterException e) {
    if (e.getParameterName().equals("input")) {
      myErrors.setError("Please provide an input!");
    } else if (e.getParameterName().equals("name")) {
      myErrors.setError("Please provide an name!");
    } else if (e.getParameterName().equals("title")) {
      myErrors.setError("Please provide an title!");
    }
    return myErrors;
  }


}
