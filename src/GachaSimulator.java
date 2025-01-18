import java.io.IOException;

public class GachaSimulator {

    public GachaSimulator(RollGenerator roller, RollStats tracker){
        this.roller = roller;
        this.tracker = tracker;
    }

    RollGenerator roller;
    RollStats tracker;

    public Loot pull() throws IOException {
        return roller.roll(tracker);
    }

}
