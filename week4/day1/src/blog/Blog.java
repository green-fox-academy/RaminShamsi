package blog;

import java.util.ArrayList;
import java.util.List;


public class Blog {
  List<BlogPost> blog;

  public Blog() {
    this.blog = new ArrayList<>();
  }

  void addBlogPost(BlogPost blogPostObject) {
    blog.add(blogPostObject);
  }

  void delete(int blogPostItem) {
    blog.remove(blogPostItem);
  }

  void update(int indexOfUpdateBlogPst, BlogPost newBlogPost) {
    blog.set(indexOfUpdateBlogPst, newBlogPost);
  }

}
