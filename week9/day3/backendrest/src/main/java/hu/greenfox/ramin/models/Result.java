package hu.greenfox.ramin.models;


import org.springframework.stereotype.Component;

@Component
public class Result {

  private int result;

  public Result() {

  }

  public void sum(int inputNumber) {
    int sum = 0;
    for (int i = 0; i <= inputNumber; i++) {
      sum += i;
    }
    this.result = sum;
  }

  public void factor(int inputNumber) {
    int multi = 1;
    for (int i = 1; i <= inputNumber; i++) {
      multi *= i;
    }
    this.result = multi;
  }


  public int getResult() {
    return result;
  }

  public void setResult(int result) {
    this.result = result;
  }
}
