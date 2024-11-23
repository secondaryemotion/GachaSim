public class LegendaryLoot implements Loot {

    String name;

    public LegendaryLoot(String name) {
        this.name = name;
    }

    public String getLootName(){
        return name;
    }
}
