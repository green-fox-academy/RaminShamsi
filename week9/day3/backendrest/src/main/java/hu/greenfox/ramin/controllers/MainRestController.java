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
  UntilResult resultObj;

  @PostMapping("/dountil/{what}")
  public UntilResult getDoUntil(@PathVariable String what, @RequestBody Until inputNumber) {

    if (what.equals("sum")) {
      resultObj.sum(inputNumber.getUntil());
    } else {
      resultObj.factor(inputNumber.getUntil());
    }
    return resultObj;
  }

@Autowired
ArrayResult arrayResult;
  @PostMapping(value="/arrays")
  public ArrayResult getArrayResult(@RequestBody ArrayWhat inputData){
    if (inputData.getWhat().equals("sum")) {
      arrayResult.sum(inputData.getInputArray());
    }
    return arrayResult;
  }

  @Autowired
  MyErrors myErrors;

  //   Creating JSON form of error respond(means inside the curly bracket) with Object of the class
  @ExceptionHandler({MissingServletRequestParameterException.class})
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

  @ExceptionHandler(NullPointerException.class)
  public MyErrors getMyErrorsArray(NullPointerException e){
    myErrors.setError("Please provide what to do with the numbers!");
    return myErrors;
  }

}
