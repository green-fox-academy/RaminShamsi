package hu.greenfox.ramin.controllers;

import hu.greenfox.ramin.models.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.converter.HttpMessageNotReadableException;
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
  Result doUntil;

  @PostMapping("/dountil/{what}")
  public Result getDoUntil(@PathVariable String what, @RequestBody Until inputNumber) {

    if (what.equals("sum")) {
      doUntil.sum(inputNumber.getUntil());
    } else {
      doUntil.factor(inputNumber.getUntil());
    }
    return doUntil;
  }

  @Autowired
  MyErrors myErrors;

  //   Creating JSON form of error respond(means inside the curly bracket) with Object of the class
  @ExceptionHandler(MissingServletRequestParameterException.class)
  public MyErrors errorHandler(MissingServletRequestParameterException e) {
    System.out.println(e.getParameterName());
    if (e.getParameterName().equals("input")) {
      myErrors.setError("Please provide an input!");
    } else if (e.getParameterName().equals("name")) {
      myErrors.setError("Please provide a name!");
    } else if (e.getParameterName().equals("title")) {
      myErrors.setError("Please provide a title!");
    }
    return myErrors;
  }

  @ExceptionHandler(HttpMessageNotReadableException.class)
  public MyErrors errorHandlerDOUntil(HttpMessageNotReadableException e) {
    myErrors.setError("Please provide a number!");
    return myErrors;
  }

}
