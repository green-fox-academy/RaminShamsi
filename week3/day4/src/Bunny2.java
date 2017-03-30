/**
 * Created by HP on 3/30/2017.
 */
public class Bunny2 {
  public static void main(String[] args) {
    // We have bunnies standing in a line, numbered 1, 2, ... The odd bunnies
// (1, 3, ..) have the normal 2 ears. The even bunnies (2, 4, ..) we'll say
// have 3 ears, because they each have a raised foot. Recursively return the
// number of "ears" in the bunny line 1, 2, ... n (without loops or multiplication).

    int numberOfBunny = 5;
    int result = earsNumber (numberOfBunny);
    System.out.println("Number of ears = " + result);
  }

  private static int earsNumber(int numberOfBunny) {
    int result;
    if(numberOfBunny == 0){
      return 0;
    } else {
      if ((numberOfBunny % 2) == 0) {
        result = earsNumber(numberOfBunny - 1) + 3;
      } else {
        result = earsNumber(numberOfBunny - 1) + 2;
      }
      return result;
    }
  }
}
