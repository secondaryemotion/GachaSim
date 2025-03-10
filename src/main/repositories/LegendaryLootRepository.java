package main.repositories;

import main.interfaces.*;
import main.models.*;
import main.namegenerator.*;

import java.io.IOException;

public class LegendaryLootRepository implements LootRepository {

    NameGeneratorAPIRequester requester;

    public LegendaryLootRepository(NameGeneratorAPIRequester requester){
        this.requester = requester;
    }

    public LegendaryLoot getRandomLoot() throws IOException {

        return new LegendaryLoot(requester.getRandomName());
    }


}
