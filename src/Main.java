public class Main {
    public static void main(String[] args){
        GachaSimulator gacha = new GachaSimulator();
        int pulls = 100;
        for (int i = 0; i < pulls; i++){
            gacha.pull();
        }
        int[] stats = gacha.getStats();
        System.out.println(pulls+" pulls made");
        System.out.println(stats[0]+" basic loots");
        System.out.println(stats[1]+" epic loots");
        System.out.println(stats[2]+" legendary loots");

    }
}
