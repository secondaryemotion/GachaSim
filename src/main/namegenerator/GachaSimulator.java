package main.namegenerator;

import main.interfaces.Loot;
import main.roll.*;
import java.io.IOException;

public class GachaSimulator {

    public GachaSimulator(RollGenerator roller, RollStats stats){
        this.roller = roller;
        this.stats = stats;
    }

    RollGenerator roller;
    RollStats stats;

    public Loot pull() throws IOException {
        int random = (int) Math.round(Math.random()*100);
        return roller.roll(stats, random);
    }
}
