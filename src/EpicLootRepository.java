public class EpicLootRepository implements LootRepository {



    String[] firstNamesEpic = {"Epic","Pretty","Impressive"};
    String[] secondNamesEpic = {"Album","Dog"};




    public EpicLoot getRandomLoot(){
        int firstNameIndex = (int) (Math.random()* firstNamesEpic.length);
        int secondNameIndex = (int) (Math.random()* secondNamesEpic.length);

        String name = firstNamesEpic[firstNameIndex] + " " + secondNamesEpic[secondNameIndex];

        return new EpicLoot(name);
    }


    }


