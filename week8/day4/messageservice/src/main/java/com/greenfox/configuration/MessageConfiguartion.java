package com.greenfox.configuration;


import com.greenfox.service.EmailService;
import com.greenfox.service.MessageService;
import com.greenfox.service.TwitterService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class MessageConfiguartion {

  @Bean("Email")
  @Primary
  public MessageService getEmail(){
    return new EmailService();
  }

  @Bean("Twitter")
  //@Primary
  public MessageService getTwitter(){
    return new TwitterService();
  }
}
