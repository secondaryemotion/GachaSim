public class BasicLoot implements Loot {

    String name;

    public BasicLoot(String name) {
        this.name = name;
    }

    public String getLootName(){
        return name;
    }
}
