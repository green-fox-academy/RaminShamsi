package hu.greenfox.ramin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class FoxclubApplication {

	public static void main(String[] args) {

		SpringApplication.run(FoxclubApplication.class, args);
	}
}
