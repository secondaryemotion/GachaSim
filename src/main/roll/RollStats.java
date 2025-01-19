package main.roll;

import java.io.Serializable;

public class RollStats implements Serializable {
    private int rollCounter = 0;
    private int basicLootCounter = 0;
    private int epicLootCounter = 0;
    private int legendaryLootCounter = 0;


    public int getRollCounter() {
        return rollCounter;
    }

    public void addToRollCounter() {
        rollCounter++;
    }

    public int getBasicLootCounter() {
        return basicLootCounter;
    }

    public void addToBasicLootCounter() {
        basicLootCounter++;
    }

    public int getEpicLootCounter() {
        return epicLootCounter;
    }

    public void addToEpicLootCounter() {
        epicLootCounter++;
    }

    public int getLegendaryLootCounter() {
        return legendaryLootCounter;
    }

    public void addToLegendaryLootCounter() {
        legendaryLootCounter++;
    }

    @Override
    public String toString(){
        String stats = "%d pulls made \n %d basic loots \n %d epic loots \n %d legendary loots";
        return String.format(stats,getRollCounter(),getBasicLootCounter(),
                getEpicLootCounter(),getLegendaryLootCounter());
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof RollStats)) {
            return false;
        }
        RollStats rs = (RollStats) o;
        return rs.basicLootCounter == this.basicLootCounter &&
                rs.epicLootCounter == this.epicLootCounter &&
                rs.legendaryLootCounter == this.legendaryLootCounter &&
                rs.rollCounter == this.rollCounter;
    }

    }
