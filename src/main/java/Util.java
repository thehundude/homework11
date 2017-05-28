import com.fasterxml.jackson.databind.ObjectMapper;
import json.Youtube;

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
}
