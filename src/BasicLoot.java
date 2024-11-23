public class BasicLoot implements Loot {
    String[] firstNames = {"Basic","Boring","Dumb"};
    String[] secondNames = {"Paperwork","Laundry"};
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
