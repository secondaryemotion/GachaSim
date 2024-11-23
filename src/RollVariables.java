public class RollVariables {
    private static double legendaryProbability = 0.05;
    private static double epicProbability = 0.2;

    public static int getLegendaryProbability() {
        return (int) (legendaryProbability*100);
    }

    public static int getEpicProbability() {
        return (int) (epicProbability*100+legendaryProbability*100);
    }
}
