package main;

import main.interfaces.Loot;
import main.namegenerator.GachaSimulator;
import main.namegenerator.NameGeneratorAPIRequester;
import main.repositories.*;
import main.roll.RollGenerator;
import main.roll.RollStats;
import main.roll.RollStatsSerializer;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class Main {
    public static void main(String[] args) throws URISyntaxException, IOException, ClassNotFoundException {
        String rollStatsFilePath = "src/main/resources/roll_stats.txt";
        URI uri = new URI("http://localhost:8080/random");
        NameGeneratorAPIRequester requester = new NameGeneratorAPIRequester(uri);

        RollGenerator roller = new RollGenerator(new BasicLootRepository(requester), new EpicLootRepository(requester),
            new LegendaryLootRepository(requester));
        RollStats stats = RollStatsSerializer.deserialize(rollStatsFilePath);

        GachaSimulator gacha = new GachaSimulator(roller, stats);
        int pulls = 10;
        for (int i = 0; i < pulls; i++){
            Loot loot = gacha.pull();
            System.out.println(loot.getLootName());
        }
        System.out.println(stats);
        RollStatsSerializer.serialize(stats,rollStatsFilePath);

    }
}
