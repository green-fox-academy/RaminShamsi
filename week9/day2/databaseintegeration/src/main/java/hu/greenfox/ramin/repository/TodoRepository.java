package hu.greenfox.ramin.repository;

import hu.greenfox.ramin.models.Todo;
import org.springframework.data.repository.CrudRepository;



public interface TodoRepository extends CrudRepository<Todo, Long> {
}
