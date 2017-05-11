package hu.greenfox.ramin.models;


import org.springframework.stereotype.Component;

@Component
public class ArrayResult extends ParentResult{

  int[] result;

  public ArrayResult() {
  }

  public void doubled(int[] array) {

    this.result = new int[array.length];
    for (int i = 0; i < array.length; i++) {
      this.result[i] = 2 * array[i];
    }
  }

  public int[] getResult() {
    return result;
  }

  public void setResult(int[] result) {
    this.result = result;
  }
}
