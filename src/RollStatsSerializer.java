import java.io.*;

public class RollStatsSerializer {

    public static void serialize(RollStats stats, String path) throws IOException {
        File file = new File(path);
        file.mkdir();
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(stats);
        objectOutputStream.flush();
        objectOutputStream.close();
    }

    public static RollStats deserialize(String path) throws IOException, ClassNotFoundException {

        File file = new File(path);
        file.mkdir();
        FileInputStream fileInputStream = new FileInputStream(file);
        if (file.length() == 0) {
            return new RollStats();
        } else {
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            RollStats stats = (RollStats) objectInputStream.readObject();
            objectInputStream.close();
            return stats;
        }
    }




}
