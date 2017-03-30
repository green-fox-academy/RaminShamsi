/**
 * Created by HP on 3/30/2017.
 */
public class Bunny1 {
  public static void main(String[] args) {
    // We have a number of bunnies and each bunny has two big floppy ears.
// We want to compute the total number of ears across all the bunnies recursively (without loops or multiplication).
    int numberOfBunny = 5;
    int result = earsNumber (numberOfBunny);
    System.out.println("Number of ears = " + result);
  }

  private static int earsNumber(int numberOfBunny) {
    int result;
    if(numberOfBunny == 0){
      return 0;
    } else {
      result = earsNumber(numberOfBunny-1) + 2;
      return result;
    }
  }
}
