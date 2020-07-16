package adverti_message;

public class Message {
    private String phrase;
    private String event;
    private String author;
    private String city;

    Message(String phrase, String event, String author, String city) {
        setPhrase(phrase);
        this.event = event;
        this.author = author;
        this.city = city;
    }

    public void setPhrase(String phrase) {
        this.phrase = phrase;

    public String getPhrase() {
        return this.phrase;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s - %s", getPhrase(), event, author, city);//moje i bez getter i setter
    }
}