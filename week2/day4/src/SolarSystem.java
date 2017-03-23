/**
 * Created by HP on 3/23/2017.
 */
import java.util.*;
public class SolarSystem{
  public static void main(String... args){
    ArrayList<String> planetList = new ArrayList<String>(Arrays.asList("Mercury","Venus","Earth","Mars","Jupiter",
            "Uranus","Neptune"));

    // Saturn is missing from the planetList
    // Insert it into the correct position
    planetList.add(6, "Saturn");
    System.out.println(planetList);
  }
}