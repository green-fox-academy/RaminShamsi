import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Query;


public interface YodaRequest {
  @Headers({"X-Mashape-Key:cdCW8dRwqLmshDMRJ8Z1cpPfa6QYp1YIcA9jsn6wqIEohtQUJx"})
  // request url
  @GET("yoda")
  // response
  Call<ResponseBody> translateSentence(@Query("sentence") String text);
}
