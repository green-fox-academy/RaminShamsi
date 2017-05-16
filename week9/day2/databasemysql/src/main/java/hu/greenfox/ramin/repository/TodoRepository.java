package hu.greenfox.ramin.repository;

import hu.greenfox.ramin.models.Todo;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface TodoRepository extends CrudRepository<Todo, Long> {
  List<Todo> findByDoneFalse();
  List<Todo> findByDoneTrue();
}
