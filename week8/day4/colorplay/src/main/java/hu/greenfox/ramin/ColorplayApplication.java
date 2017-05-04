package hu.greenfox.ramin;

import hu.greenfox.ramin.configuration.BeanFactory;
import hu.greenfox.ramin.models.GreenColor;
import hu.greenfox.ramin.models.RedColor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class ColorplayApplication {


  public static void main(String[] args) {

    SpringApplication.run(ColorplayApplication.class, args);

    ApplicationContext factory = new AnnotationConfigApplicationContext(BeanFactory.class);

    RedColor myRedColor = factory.getBean(RedColor.class);
    myRedColor.printColor();

    GreenColor myGreenColor = factory.getBean(GreenColor.class);
    myGreenColor.printColor();
  }
}
