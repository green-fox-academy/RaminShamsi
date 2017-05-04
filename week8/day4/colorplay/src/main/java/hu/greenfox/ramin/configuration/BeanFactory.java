package hu.greenfox.ramin.configuration;


import hu.greenfox.ramin.models.GreenColor;
import hu.greenfox.ramin.models.RedColor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = "hu.greenfox.ramin")
public class BeanFactory {

  @Bean
  public RedColor getRedColor() {
    return new RedColor();
  }

  @Bean
  public GreenColor getGreenColor() {
    return new GreenColor();
  }
}
