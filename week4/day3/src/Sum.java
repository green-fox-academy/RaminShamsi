import java.util.ArrayList;
import java.util.List;

/**
 * Created by HP on 4/5/2017.
 */
public class Sum {
  List<Integer> list;

  public Sum(int a, int b, int c){
    list = new ArrayList<>();
    list.add(a);
    list.add(b);
    list.add(c);
  }

  public int sumOfList(){
    int sum =0;
    for (int i = 0; i < list.size(); i++) {
      sum +=list.get(i);

    }
    return sum;
  }
}
