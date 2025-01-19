package main.roll;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.*;


public class RollStatsSerializer {

    public static void serialize(RollStats stats, String path) throws IOException {
        File file = new File(path);
        file.mkdir();
        StringWriter writer = new StringWriter();
        ObjectMapper mapper = new ObjectMapper();
        mapper.writeValue(writer,stats);
        FileWriter fileWriter = new FileWriter(file);
        fileWriter.write(writer.toString());
        fileWriter.flush();
        fileWriter.close();
    }

    public static RollStats deserialize(String path) throws IOException, ClassNotFoundException {

        File file = new File(path);
        file.mkdir();
        FileReader fileReader = new FileReader(file);
        if (file.length() == 0) {
            return new RollStats();
        } else {
            ObjectMapper mapper = new ObjectMapper();
            RollStats stats = mapper.readValue(fileReader, RollStats.class);
            fileReader.close();
            return stats;
        }
    }




}
