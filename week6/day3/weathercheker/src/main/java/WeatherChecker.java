import joptsimple.OptionParser;
import joptsimple.OptionSet;

/**
 * Created by HP on 4/27/2017.
 */
public class WeatherChecker {
  public static void main(String[] args) {
    OptionParser myParser = new OptionParser();
    myParser.accepts("c").withRequiredArg();
    myParser.accepts("compare").withRequiredArg();
    OptionSet myOption = myParser.parse(args);

    if (myOption.has("c") && myOption.has("compare")) {
      Object countryId1 = myOption.valueOf("c");
      String weather1 = Country.weather(Country.location(countryId1));
      int temperatureCountry1 = Integer.parseInt(weather1.split(" ")[0]);
      System.out.println(weather1);
      Object countryId2 = myOption.valueOf("compare");
      String weather2 = Country.weather(Country.location(countryId2));
      int temperatureCountry2 = Integer.parseInt(weather2.split(" ")[0]);
      System.out.println(weather2);
      System.out.println("The temperature difference is: " + Math.abs(temperatureCountry1 - temperatureCountry2));

    } else if (myOption.has("c")) {
      Object countryId = myOption.valueOf("c");
      System.out.println(Country.weather(Country.location(countryId)));
    }
  }
}
