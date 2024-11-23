public class RollGenerator {
    int BasicLootCounter = 0;
    int EpicLootCounter = 0;
    int LegendaryLootCounter = 0;

    public RollGenerator(LootRepository basicRepository, LootRepository epicRepository,
                         LootRepository legendaryRepository) {
        this.basicRepository = basicRepository;
        this.epicRepository = epicRepository;
        this.legendaryRepository = legendaryRepository;
    }

    LootRepository basicRepository;
    LootRepository epicRepository;
    LootRepository legendaryRepository;

    public Loot roll(){
        int random = (int) (Math.random()*100);
        if (random < RollVariables.getEpicProbability()){
            if (random < RollVariables.getLegendaryProbability()){
                Loot loot = legendaryRepository.getRandomLoot();
                LegendaryLootCounter++;
                return loot;
            } else {
                Loot loot = epicRepository.getRandomLoot();
                EpicLootCounter++;
                return loot;
            }
        } else {
            Loot loot = basicRepository.getRandomLoot();
            BasicLootCounter++;
            return loot;
        }
    }
}
