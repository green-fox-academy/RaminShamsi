/**
 * Created by HP on 3/23/2017.
 */
import java.lang.*;

  public class TakesLonger {
    public static void main(String... args){
      String quote = "Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.";

      // When saving this quote a disk error has occured. Please fix it.
      // Add "always takes longer than" to the StringBuilder (quote) between the words "It" and "you"
      // Using pieces of the quote variable (instead of just redefining the string)

      StringBuilder quoteModified = new StringBuilder(quote);
      quoteModified.insert(20, " always takes longer than");
      System.out.println(quoteModified);
    }
  }

