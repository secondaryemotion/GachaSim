package main.models;

import main.enums.LootRarity;
import main.interfaces.Loot;

public class BasicLoot implements Loot {

    String name;

    public BasicLoot(String name) {
        this.name = name;
    }

    public String getLootName(){
        return name;
    }

    public LootRarity getRarity(){
        return LootRarity.basic;
    }
}
