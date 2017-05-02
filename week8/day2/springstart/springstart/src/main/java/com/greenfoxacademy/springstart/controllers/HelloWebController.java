package com.greenfoxacademy.springstart.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.concurrent.atomic.AtomicLong;

@Controller
public class HelloWebController {

  AtomicLong newCounter = new AtomicLong();
  @RequestMapping("/web/greeting")
  public String greeting(Model model ) {
    model.addAttribute("nameOfAnything", "Ramin");
    model.addAttribute("counter", newCounter.incrementAndGet());
    return "greeting";
  }
}
