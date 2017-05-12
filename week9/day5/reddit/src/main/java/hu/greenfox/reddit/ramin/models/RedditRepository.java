package hu.greenfox.reddit.ramin.models;

import org.springframework.data.repository.CrudRepository;

/**
 * Created by HP on 5/12/2017.
 */
public interface RedditRepository extends CrudRepository<Post,Long> {

}
