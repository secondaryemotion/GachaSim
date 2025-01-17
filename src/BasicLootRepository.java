import java.io.IOException;

public class BasicLootRepository implements LootRepository {


    NameGeneratorAPIRequester requester;

    BasicLootRepository(NameGeneratorAPIRequester requester){
        this.requester = requester;
    }

    public BasicLoot getRandomLoot() throws IOException {

        return new BasicLoot(requester.getRandomName());
    }

}
