/**
 * Created by HP on 3/23/2017.
 */

import java.util.*;
import java.util.ArrayList;

public class Matchmaking {
  public static void main(String... args) {
    ArrayList<String> girls = new ArrayList<String>(Arrays.asList("Eve", "Ashley", "Bözsi", "Kat", "Jane", "Dori",
            "Annet"));
    ArrayList<String> boys = new ArrayList<String>(Arrays.asList("Joe", "Fred", "Béla", "Todd", "Neef", "Jeff"));
    ArrayList<String> order = new ArrayList<String>();

    // Join the two lists by matching one girl with one boy in the order list
    // Exepected output: "Eve", "Joe", "Ashley", "Fred"...
    // This code works both with different size of girls and boys
    if (girls.size() < boys.size()) {
      for (int i = 0; i < girls.size(); i++) {
        order.add(girls.get(i));
        order.add(boys.get(i));
      }
      for (int j = girls.size(); j < boys.size(); j++) {
        order.add(boys.get(j));
      }
    } else {
      for (int i = 0; i < boys.size(); i++) {
        order.add(girls.get(i));
        order.add(boys.get(i));
      }
      for (int j = boys.size(); j < girls.size(); j++) {
        order.add(girls.get(j));
      }
      System.out.println(order);
    }
  }
}