package main.roll;

import main.interfaces.*;

import java.io.IOException;

public class RollGenerator {

    public RollGenerator(LootRepository basicRepository, LootRepository epicRepository,
                         LootRepository legendaryRepository) {
        this.basicRepository = basicRepository;
        this.epicRepository = epicRepository;
        this.legendaryRepository = legendaryRepository;
    }

    LootRepository basicRepository;
    LootRepository epicRepository;
    LootRepository legendaryRepository;

    public Loot roll(RollStats stats, int random) throws IOException {
        stats.addToRollCounter();
        if (random <= RollSettings.getEpicProbabilityPercent()){
            if (random <= RollSettings.getLegendaryProbabilityPercent()){
                Loot loot = legendaryRepository.getRandomLoot();
                stats.addToLegendaryLootCounter();
                return loot;
            } else {
                Loot loot = epicRepository.getRandomLoot();
                stats.addToEpicLootCounter();
                return loot;
            }
        } else {
            Loot loot = basicRepository.getRandomLoot();
            stats.addToBasicLootCounter();
            return loot;
        }
    }



}
