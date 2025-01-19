package main.models;

import main.enums.LootRarity;
import main.interfaces.Loot;

public class EpicLoot implements Loot {

    String name;

    public EpicLoot(String name) {
        this.name = name;
    }

    public String getLootName(){
        return name;
    }
    public LootRarity getRarity(){
        return LootRarity.epic;
    }
}
