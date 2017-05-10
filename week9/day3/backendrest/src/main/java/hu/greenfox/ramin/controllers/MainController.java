package hu.greenfox.ramin.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {

  @RequestMapping(value="/")
  public ModelAndView home(){
    ModelAndView m = new ModelAndView();
    m.setViewName("index");
    return m;
  }
}
