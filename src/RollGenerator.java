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

    public Loot roll(RollStatsTracker tracker) throws IOException {
        int random = (int) (Math.random()*100);
        tracker.addToRollCounter();
        if (random < RollSettings.getEpicProbabilityPercent()){
            if (random < RollSettings.getLegendaryProbabilityPercent()){
                Loot loot = legendaryRepository.getRandomLoot();
                tracker.addToLegendaryLootCounter();
                return loot;
            } else {
                Loot loot = epicRepository.getRandomLoot();
                tracker.addToEpicLootCounter();
                return loot;
            }
        } else {
            Loot loot = basicRepository.getRandomLoot();
            tracker.addToBasicLootCounter();
            return loot;
        }
    }
}
