import java.io.IOException;

public class LegendaryLootRepository implements LootRepository {

    NameGeneratorAPIRequester requester;

    LegendaryLootRepository(NameGeneratorAPIRequester requester){
        this.requester = requester;
    }

    public LegendaryLoot getRandomLoot() throws IOException {

        return new LegendaryLoot(requester.getRandomName());
    }


}
