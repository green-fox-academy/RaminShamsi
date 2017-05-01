import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import com.mashape.unirest.request.body.RequestBodyEntity;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Retrofit;

import java.io.IOException;

public class YodaSpeak {
  public static void main(String[] args) {
    Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("https://yoda.p.mashape.com/")
            .build();

    YodaRequest service = retrofit.create(YodaRequest.class);
    Call<ResponseBody> repos = service.translateSentence(
            "Oh my god this task was so complicated but so simple at a time.");
    try {
      System.out.println(repos.execute().body().string());
    } catch (IOException e) {
      e.printStackTrace();
    }

////// 2nd simpler solution with "Unirest Library" with a text "I am so happy" in the body of URL ////  i%20am%20so%20happy
    try {
      String text = "Ohhh yeah it works finally with separate text";
      HttpResponse<String> response = Unirest.get("https://yoda.p.mashape.com/yoda?sentence=" + text)
              .header("x-mashape-key", "cdCW8dRwqLmshDMRJ8Z1cpPfa6QYp1YIcA9jsn6wqIEohtQUJx")
              .asString();
      String translatedText = response.getBody().toString();
      System.out.println(translatedText);
    } catch (UnirestException e) {
      e.printStackTrace();
    }
    ////////////Example of post with calling static function ///////////////////

    RequestBodyEntity result = creatRequest("https://yoda.p.mashape.com/yoda", "I am so happy");
    String translatedText = result.getBody().toString();
    System.out.println(translatedText);

    ///////////////////////////////
  }

  static RequestBodyEntity creatRequest(String url, String body) {
    return Unirest
            .post(url)
            .header("x-mashape-key", "cdCW8dRwqLmshDMRJ8Z1cpPfa6QYp1YIcA9jsn6wqIEohtQUJx")
            .body(body);

  }
}
