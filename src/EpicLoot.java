public class EpicLoot implements Loot {
    String[] firstNames = {"Epic","Pretty","Impressive"};
    String[] secondNames = {"Album","Dog"};
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
