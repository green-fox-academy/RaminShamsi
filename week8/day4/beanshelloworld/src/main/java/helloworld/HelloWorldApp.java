package helloworld;


import helloworld.configuartion.BeanFactory;
import helloworld.model.HelloWorld;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class HelloWorldApp {
  public static void main(String[] args) {
    // Asking Spring to run my current class as an application
    SpringApplication.run(HelloWorldApp.class);
    // making a spring bean factory
    ApplicationContext factory = new AnnotationConfigApplicationContext(BeanFactory.class);

    HelloWorld myHello = factory.getBean(HelloWorld.class);
    myHello.setMessage("I am saying Hello to world from Bean Factory!");
    myHello.getMessage();
  }
}
