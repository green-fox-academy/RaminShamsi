package com.greenfox.service;

public class TwitterService implements MessageService{

  @Override
  public void sendMessage(String message, String to) {
    System.out.println("Twitter Server sent message to: " + to + " with content: " + message);
  }
}
