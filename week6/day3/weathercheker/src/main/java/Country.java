import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

/**
 * Created by HP on 4/28/2017.
 */
public class Country {

  static double[] location(Object countryId) {
    double latitude;
    double longitude;
    double[] position = new double[2];
    for (int i = 0; i < dataBase.fileReader().size(); i++) {
      String[] line = dataBase.fileReader().get(i);
      if (countryId.equals(line[0])) {
        latitude = Double.parseDouble(line[1]);
        longitude = Double.parseDouble(line[2]);
        position[0] = latitude;
        position[1] = longitude;
      }
    }
    return position;
  }

  static String weather(double[] position) {
    try {
      HttpResponse<String> response = Unirest.get("https://simple-weather.p.mashape.com/weather?lat="
              + position[0] + "&lng=" + position[1])
              .header("X-Mashape-Key", "cdCW8dRwqLmshDMRJ8Z1cpPfa6QYp1YIcA9jsn6wqIEohtQUJx")
              .asString();
      return response.getBody().toString();
    } catch (UnirestException e) {
      e.printStackTrace();
    }
    return null;
  }
}
