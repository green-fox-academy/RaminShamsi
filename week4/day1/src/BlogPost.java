/**
 * Created by HP on 4/3/2017.
 */
public class BlogPost {
  String authorName;
  String title;
  String text;
  String publicationDate;

  public BlogPost(String authorName, String title, String publicationDate) {
    this.authorName = authorName;
    this.title = title;
    this.text = text;
    this.publicationDate = publicationDate;
  }

  public static void main(String[] args) {
    BlogPost post1 = new BlogPost("John Doe", "\"Wait for it\"", "\"2000.05.04.\"");
    post1.text = "BlaBla bla bla bla wait for it.";
    System.out.println(post1.title + " titled by " + post1.authorName + " posted at " + post1.publicationDate);
    System.out.println(post1.text);
  }
}
