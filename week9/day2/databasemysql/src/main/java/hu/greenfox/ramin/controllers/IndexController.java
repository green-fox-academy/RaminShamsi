package hu.greenfox.ramin.controllers;


import hu.greenfox.ramin.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class IndexController {
  @Autowired
  TodoRepository repository;

  @RequestMapping(value = {"/list", "/"}, method = RequestMethod.GET)
  public String list(Model model) {

    model.addAttribute("eachTodo", repository.findAll());

    return "todo";
  }
}
