package com.greenfox.ramin.lionking.bankaccount.application;


import lombok.AllArgsConstructor;

@AllArgsConstructor
public class BankAccount {
  String name;
  int balance;
  String animalType;

  public String getName() {
    return name;
  }

  public int getBalance() {
    return balance;
  }

  public String getAnimalType() {
    return animalType;
  }
}
