package com.greenfox.ramin.lionking.bankaccount.application;


import com.sun.glass.ui.Application;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AppConfig {
  public static void main(String[] args) {
    // here comes the class name before .class method.
    SpringApplication.run(AppConfig.class, args);
  }
}
