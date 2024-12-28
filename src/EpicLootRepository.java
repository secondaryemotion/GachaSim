import java.io.IOException;

public class EpicLootRepository implements LootRepository {

    NameGeneratorAPIRequester requester;

    EpicLootRepository(NameGeneratorAPIRequester requester){
        this.requester = requester;
    }

    public EpicLoot getRandomLoot() throws IOException {

        return new EpicLoot(requester.getRandomName());
    }

    }


