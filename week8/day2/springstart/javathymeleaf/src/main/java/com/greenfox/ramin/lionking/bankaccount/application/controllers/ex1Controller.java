package com.greenfox.ramin.lionking.bankaccount.application.controllers;


import com.greenfox.ramin.lionking.bankaccount.application.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ex1Controller {

 @RequestMapping("")
  public String exercise1(Model model) {
   BankAccount lion = new BankAccount("Simba",2000,"lion");
   model.addAttribute("myLion",lion);
   return "ex1";
  }
}
