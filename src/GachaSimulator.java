public class GachaSimulator {

    public GachaSimulator(RollGenerator roller, RollStatsTracker tracker){
        this.roller = roller;
        this.tracker = tracker;
    }

    RollGenerator roller;
    RollStatsTracker tracker;

    public Loot pull(){
        return roller.roll(tracker);
    }

}
