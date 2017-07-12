/**
 * Created by HP on 7/12/2017.
 */
public class Algorithm {

  public static void main(String[] args) {
    sumOfAllMultiplesOf3And5(1000);
    sumOfEvenValueInFibonacci();
    largestPrimeFactor(13195L);
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

  private static void sumOfEvenValueInFibonacci() {
    int i = 0;
    int sum = 0;
    while (fibonacci(i) < 4000000) {
      System.out.println("i = " + i + " fibonacci= " + fibonacci(i));
      if (fibonacci(i) % 2 == 0) {
        sum += fibonacci(i);
      }
      i++;
    }
    System.out.println(sum);
  }

  private static int fibonacci(int n) {
    if (n == 0) {
      return 0;
    } else if (n == 1) {
      return 1;
    } else {
      return fibonacci(n - 1) + fibonacci(n - 2);
    }
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
//      System.out.println(i);
    }
    System.out.println("largestPrimeFactor = " + maxPrimeFactor);
  }

  private static boolean isItPrime(Long n) {
    for (int j = 2; j < n / 2 + 1; j++) {
      if (n % j == 0) {
        return false;
      }
    }
    return true;
  }

  private static void larget3DigitPalindorimic() {
    for (int i = 100; i < 999; i++) {

    }
  }

  private static boolean isItPalindromic(int n) {
    int num = n;
    int rev = 0;
    while (num > 0) {
      int dig = num % 10;
      rev = rev * 10 + dig;
      num = num / 10;
    }
    if (n == rev){
      return true;
    }
    return false;
  }
}
