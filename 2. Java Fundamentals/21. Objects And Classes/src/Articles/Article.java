package Articles;

public class Article {
    private String title;
    private String content;
    private String author;

    Article(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }

    void Edit(String newContent) {
        this.content = newContent;
    }

    void ChangeAuthor(String newAuthor) {
        this.author = newAuthor;
    }

    void Rename(String newTitle) {
        this.title = newTitle;
    }

    @Override
    public String toString() {
        return String.format("%s - %s: %s", this.title, this.content, this.author);
    }
}
