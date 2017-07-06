package com.greenfoxacademy.springstart.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.Random;

@Controller
public class HelloDiffLanguages {
  String[] hellos = {"Mirëdita", "Ahalan", "Parev", "Zdravei", "Nei Ho", "Dobrý den", "Ahoj", "Goddag", "Goede dag, Hallo", "Hello", "Saluton", "Hei", "Bonjour",
          "Guten Tag", "Gia'sou", "Aloha", "Shalom", "Namaste", "Namaste", "Jó napot", "Halló", "Helló", "Góðan daginn", "Halo", "Aksunai", "Qanuipit", "Dia dhuit",
          "Salve", "Ciao", "Kon-nichiwa", "An-nyong Ha-se-yo", "Salvëte", "Ni hao", "Dzien' dobry", "Olá", "Bunã ziua", "Zdravstvuyte", "Hola", "Jambo", "Hujambo", "Hej",
          "Sa-wat-dee", "Merhaba", "Selam", "Vitayu", "Xin chào", "Hylo", "Sut Mae", "Sholem Aleychem", "Sawubona"};

  @RequestMapping("/web/greetingAllWorld")  // This is for address URL calling
  public String greetingDiff(Model model) {     // The name of the method can be anything
    int index = (int) (Math.random() * hellos.length);
    model.addAttribute("randomHello", hellos[index]);
    model.addAttribute("item", hellos);
    model.addAttribute("r", (int) (Math.random() * 255));
    model.addAttribute("g", (int) (Math.random() * 255));
    model.addAttribute("b", (int) (Math.random() * 255));
    model.addAttribute("fontSize", (int) (Math.random() * 255));
    return "greetingDiffLanguages2";  // This is the html file name
  }
}
