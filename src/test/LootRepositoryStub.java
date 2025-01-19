package test;

import main.interfaces.Loot;
import main.interfaces.LootRepository;
import main.models.*;

import java.io.IOException;

class BasicLootRepositoryStub implements LootRepository {
    @Override
    public Loot getRandomLoot() throws IOException {
        return new BasicLoot("Basic loot");
    }
}

class EpicLootRepositoryStub implements LootRepository {
    @Override
    public Loot getRandomLoot() throws IOException {
        return new EpicLoot("Epic loot");
    }
}

class LegendaryLootRepositoryStub implements LootRepository {
    @Override
    public Loot getRandomLoot() throws IOException {
        return new LegendaryLoot("Legendary loot");
    }
}
