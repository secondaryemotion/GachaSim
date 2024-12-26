import java.net.*;

public class NameGeneratorAPIRequester {

    private URL url;

    public NameGeneratorAPIRequester(String url) throws URISyntaxException, MalformedURLException {
        this.url = new URI(url).toURL();
    }


    public String getRandomName(){
        return null;
    }

}
