import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.*;

import org.json.JSONArray;
import org.json.JSONObject;

public class NameGeneratorAPIRequester {

    private final URL url;

    public NameGeneratorAPIRequester(URL url)  {
            this.url = url;
    }



    public String getRandomName() throws IOException {
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");


        return makeRequest(connection).getString("name");
    }

    private JSONObject makeRequest(HttpURLConnection connection) throws IOException {

        BufferedReader in = new BufferedReader(
                new InputStreamReader(connection.getInputStream()));
        String inputLine;
        StringBuilder content = new StringBuilder();
        while ((inputLine = in.readLine()) != null) {
            content.append(inputLine);
        }
        in.close();

        return new JSONObject(content.toString());

    }

}
