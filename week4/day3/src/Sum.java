import java.util.ArrayList;
import java.util.List;

/**
 * Created by HP on 4/5/2017.
 */
public class Sum {


  public int sumOfList(ArrayList<Integer> myList){
    int sum =0;
    if(myList == null){
      System.out.println("It is Null");
      return 0;
    }
    for (int i = 0; i < myList.size(); i++) {
      sum +=myList.get(i);
    }
    return sum;
  }
}
