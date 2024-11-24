public class RollSettings {
    private static int legendaryProbabilityPercent = 5;
    private static int epicProbabilityPercent = 20;

    public static int getLegendaryProbabilityPercent() {
        return legendaryProbabilityPercent;
    }

    public static int getEpicProbabilityPercent() {
        return epicProbabilityPercent+ legendaryProbabilityPercent;
    }
}
