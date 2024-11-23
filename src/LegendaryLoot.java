public class LegendaryLoot implements Loot {
    String[] firstNames = {"Super","Mega","Legendary"};
    String[] secondNames = {"Plasma TV","Terrifier 3000"};
    String name;


    public void generateLootName(){
        int firstNameIndex = (int) (Math.random()*firstNames.length);
        int secondNameIndex = (int) (Math.random()*secondNames.length);
        this.name = firstNames[firstNameIndex] + " " + secondNames[secondNameIndex];
    }

    public String getLootName(){
        generateLootName();
        return this.name;
    }
}
