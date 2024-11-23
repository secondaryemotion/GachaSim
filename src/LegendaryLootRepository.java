public class LegendaryLootRepository implements LootRepository {

    String[] firstNamesLegendary = {"Super","Mega","Legendary"};
    String[] secondNamesLegendary = {"Plasma TV","Terrifier 3000"};



    public LegendaryLoot getRandomLoot(){
        int firstNameIndex = (int) (Math.random()* firstNamesLegendary.length);
        int secondNameIndex = (int) (Math.random()* secondNamesLegendary.length);
        String name = firstNamesLegendary[firstNameIndex] + " " + secondNamesLegendary[secondNameIndex];
        return new LegendaryLoot(name);
    }


}
