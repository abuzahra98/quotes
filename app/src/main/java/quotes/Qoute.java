package quotes;

import java.util.ArrayList;

public class Qoute {
    String quoteAuthor;
    String quoteText;
    String senderName;
    String senderLink;
    String quoteLink;

//    ArrayList<String> tags;

//    {
//        "quoteText": "The secret of success is constancy to purpose.",
//            "quoteAuthor": "Benjamin Disraeli ",
//            "senderName": "",
//            "senderLink": "",
//            "quoteLink": "http://forismatic.com/en/18e3ab0e47/"
//    }

    public Qoute(String quoteAuthor, String quoteText, String quoteLink, String senderName , String senderLink) {
        this.quoteAuthor = quoteAuthor;
        this.quoteText = quoteText;
        this.senderLink = senderLink;
        this.senderName = senderName;
        this.quoteLink = quoteLink;
    }

//    public ArrayList<String> getTags() {
//        return tags;
//    }




    @Override
    public String toString() {
        return "Qoute{" +
                "quoteAuthor='" + quoteAuthor + '\'' +
                ", quoteText='" + quoteText + '\'' +
                ", senderLink='" + senderLink + '\'' +
                ", senderName='" + senderName + '\'' +
                ", quoteLink='" + quoteLink + '\'' +

                '}';
    }

}
