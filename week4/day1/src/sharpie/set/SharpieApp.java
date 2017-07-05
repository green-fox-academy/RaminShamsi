package sharpie.set;

/**
 * Created by HP on 4/16/2017.
 */
public class SharpieApp {
  public static void main(String[] args) {
    Sharpie pen1 = new Sharpie("Red", 2);
    pen1.use(63.3f);
    SharpieSet ramin = new SharpieSet();
    ramin.addToList(new Sharpie("Green", 5));
    ramin.addToList(new Sharpie("Blue", 6));
    ramin.addToList(pen1);
    ramin.sharpieList.get(2).inkAmount = 0;
    System.out.println(ramin.sharpieList.size());
    System.out.println(ramin.sharpieList.get(2).isUsable());
    ramin.removeTrash();
    System.out.println(ramin.sharpieList.size());
    System.out.println(ramin.countUsable());
  }
}
