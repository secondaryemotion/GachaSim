public class EpicLoot implements Loot {

    String name;

    public EpicLoot(String name) {
        this.name = name;
    }

    public String getLootName(){
        return name;
    }
}
