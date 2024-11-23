public class LootRepository {

    String[] firstNamesBasic = {"Basic","Boring","Dumb"};
    String[] secondNamesBasic = {"Paperwork","Laundry"};

    String[] firstNamesEpic = {"Epic","Pretty","Impressive"};
    String[] secondNamesEpic = {"Album","Dog"};

    String[] firstNamesLegendary = {"Super","Mega","Legendary"};
    String[] secondNamesLegendary = {"Plasma TV","Terrifier 3000"};



    public LegendaryLoot getRandomLegendaryLoot(){
        int firstNameIndex = (int) (Math.random()* firstNamesLegendary.length);
        int secondNameIndex = (int) (Math.random()* secondNamesLegendary.length);
        String name = firstNamesLegendary[firstNameIndex] + " " + secondNamesLegendary[secondNameIndex];
        return new LegendaryLoot(name);
    }

    public EpicLoot getRandomEpicLoot(){
        int firstNameIndex = (int) (Math.random()* firstNamesEpic.length);
        int secondNameIndex = (int) (Math.random()* secondNamesEpic.length);

        String name = firstNamesEpic[firstNameIndex] + " " + secondNamesEpic[secondNameIndex];

        return new EpicLoot(name);
    }

    public BasicLoot getRandomBasicLoot(){

        int firstNameIndex = (int) (Math.random()* firstNamesBasic.length);
        int secondNameIndex = (int) (Math.random()* secondNamesBasic.length);

        String name = firstNamesBasic[firstNameIndex] + " " + secondNamesBasic[secondNameIndex];

        return new BasicLoot(name);
    }

}
