package parking.lot;

import java.util.Arrays;
import java.util.List;

/**
 * Created by HP on 4/19/2017.
 */

public enum Color {
    COLOR("Red", "Blue", "Black", "Green", "Yellow", "Pink");

  private List<String> carColor;

  Color(String... anyColor) {
    this.carColor = Arrays.asList(anyColor);
  }

  List<String> showValue() {
    return this.carColor;
  }
}
