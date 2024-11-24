public class GachaSimulator {
    RollGenerator roller = new RollGenerator(new BasicLootRepository(), new EpicLootRepository(),
            new LegendaryLootRepository());
    RollStatsTracker tracker = new RollStatsTracker();

    public Loot pull(){
        return roller.roll(tracker);
    }
    public int[] getStats(){
        return new int[]{tracker.getBasicLootCounter(),tracker.getEpicLootCounter(),
                tracker.getLegendaryLootCounter(), tracker.getRollCounter()};
    }
}
