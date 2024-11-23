public class GachaSimulator {
    RollGenerator roller = new RollGenerator(new BasicLootRepository(), new EpicLootRepository(),
            new LegendaryLootRepository());
    int rollCounter = 0;

    public Loot pull(){
        rollCounter++;
        return roller.roll();
    }
    public int[] getStats(){
        return new int[]{roller.BasicLootCounter, roller.EpicLootCounter, roller.LegendaryLootCounter};
    }
}
