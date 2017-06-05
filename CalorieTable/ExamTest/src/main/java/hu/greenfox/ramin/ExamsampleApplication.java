package hu.greenfox.ramin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
@SpringBootApplication
public class ExamsampleApplication {

  public static void main(String[] args) {
    SpringApplication.run(ExamsampleApplication.class, args);

  }
}
