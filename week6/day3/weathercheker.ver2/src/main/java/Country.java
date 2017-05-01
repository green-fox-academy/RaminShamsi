import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

class Country {

  String weather(String[] args) {
    Object[] countryCode = ArgumentHandler.getCountryCode(args);
    if (countryCode[1] == null) {
      return weatherRequest(countryCode[0]);
    } else {
      int temprature1 = Integer.parseInt(weatherRequest(countryCode[0]).split(" ")[0]);
      int temprature2 = Integer.parseInt(weatherRequest(countryCode[1]).split(" ")[0]);
      return weatherRequest(countryCode[0]) + "\n"
              + weatherRequest(countryCode[1]) + "\n"
              + "The temperature difference is: " + Math.abs(temprature1 - temprature2);
    }
  }

  private String weatherRequest(Object countryCode) {
    double latitude = getLocation(countryCode)[0];
    double longitude = getLocation(countryCode)[1];
    HttpResponse<String> response = null;
    try {
      response = Unirest.get("https://simple-weather.p.mashape.com/weather?lat="
              + latitude + "&lng=" + longitude)
              .header("X-Mashape-Key", "cdCW8dRwqLmshDMRJ8Z1cpPfa6QYp1YIcA9jsn6wqIEohtQUJx")
              .asString();
    } catch (UnirestException e) {
      e.printStackTrace();
    }
    return response.getBody().toString();
  }

  private double[] getLocation(Object countryId) {
    double[] geoInfo = new double[2];
    for (int i = 0; i < dataBase.fileReader().size(); i++) {
      String[] line = dataBase.fileReader().get(i);
      if (countryId.equals(line[0])) {
        geoInfo[0] = Double.parseDouble(line[1]);
        geoInfo[1] = Double.parseDouble(line[2]);
      }
    }
    if (geoInfo[0] == 0 && geoInfo[1] == 0) {
      System.out.println("Wrong Country ID");
      System.exit(0);
    }
    return geoInfo;
  }
}
