public class RollStatsTracker {
    private int rollCounter = 0;
    private int BasicLootCounter = 0;
    private int EpicLootCounter = 0;
    private int LegendaryLootCounter = 0;

    public int getRollCounter() {
        return rollCounter;
    }

    public void addToRollCounter() {
        this.rollCounter++;
    }

    public int getBasicLootCounter() {
        return BasicLootCounter;
    }

    public void addToBasicLootCounter() {
        this.BasicLootCounter++;
    }

    public int getEpicLootCounter() {
        return EpicLootCounter;
    }

    public void addToEpicLootCounter() {
        this.EpicLootCounter++;
    }

    public int getLegendaryLootCounter() {
        return LegendaryLootCounter;
    }

    public void addToLegendaryLootCounter() {
        this.LegendaryLootCounter++;
    }
}
