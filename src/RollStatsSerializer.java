import java.io.*;

public class RollStatsSerializer {

    public static void serialize(RollStatsTracker tracker, String path) throws IOException {
        File file = new File(path);
        file.mkdir();
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(tracker);
        objectOutputStream.flush();
        objectOutputStream.close();
    }

    public static RollStatsTracker deserialize(String path) throws IOException, ClassNotFoundException {

        File file = new File(path);
        file.mkdir();
        FileInputStream fileInputStream = new FileInputStream(file);
        if (file.length() == 0) {
            return new RollStatsTracker();
        } else {
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            RollStatsTracker tracker = (RollStatsTracker) objectInputStream.readObject();
            objectInputStream.close();
            return tracker;
        }
    }




}
