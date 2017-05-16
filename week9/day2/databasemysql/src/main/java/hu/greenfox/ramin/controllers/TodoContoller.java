package hu.greenfox.ramin.controllers;


import hu.greenfox.ramin.models.Todo;
import hu.greenfox.ramin.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/todo")
public class TodoContoller {

  @Autowired
  TodoRepository repository;

  @RequestMapping(value = {"/list", "/"}, method = RequestMethod.GET)
  public String list(Model model) {

    model.addAttribute("eachTodo", repository.findAll());

    return "todo";
  }

//  @RequestMapping(value = "")
//  public String done(@RequestParam(value = "isActive", required = false) Boolean done, Model model) {
////    if (done == null) {
////      model.addAttribute("eachTodo", repository.findAll());
////    }else
//    if (done == false) {
//      model.addAttribute("eachTodo", repository.findByDoneFalse());
//      //     System.out.println("I am here inside the method");
//    } else {
//      model.addAttribute("eachTodo", repository.findByDoneTrue());
//    }
//    return "todo";
//  }

  @RequestMapping(value = "/add")
  public String addHtml(Model model) {
    model.addAttribute("todo", new Todo());
    return "add";
  }

  @PostMapping(value = "/submit")
  public String submit(Todo todo) {
    repository.save(todo);
    return "redirect:/todo/";
  }

  //////////// Button//// List back All todos////
  @GetMapping("/done")
  public String doneFilter(@RequestParam(name = "isDone") String value, Model model) {
    if (value.equals("true")) {
      model.addAttribute("eachTodo", repository.findByDoneTrue());
    } else if (value.equals("false")) {
      model.addAttribute("eachTodo", repository.findByDoneFalse());
    }
    return "todo";
  }

  //////////////////// ALLToDO button ///////////
  @PostMapping("/")
  public String getALl(Model model) {
    model.addAttribute("eachTodo", repository.findAll());
    return "todo";
  }

  ///////////////// DELETING  (since it is coming from Hyperlink Click, it is Get method)///////////////////
  @GetMapping(value = "/{id}/delete")
  public String delete(@PathVariable long id, Model model) {
    repository.delete(id);
    model.addAttribute("eachTodo", repository.findAll());
    return "redirect:/todo/";
  }

  //////////////////// Edit and Save///////////////////////
  @GetMapping("/{id}/edit")
  public String edit(@PathVariable long id, Model model) {
    model.addAttribute("eachTodo", repository.findOne(id));
    return "edit";
  }

  @PostMapping(value = "/update")
  public String save(@RequestParam(name = "ID") long id,
                     @RequestParam(name = "Title") String title,
                     @RequestParam(name = "isDone", required = false) boolean done,
                     @RequestParam(name = "isUrgent", required = false) boolean urgent) {
    Todo todo = repository.findOne(id);
    System.out.println(done);
    todo.setTitle(title);
    todo.setDone(done);
    todo.setUrgent(urgent);
    repository.save(todo);
    return "redirect:/todo/";
  }
}
