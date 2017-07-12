/**
 * Created by HP on 7/12/2017.
 */
public class Algorithm {

  public static void main(String[] args) {
    sumOfAllMultiplesOf3And5(1000);
    largestPrimeFactor(1319500L);
  }

  private static void sumOfAllMultiplesOf3And5(int input) {
    int sum = 0;
    for (int i = 1; i < input; i++) {
      if ((i % 3 == 0) || (i % 5 == 0)) {
        sum += i;
      }
    }
    System.out.println("sumOfAllMultiplesOf3And5(1000) = " + sum);
  }

  private static void largestPrimeFactor(Long input) {
    Long maxPrimeFactor = input;
    Long i = 2L;
    while (i < input) {
      if (input % i == 0) {
        if (isItPrime(i)) {
          maxPrimeFactor = i;
        }
      }
      i++;
      System.out.println(i);
    }
    System.out.println("largestPrimeFactor = " + maxPrimeFactor);
  }

  private static boolean isItPrime(Long n) {
    for (int j = 2; j < n/2+1; j++) {
      if (n % j == 0) {
        return false;
      }
    }
    return true;
  }
}
