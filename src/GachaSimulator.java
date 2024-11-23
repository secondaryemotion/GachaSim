public class GachaSimulator {
    RollGenerator roller = new RollGenerator();
    int rollCounter = 0;

    public String pull(){
        rollCounter++;
        return roller.roll();
    }
}
