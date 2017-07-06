package helloworld.configuartion;


import helloworld.model.HelloWorld;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanFactory {

  @Bean
  public HelloWorld getMessage() {
    return new HelloWorld();
  }
}
