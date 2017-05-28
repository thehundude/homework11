import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        // Util.printYoutubeJSON("C:\\Users\\tamas\\IdeaProjects\\homework11\\src\\main\\java\\json\\youtube.json");
        Util.convertYoutubeJSONToXML("C:\\Users\\tamas\\IdeaProjects\\homework11\\src\\main\\java\\json\\youtube.json",
                "C:\\Users\\tamas\\IdeaProjects\\homework11\\homework11.xml");
    }
}
