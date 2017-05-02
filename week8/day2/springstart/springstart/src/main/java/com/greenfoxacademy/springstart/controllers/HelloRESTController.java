package com.greenfoxacademy.springstart.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;


@RestController
public class HelloRESTController {

  AtomicLong counter = new AtomicLong();

  @RequestMapping(value = "/greeting")
  public Greeting greeting(@RequestParam("anyName") String name) {
    // the URL should be like: http://localhost:8080/greeting?anyName=<put any name here>   NOTE: attention to "anyName"
    Greeting myGreeting = new Greeting(counter.incrementAndGet(), "Hello, " + name + "!");
    return myGreeting;
  }
}
