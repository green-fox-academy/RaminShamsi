package com.greenfox.service;

public class EmailService implements MessageService{

  @Override
  public void sendMessage(String message, String to) {
    System.out.println("Email Server sent Email to: " + to + " with message: " + message);
  }
}
