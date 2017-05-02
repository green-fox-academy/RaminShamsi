package com.greenfoxacademy.springstart.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloRESTController {

  @RequestMapping(value = "/greeting")
  public Greeting greeting(){
    Greeting myGreeting = new Greeting(1, "Hollo world!");
    return  myGreeting;
  }
}
