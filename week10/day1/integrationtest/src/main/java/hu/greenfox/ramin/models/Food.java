package hu.greenfox.ramin.models;


public class Food {

  String name;
  int amount;
  float calorie;

  public Food() {

  }

  public Food(String name, int amount, float calorie) {
    this.name = name;
    this.amount = amount;
    this.calorie = calorie;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAmount() {
    return amount;
  }

  public void setAmount(int amount) {
    this.amount = amount;
  }

  public float getCalorie() {
    return calorie;
  }

  public void setCalorie(float calorie) {
    this.calorie = calorie;
  }
}
