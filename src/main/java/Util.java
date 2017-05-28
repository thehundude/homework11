import com.fasterxml.jackson.databind.ObjectMapper;
import json.Youtube;
import org.json.JSONObject;
import org.json.XML;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Util {
    public static void printYoutubeJSON(String path) throws IOException {
        byte [] jsonData = Files.readAllBytes(Paths.get(path));
        ObjectMapper objectMapper = new ObjectMapper();

        Youtube youtube = objectMapper.readValue(jsonData, Youtube.class);
        System.out.println(objectMapper.writeValueAsString(youtube));
    }

    public static void convertYoutubeJSONToXML(String path, String target) throws IOException {
        byte [] jsonData = Files.readAllBytes(Paths.get(path));
        ObjectMapper objectMapper = new ObjectMapper();

        Youtube youtube = objectMapper.readValue(jsonData, Youtube.class);

        JSONObject json = new JSONObject(youtube);
        String xml = XML.toString(json);

        FileWriter file = new FileWriter(target);
        BufferedWriter buffer = new BufferedWriter(file);
        buffer.write(xml);
        buffer.close();
    }
}
