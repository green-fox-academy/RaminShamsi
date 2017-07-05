package parking.lot;


import java.util.Arrays;
import java.util.List;


public class Car {

  private Type type;
  Color color;

  public Type getType() {
    return type;
  }

  public Color getColor() {
    return color;
  }
  ////////////////////////////////////////

  public enum Type {
    TYPE("BMW", "Ford", "Benz", "Porsche", "Citroen", "Ferrari");

    private List<String> carType;

    Type(String... anyType) {
      this.carType = Arrays.asList(anyType);
    }

    public List<String> getCarType() {
      return carType;
    }

    List<String> showValue() {
      return this.carType;
    }
  }
}
