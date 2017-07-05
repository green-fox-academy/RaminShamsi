package sharpie.set;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by HP on 4/16/2017.
 */
public class SharpieSet {
  List<Sharpie> sharpieList;

  public SharpieSet() {
    sharpieList = new ArrayList<>();
  }

  public void main(String[] args) {
    new SharpieSet().countUsable();
  }

  public void addToList(Sharpie sharpieObject) {
    sharpieList.add(sharpieObject);
  }

  public int countUsable() {
    int usableSharpie = 0;
    for (Sharpie item : sharpieList) {
      if (item.inkAmount > 10) {
        usableSharpie++;
      }
    }
    return usableSharpie;
  }

  void removeTrash() {
    for (int i = 0; i < sharpieList.size(); i++) {
      if (!sharpieList.get(i).isUsable()) {
        sharpieList.remove(i);
      }
    }
  }
}
