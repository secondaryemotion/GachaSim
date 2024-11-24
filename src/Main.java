public class Main {
    public static void main(String[] args){
        RollGenerator roller = new RollGenerator(new BasicLootRepository(), new EpicLootRepository(),
            new LegendaryLootRepository());
        RollStatsTracker tracker = new RollStatsTracker();

        GachaSimulator gacha = new GachaSimulator(roller, tracker);
        int pulls = 100;
        for (int i = 0; i < pulls; i++){
            gacha.pull();
        }
        System.out.println(tracker.toString());

    }
}
