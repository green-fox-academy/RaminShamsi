/**
 * Created by HP on 4/3/2017.
 */
public class Post_it {
  String backGround;
  String text;
  String textcolor;

  public Post_it(String backGround, String text, String textcolor) {
    this.backGround = backGround;
    this.text = text;
    this.textcolor = textcolor;
  }


  public static void main(String[] args) {
    Post_it idea1 = new Post_it("Orange", "I am idea1", "Blue");
    System.out.println("idea 1 has " + idea1.backGround + " background with the text says "
            + idea1.text + " in " + idea1.textcolor + " color.");

    Post_it awsome = new Post_it("pink", "I am Awesome text", "black");
    System.out.println("Awsome text has " + awsome.backGround + " background with the text says "
            + awsome.text + " in " + awsome.textcolor + " color.");

    Post_it superb = new Post_it("yellow", "I am Superb", "green");
    System.out.println("Superb text has " + superb.backGround + " background with the text says "
            + superb.text + " in " + superb.textcolor + " color.");
  }
}
