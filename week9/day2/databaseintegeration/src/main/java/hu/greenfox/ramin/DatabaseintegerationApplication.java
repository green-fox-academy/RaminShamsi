package hu.greenfox.ramin;

import hu.greenfox.ramin.models.Todo;
import hu.greenfox.ramin.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DatabaseintegerationApplication implements CommandLineRunner{

	@Autowired
	TodoRepository repository;

	public static void main(String[] args) {

		SpringApplication.run(DatabaseintegerationApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		repository.save(new Todo("Start the Day", false, false));
		repository.save(new Todo("Finish H2 Workshop", true, false));
		repository.save(new Todo("Finish JPA Workshop", false, true));

	}
}
