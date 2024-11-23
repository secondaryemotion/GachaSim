public class GachaSimulator {
    RollGenerator roller = new RollGenerator();
    int rollCounter = 0;

    public String pull(){
        rollCounter++;
        return roller.roll();
    }
    public int[] getStats(){
        int[] stats = {roller.BasicLootCounter,roller.EpicLootCounter,roller.LegendaryLootCounter};
        return stats;
    }
}
