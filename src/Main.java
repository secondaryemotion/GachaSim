import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;

public class Main {
    public static void main(String[] args) throws URISyntaxException, IOException {

        URI uri = new URI("http://localhost:8080/random");
        NameGeneratorAPIRequester requester = new NameGeneratorAPIRequester(uri);

        RollGenerator roller = new RollGenerator(new BasicLootRepository(requester), new EpicLootRepository(requester),
            new LegendaryLootRepository(requester));
        RollStatsTracker tracker = new RollStatsTracker();

        GachaSimulator gacha = new GachaSimulator(roller, tracker);
        int pulls = 10;
        for (int i = 0; i < pulls; i++){
            Loot loot = gacha.pull();
            System.out.println(loot.getLootName());
        }
        System.out.println(tracker);

    }
}
