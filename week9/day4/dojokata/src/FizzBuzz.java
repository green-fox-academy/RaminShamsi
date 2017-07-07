import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by HP on 5/11/2017.
 */
public class FizzBuzz {
  public static void main(String[] args) {
    List<Integer> myList = new ArrayList<>();
    for (int i = 1; i < 100; i++) {
      myList.add(i);
    }
    System.out.println(myList);
    FizzBuzzChecker(myList);
    System.out.println(FizzBuzzChecker(myList));
  }

  public static List<Object> FizzBuzzChecker(List<Integer> myList) {
    List<Object> resultList = new ArrayList<>();
    for (int i = 0; i < myList.size(); i++) {
      if ((myList.get(i) % 3 == 0) && (myList.get(i) % 5 == 0)) {
        resultList.add("FizzBuzz");
      } else if (myList.get(i) % 3 == 0){
        resultList.add("Fizz");
      } else if (myList.get(i) % 5 == 0){
        resultList.add("Buzz");
      }else {
        resultList.add(myList.get(i));
      }
    }
    return resultList;
  }
}
