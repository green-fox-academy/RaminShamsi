package screen;


/**
 * Created by HP on 4/19/2017.
 */
public class ScreenApp {
  public static void main(String[] args) {
    Screen43 sreen43 = new Screen43(600, 800, Size.INCH15);
    System.out.println(sreen43);
    Screen screen169 = new Screen169(900, 1600, Size.INCH21);
    System.out.println(screen169);
    Screen screen219 = new Screen219(900, 2100, Size.INCH29);
    System.out.println(screen219);
  }
}
