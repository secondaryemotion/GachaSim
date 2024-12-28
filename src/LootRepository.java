import java.io.IOException;

public interface LootRepository {

    Loot getRandomLoot() throws IOException;
}
