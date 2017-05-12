package hu.greenfox.reddit.ramin.restcontroller;


import hu.greenfox.reddit.ramin.models.Post;
import hu.greenfox.reddit.ramin.models.PostService;
import hu.greenfox.reddit.ramin.models.RedditRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.sql.Timestamp;

@RestController
public class MainRestController {

  @Autowired
  RedditRepository repository;


  @GetMapping("/posts")
  public Iterable<Post> getPosts() {
    return repository.findAll();
  }

//  @Autowired
//  Post post;

  @PostMapping("/posts")
  public Post postPosts(@RequestBody Post post) {

    return repository.save(post);
  }

  /////////////////////// PUTMAPING Method////////
  @PutMapping("posts/{id}/upvote")
  public Post upvotePosts(@PathVariable Long id, @RequestBody Post post) {
    repository.findOne(id).setScore(repository.findOne(id).getScore() + 1);
    return repository.save(post);
  }
}
