package quotes;

import java.util.ArrayList;

public class Qoutes {

    String author;
    String text;
    ArrayList<String> tags = new ArrayList<>();



    public Qoutes(String author, String text, ArrayList<String> tags) {
        this.author = author;
        this.text = text;
        this.tags = tags;
    }

    public ArrayList<String> getTags() {
        return tags;
    }



    @Override
    public String toString() {
        return "Qoute{" +
                "author='" + author + '\'' +
                ", text='" + text + '\'' +
                ", tags=" + tags +
                '}';
    }
}
