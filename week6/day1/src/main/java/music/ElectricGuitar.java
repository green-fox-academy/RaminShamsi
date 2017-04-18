package main.java.music;

/**
 * Created by HP on 4/18/2017.
 */
public class ElectricGuitar extends StringedInstrument {

  public ElectricGuitar(int numberOfStrings){
    this.numberOfStrings = numberOfStrings;

  }
  public ElectricGuitar(){
    this.name = "Electric Guitar";
    this.numberOfStrings = 6;
    this.sound = "Twang";
  }
}
