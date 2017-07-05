
public class Sharpie {
  String color;
  float width;
  float inkAmount;

  public Sharpie(String color, float width) {
    this.inkAmount = 100f;
  }

  public float use(float consumption) {
   return this.inkAmount -= consumption;
  }

  boolean isUsable(){
    if (inkAmount > 10) {
      return true;
    }
    return false;
  }
}
