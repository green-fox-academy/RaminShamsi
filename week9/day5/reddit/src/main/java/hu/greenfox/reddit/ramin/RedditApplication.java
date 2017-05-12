package hu.greenfox.reddit.ramin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan
public class RedditApplication {

	public static void main(String[] args) {

		SpringApplication.run(RedditApplication.class, args);
	}
}
