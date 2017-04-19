package parking.lot;

import java.util.Arrays;
import java.util.List;

/**
 * Created by HP on 4/19/2017.
 */
public enum Type {
  TYPE("BMW", "Ford", "Benz", "Porsche", "Citroen", "Ferrari");

  private List<String> carType;

  Type(String... anyType) {
    this.carType = Arrays.asList(anyType);
  }

  List<String> showValue() {
    return this.carType;
  }
}
