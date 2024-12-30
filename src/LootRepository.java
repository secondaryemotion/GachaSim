import java.io.IOException;
import java.net.URISyntaxException;

public interface LootRepository {

    Loot getRandomLoot() throws IOException;
}
