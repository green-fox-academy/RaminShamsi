package com.greenfox.ramin.lionking.bankaccount.application;

import java.util.ArrayList;
import java.util.List;


public class Bank {
  List<BankAccount> filledList;

  public static List fillList(){
    List<BankAccount> list = new ArrayList<BankAccount>();
    list.add(new BankAccount("Muffin", 3000, "Dog"));
    list.add(new BankAccount("Marty", 2000, "Zebra"));
    list.add(new BankAccount("Simba", 1000, "Lion"));
    list.add(new BankAccount("Rio", 5000, "Bird"));
    list.add(new BankAccount("Tom", 50, "Cat"));
    return list;
  }
}
