public class RollGenerator {
    int BasicLootCounter = 0;
    int EpicLootCounter = 0;
    int LegendaryLootCounter = 0;

    LootRepository repository = new LootRepository();

    public String roll(){
        int random = (int) (Math.random()*100);
        if (random < RollVariables.getEpicProbability()){
            if (random < RollVariables.getLegendaryProbability()){
                LegendaryLoot loot = repository.getRandomLegendaryLoot();
                LegendaryLootCounter++;
                return loot.getLootName();
            } else {
                EpicLoot loot = repository.getRandomEpicLoot();
                EpicLootCounter++;
                return loot.getLootName();
            }
        } else {
            BasicLoot loot = repository.getRandomBasicLoot();
            BasicLootCounter++;
            return loot.getLootName();
        }
    }
}
