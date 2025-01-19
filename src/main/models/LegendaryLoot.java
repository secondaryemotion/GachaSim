package main.models;

import main.enums.LootRarity;
import main.interfaces.Loot;

public class LegendaryLoot implements Loot {

    String name;

    public LegendaryLoot(String name) {
        this.name = name;
    }

    public String getLootName(){
        return name;
    }
    public LootRarity getRarity(){
        return LootRarity.legendary;
    }
}
