import java.io.IOException;
import java.io.Serializable;

public class RollStatsTracker implements Serializable {
    private int rollCounter = 0;
    private int basicLootCounter = 0;
    private int epicLootCounter = 0;
    private int legendaryLootCounter = 0;

    public RollStatsTracker() throws IOException, ClassNotFoundException {
        RollStatsTracker deserializedTracker = RollStatsSerializer.deserialize();
        this.rollCounter = deserializedTracker.rollCounter;
        this.basicLootCounter = deserializedTracker.basicLootCounter;
        this.epicLootCounter = deserializedTracker.epicLootCounter;
        this.legendaryLootCounter = deserializedTracker.legendaryLootCounter;
    }

    public RollStatsTracker(int rollCounter){
        this.rollCounter = rollCounter;
    }

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
    public void serialize() throws IOException {
        RollStatsSerializer.serialize(this);
    }

    }
