package com.greenfoxacademy.springstart.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloRESTController {

  @RequestMapping(value = "/greeting")
  public Greeting greeting(@RequestParam("anyName") String name) {
    // the URL should be like: http://localhost:8080/greeting?anyName=Ramin
    Greeting myGreeting = new Greeting(1, "Hello, " + name + "!");
    return myGreeting;
  }
}
