import java.lang.*;
/**
 * Created by HP on 3/23/2017.
 */
public class urlFixer {
  public static void main(String... args){
    String url = "https//www.reddit.com/r/nevertellmethebots";

    // Accidentally I got the wrong URL for a funny subreddit. It's probably "odds" and not "bots"
    // Also, the URL is missing a crutial component, find out what it is and insert it too!
    // Try to solve it more than once using different String functions!

   String url_1 = url.replace("ebots", "ods");
   StringBuilder url_2 = new StringBuilder(url_1);
   url_2.insert(5, ':');
   System.out.println(url_1);
   System.out.println(url_2.toString());
  }
}
