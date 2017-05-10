package hu.greenfox.ramin.models;


import org.springframework.stereotype.Component;

@Component
public class UntilResult {

  private int result;

  public UntilResult() {

  }

  public void sum(int inputNumber) {
    int sum = 0;
    for (int i = 0; i <= inputNumber; i++) {
      sum += i;
    }
    this.result = sum;
  }

  public void factor(int inputNumber) {
    int factorial = 1;
    for (int i = 1; i <= inputNumber; i++) {
      factorial *= i;
    }
    this.result = factorial;
  }


  public int getResult() {
    return result;
  }

  public void setResult(int result) {
    this.result = result;
  }
}
