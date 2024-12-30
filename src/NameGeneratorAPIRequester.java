import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.*;
import org.json.JSONObject;

public class NameGeneratorAPIRequester {

    private final URI uri;

    public NameGeneratorAPIRequester(URI uri) {
            this.uri = uri;
    }

    public String getRandomName() throws IOException {
        String requestEndpoint = "random";
        URL url = mergeURL(uri,requestEndpoint);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        RandomNameResult result = new RandomNameResult(makeRequest(connection));

        return result.getName();
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

    private URL mergeURL(URI url, String requestEndpoint) throws MalformedURLException {
        return url.resolve(requestEndpoint).toURL();
    }

}
