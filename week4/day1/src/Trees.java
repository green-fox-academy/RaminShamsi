import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * Created by HP on 4/2/2017.
 */
public class Trees {
  public static void main(String[] args) {

    List<Map<String, Object>> treesList = new ArrayList<>();

    Map<String, Object> tree0 = new HashMap<>();
    tree0.put("type", "Oak");
    tree0.put("leaf color", "Green");
    tree0.put("age", 50);
    tree0.put("sex", "male");
    treesList.add(0, tree0);

    Map<String, Object> tree1 = new HashMap<>();
    tree1.put("type", "Rain tree");
    tree1.put("leaf color", "yellow");
    tree1.put("age", 10);
    tree1.put("sex", "female");
    treesList.add(1, tree1);

    Map<String, Object> tree2 = new HashMap<>();
    tree2.put("type", "Jacaranda");
    tree2.put("leaf color", "violet");
    tree2.put("age", 43);
    tree2.put("sex", "female");
    treesList.add(2, tree2);

    Map<String, Object> tree3 = new HashMap<>();
    tree3.put("type", "Baobab");
    tree3.put("leaf color", "Green");
    tree3.put("age", 25);
    tree3.put("sex", "male");
    treesList.add(3, tree3);

    Map<String, Object> tree4 = new HashMap<>();
    tree4.put("type", "Sausage tree");
    tree4.put("leaf color", "Red");
    tree4.put("age", 31);
    tree4.put("sex", "female");
    treesList.add(4, tree4);

    for (Map<String, Object> eachMap : treesList) {
      System.out.println(eachMap.get("age"));
    }
  }
}
