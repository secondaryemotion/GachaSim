package main.repositories;

import main.interfaces.LootRepository;
import main.models.EpicLoot;
import main.namegenerator.NameGeneratorAPIRequester;

import java.io.IOException;

public class EpicLootRepository implements LootRepository {

    NameGeneratorAPIRequester requester;

    public EpicLootRepository(NameGeneratorAPIRequester requester){
        this.requester = requester;
    }

    public EpicLoot getRandomLoot() throws IOException {

        return new EpicLoot(requester.getRandomName());
    }

    }


