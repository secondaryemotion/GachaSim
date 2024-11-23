public class BasicLootRepository implements LootRepository {

    String[] firstNamesBasic = {"Basic","Boring","Dumb"};
    String[] secondNamesBasic = {"Paperwork","Laundry"};


    public BasicLoot getRandomLoot(){

        int firstNameIndex = (int) (Math.random()* firstNamesBasic.length);
        int secondNameIndex = (int) (Math.random()* secondNamesBasic.length);

        String name = firstNamesBasic[firstNameIndex] + " " + secondNamesBasic[secondNameIndex];

        return new BasicLoot(name);
    }

}
