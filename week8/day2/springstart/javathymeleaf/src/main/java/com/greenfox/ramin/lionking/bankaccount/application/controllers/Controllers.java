package com.greenfox.ramin.lionking.bankaccount.application.controllers;
import com.greenfox.ramin.lionking.bankaccount.application.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Controllers {

  @RequestMapping("")
  public String exercise1(Model model) {
    BankAccount lion = new BankAccount("Simba", 2000, "lion");
    model.addAttribute("myLion", lion);
    return "ex1";
  }

  @RequestMapping("/2decimals")
  public String exercise2(Model model) {
    BankAccount lion = new BankAccount("Simba", 2000, "lion");
    model.addAttribute("myLion", lion);
    return "ex2decimals";
  }

  @RequestMapping("/zebra")
  public String exercise3(Model model) {
    BankAccount zebra = new BankAccount("Marty", 2000, "Zebra");
    model.addAttribute("myZebra", zebra);
    return "ex3zebra";
  }

  @RequestMapping("/submitString")
  public String exercise4(Model model) {
    String string = "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>";
    model.addAttribute("myString", string);
    return "ex4submitString";
  }

}
