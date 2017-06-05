package hu.greenfox.ramin.repository;

import hu.greenfox.ramin.models.Meal;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by HP on 6/2/2017.
 */
public interface MealRepo extends CrudRepository<Meal, Long> {

}
