package parking.lot;


import java.util.*;

/**
 * Created by HP on 4/19/2017.
 */
public class ParkingLotApp {
  public static void main(String[] args) {
    List<String> carTypeList = new ArrayList<>();
    List<String> carColorList = new ArrayList<>();
    List<String> carMixedList = new ArrayList<>();

    Car myCar = new Car();
      int sizeOfType = Car.Type.TYPE.showValue().size();    //Accessing trough the Car class to Type enum Static and its fields
    //   int sizeOfType = myCar.getType().TYPE.showValue().size();   // and get rid of warning of like color line
    int sizeOfColor =myCar.color.COLOR.showValue().size();

    List<String> listOfEnumType = Car.Type.TYPE.showValue();
    List<String> listOfEnumColor = myCar.color.COLOR.showValue();

    for (int i = 0; i < 256; i++) {
      int colorIndex = (int) (Math.random() * sizeOfColor);
      int typeIndex = (int) (Math.random() * sizeOfType);
      String type = listOfEnumType.get((typeIndex));
      String color = listOfEnumColor.get((colorIndex));
      carTypeList.add(i, type);
      carColorList.add(i, color);
      carMixedList.add(i, color + type);
    }

    ///////////// Counting the frequency of each type  //////////////
    HashMap<String, Integer> typeList = new HashMap<>();
    for (String item : carTypeList) {
      if (typeList.containsKey(item)) {
        typeList.put(item, typeList.get(item) + 1);
      } else {
        typeList.put(item, 1);
      }
    }
    ///////////// Counting the frequency of each color //////////////
    HashMap<String, Integer> colorList = new HashMap<>();
    for (String item : carColorList) {
      if (colorList.containsKey(item)) {
        colorList.put(item, colorList.get(item) + 1);
      } else {
        colorList.put(item, 1);
      }
    }
    System.out.print("BMW:" + typeList.get("BMW") + ",  ");
    System.out.print("Ford:" + typeList.get("Ford") + ",  ");
    System.out.print("Benz:" + typeList.get("Benz") + ",  ");
    System.out.print("Porsche:" + typeList.get("Porsche") + ",  ");
    System.out.print("Citroen:" + typeList.get("Citroen") + ",  ");
    System.out.print("Ferrari:" + typeList.get("Ferrari"));
    System.out.println();
    System.out.print("Red:" + colorList.get("Red") + ",  ");
    System.out.print("Blue:" + colorList.get("Blue") + ",  ");
    System.out.print("Black:" + colorList.get("Black") + ",  ");
    System.out.print("Green:" + colorList.get("Green") + ",  ");
    System.out.print("Yellow:" + colorList.get("Yellow") + ",  ");
    System.out.print("Pink:" + colorList.get("Pink"));
    System.out.println();
     ///////////////////// Counting the frequency of each color+type //////////////
    HashMap<String, Integer> mixedList = new HashMap<>();
    for (String item : carMixedList) {
      if (mixedList.containsKey(item)) {
        mixedList.put(item, mixedList.get(item) + 1);
      } else {
        mixedList.put(item, 1);
      }
    }
    System.out.println("RedBMW:" + mixedList.get("RedBMW") + ",  "
            + "RedFord:" + mixedList.get("RedFord") + ",  "
            + "RedBenz:" + mixedList.get("RedBenz") + ",  "
            + "RedPorsche:" + mixedList.get("RedPorsche") + ",  "
            + "RedCitroen:" + mixedList.get("RedCitroen") + ",  "
            + "RedFerrari:" + mixedList.get("RedFerrari") + ", ... (It will be 36 item!)  ");
     ///////////////////////Finding the Max. Value and the related Key in MixedList///////////////////////
    for (Map.Entry<String, Integer> entry : mixedList.entrySet()) {
      if (entry.getValue().equals(Collections.max(mixedList.values()))) {
        System.out.println("Most frequently occurring vehicle is: " +
                Collections.max(mixedList.values()) + " " + entry.getKey());
      }
    }
  }
}
