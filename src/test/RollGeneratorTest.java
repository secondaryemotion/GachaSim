package test;

import main.enums.LootRarity;
import main.interfaces.Loot;
import main.roll.RollGenerator;
import main.roll.RollSettings;
import main.roll.RollStats;
import org.junit.jupiter.api.*;

import java.io.IOException;

import static org.junit.Assert.assertEquals;


class RollGeneratorTest {

    public static RollGenerator rollGenerator;
    public static RollStats rollStats;

    @BeforeAll
    public static void createGenerator(){
        rollGenerator = new RollGenerator(new BasicLootRepositoryStub(),new EpicLootRepositoryStub(), new LegendaryLootRepositoryStub());
    }

    @BeforeEach
    public void createStats(){
        rollStats = new RollStats();
    }

    @Test
    @DisplayName("Get Legendary when legendary roll count")
    void roll_legendaryRoll_legendary() throws IOException {
        // arrange
        int legendaryRoll = RollSettings.getLegendaryProbabilityPercent();
        // act
        Loot loot = rollGenerator.roll(rollStats,legendaryRoll);
        // assert
        Assertions.assertEquals(LootRarity.legendary, loot.getRarity());
    }

    @Test
    @DisplayName("Get Epic when epic roll count")
    void roll_epicRoll_epic() throws IOException {
        // arrange
        int epicRoll = RollSettings.getEpicProbabilityPercent();
        // act
        Loot loot = rollGenerator.roll(rollStats,epicRoll);
        // assert
        Assertions.assertEquals(LootRarity.epic, loot.getRarity());
    }

    @Test
    @DisplayName("Get Basic when basic roll count")
    void roll_basicRoll_basic() throws IOException {
        // arrange
        int basicRoll = RollSettings.getEpicProbabilityPercent()+1;
        // act
        Loot loot = rollGenerator.roll(rollStats,basicRoll);
        // assert
        Assertions.assertEquals(LootRarity.basic, loot.getRarity());
    }
}
