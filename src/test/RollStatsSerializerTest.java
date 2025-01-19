package test;

import main.enums.LootRarity;
import main.interfaces.Loot;
import main.roll.RollSettings;
import main.roll.RollStats;
import main.roll.RollStatsSerializer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.IOException;

public class RollStatsSerializerTest {

    public static RollStats rollStats;

    @BeforeAll
    public static void createStats(){
        rollStats = new RollStats();
    }

    @Test
    @DisplayName("Get the same stats after serialization and deserialization")
    void serialize_deserialize() throws IOException, ClassNotFoundException {
        // arrange
        String rollStatsFilePath = "src/test/resources/roll_stats_test.txt";
        // act
        RollStatsSerializer.serialize(rollStats,rollStatsFilePath);
        // assert
        Assertions.assertEquals(rollStats, RollStatsSerializer.deserialize(rollStatsFilePath));
    }
}
