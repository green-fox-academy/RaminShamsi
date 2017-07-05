package sharpie.set;


public class Sharpie {
  String color;
  float width;
  float inkAmount;

  public Sharpie(String color, float width) {
    this.inkAmount = 100f;
  }

  public void use(float cosumption) {
    this.inkAmount -= cosumption;
  }

  boolean isUsable(){
    if (inkAmount > 10) {
      return true;
    }
    return false;
  }
}
