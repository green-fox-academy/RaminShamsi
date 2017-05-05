package hu.greenfox.ramin.models;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class Trick {
 public String skill;
 public String removedTrick;
 public List<String> ListofTricks = new ArrayList<>(Arrays.asList(
          "Make Coffee", "Clean the Flat", "Pick up a girl", "Cook a food", "Java programming", "Dancing"));

  public void setRemovedTrick(String removedTrick) {
    this.removedTrick = removedTrick;
  }
}
