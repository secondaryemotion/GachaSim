public class RollGenerator {
    public String roll(){
        int random = (int) (Math.random()*100);
        if (random < RollVariables.getEpicProbability()){
            if (random < RollVariables.getLegendaryProbability()){
                LegendaryLoot loot = new LegendaryLoot();
                return loot.getLootName();
            } else {
                EpicLoot loot = new EpicLoot();
                return loot.getLootName();
            }
        } else {
            BasicLoot loot = new BasicLoot();
            return loot.getLootName();
        }
    }
}
