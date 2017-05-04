package com.greenfox.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MessageProceeder {

  //@Autowired                          //dependency injection with field
  MessageService messageService;

  @Autowired                            //dependency injection with Construction
  public MessageProceeder(MessageService messageService) {
    this.messageService = messageService;
  }
                                             // dependency injection with setter will be in MainApp
  public void setMessageService(MessageService messageService) {
    this.messageService = messageService;
  }


  public void processMessage(String s1, String s2) {
    messageService.sendMessage(s1,s2);
  }
}
