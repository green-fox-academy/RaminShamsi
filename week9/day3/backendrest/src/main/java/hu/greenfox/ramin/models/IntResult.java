package hu.greenfox.ramin.models;

import org.springframework.stereotype.Component;

@Component
public class IntResult extends ParentResult {

  int result;

  public IntResult() {
  }

  public void multiply(int[] array) {
    this.result = 1;
    for (int i = 0; i < array.length; i++) {
      this.result *= array[i];
    }
  }

  public void sum(int[] array) {
    this.result = 0;
    for (int i = 0; i < array.length; i++) {
      this.result += array[i];
    }
  }

  public int getResult() {
    return result;
  }

  public void setResult(int result) {
    this.result = result;
  }
}
