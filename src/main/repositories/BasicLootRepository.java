package main.repositories;

import main.interfaces.LootRepository;
import main.models.*;
import main.namegenerator.NameGeneratorAPIRequester;

import java.io.IOException;

public class BasicLootRepository implements LootRepository {


    NameGeneratorAPIRequester requester;

    public BasicLootRepository(NameGeneratorAPIRequester requester){
        this.requester = requester;
    }

    public BasicLoot getRandomLoot() throws IOException {

        return new BasicLoot(requester.getRandomName());
    }

}
