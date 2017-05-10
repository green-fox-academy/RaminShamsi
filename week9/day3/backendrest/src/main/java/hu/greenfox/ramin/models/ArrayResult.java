package hu.greenfox.ramin.models;


import org.springframework.stereotype.Component;

@Component
public class ArrayResult {

  private int result;

  public ArrayResult() {
  }

  public void sum(int[] array) {
    int sum = 0;
    for (int i = 0; i < array.length; i++) {
      sum += array[i];
    }
    this.result = sum;
  }

  public int getResult() {
    return result;
  }

  public void setResult(int result) {
    this.result = result;
  }
}
