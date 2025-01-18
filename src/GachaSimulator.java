import java.io.IOException;

public class GachaSimulator {

    public GachaSimulator(RollGenerator roller, RollStats stats){
        this.roller = roller;
        this.stats = stats;
    }

    RollGenerator roller;
    RollStats stats;

    public Loot pull() throws IOException {
        return roller.roll(stats);
    }

}
