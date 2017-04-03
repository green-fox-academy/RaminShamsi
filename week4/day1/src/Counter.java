/**
 * Created by HP on 4/3/2017.
 */
public class Counter {
  int initialCounter;
  int result;

  public Counter(int initialNumber) {
    this.initialCounter = initialNumber;
    this.result = initialNumber;
  }

  public Counter() {
    this.initialCounter = 0;
    this.result = 0;
  }

  public void add(int number) {
    result = result + number;
  }

  public void add() {
    result = result + 1;
  }

  public int get() {
    return result;
  }

  public void reset() {
    result = initialCounter;
  }

  public static void main(String[] args) {
    Counter myCounter = new Counter(4);
    myCounter.add(6);
    System.out.println(myCounter.get());
    myCounter.add();
    System.out.println(myCounter.get());
    myCounter.reset();
    System.out.println(myCounter.get());
  }
}
