package com.greenfox;

import com.greenfox.configuration.MessageConfiguartion;
import com.greenfox.service.MessageProceeder;
import com.greenfox.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan
public class MessageserviceApplication implements CommandLineRunner{

                    //Autowired @Componentscan annotation together with the help of @configuartion
  @Autowired             // try to make object type MessageService
  MessageProceeder messageProceeder;

  public static void main(String[] args) {
    SpringApplication.run(MessageserviceApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    // this line works without factory but..
    messageProceeder.processMessage("Hi Barba, How are you?", "office@greenfox.com");

   // ... but if I add the name of Bean in configuaration I need factory
    ApplicationContext factory = new AnnotationConfigApplicationContext(MessageConfiguartion.class);
      /// calling bean by names needs to cast them to MessageService Object, although it makes so, in configuration (It is bug)
    messageProceeder.setMessageService((MessageService) factory.getBean("Twitter"));
    messageProceeder.processMessage("Hi Barba, How are you?", "office@greenfox.com");
  }
}
