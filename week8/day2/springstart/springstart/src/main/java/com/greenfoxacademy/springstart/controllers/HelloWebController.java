package com.greenfoxacademy.springstart.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.concurrent.atomic.AtomicLong;

@Controller
public class HelloWebController {

  AtomicLong newCounter = new AtomicLong();
  // the URL should be like: http://localhost:8080/greeting?anyName=<put any name here>  NOTE: attention to "anyName"
  @RequestMapping("/web/greeting")
  public String greeting(Model model, @RequestParam("anyName") String name) {
    model.addAttribute("nameOfAnything", name);
    model.addAttribute("counter", newCounter.incrementAndGet());
    return "greeting";
  }
}
