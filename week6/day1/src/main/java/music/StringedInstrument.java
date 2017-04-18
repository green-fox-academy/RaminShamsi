package main.java.music;

/**
 * Created by HP on 4/18/2017.
 */
public abstract class StringedInstrument extends Instrument {
  int numberOfStrings;
  final String formatForPlay = "%s, a %d-stringed instrument that %s\n";

  @Override
  public void play() {
    System.out.format(formatForPlay, name, numberOfStrings, sound);
  }
}
