package main.java.music;

/**
 * Created by HP on 4/18/2017.
 */
public class BassGuitar extends StringedInstrument{

  public BassGuitar(int numberOfStrings){
    this.numberOfStrings = numberOfStrings;
  }
  public BassGuitar(){
    this.name = "Bass Guitar";
    this.numberOfStrings = 4;
    this.sound = "Duum-duum-duum";
  }
}
