package hu.greenfox.reddit.ramin.restcontroller;


import hu.greenfox.reddit.ramin.models.Post;
import hu.greenfox.reddit.ramin.models.RedditRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.sql.Timestamp;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

@CrossOrigin("*")
@RestController
public class MainRestController {

  @Autowired
  RedditRepository repository;


//  @GetMapping("/posts")
//  public Iterable<Post> getPosts() {
//    Iterable<Post> posts = repository.findAll();   /// NOTE: the repository database has to save its content in
//    return posts;                                    /// Iterable List NOT normal List !
//  }

//// I used Hasmap form to put the name "posts" infront of the List. The above commented version is also works
  /// but does not put word "posts" in front of the list
  @GetMapping("/posts")
  public HashMap<String, Iterable<Post>> getPosts() {

    HashMap<String, Iterable<Post>> posts = new HashMap<>();
    posts.put("posts", repository.findAll());
    return posts;
  }


  @PostMapping("/posts")
  public Post postPosts(@RequestBody Post post) {

    return repository.save(post);
  }

  /////////////////////// PUTMAPING Method////////
  @PutMapping("posts/{id}/upvote")
  public Post upvotePosts(@PathVariable Long id, @RequestBody Post post) {
    Post postItem = repository.findOne(id);
    postItem.setScore(postItem.getScore() + 1);
    return repository.save(postItem);
  }

  @PutMapping("posts/{id}/downvote")
  public Post downPosts(@PathVariable Long id, @RequestBody Post post) {
    Post postItem = repository.findOne(id);
    postItem.setScore(postItem.getScore() - 1);
    return repository.save(postItem);
  }
  ///////////////////////DeleteMapping method !/////////////////////////

  @DeleteMapping("posts/{id}")
  public HashMap<String, Iterable<Post>> deletePosts(@PathVariable Long id, @RequestBody Post post) {
    repository.delete(id);
    return getPosts();
  }


}
