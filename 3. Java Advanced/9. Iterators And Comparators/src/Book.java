import java.util.ArrayList;
import java.util.List;

public class Book implements Comparable<Book> {
    String title;
    int year;
    private List<String> autors;

    public Book(String title, int year, String... authors) {
        this.setTitle(title);
        this.setYear(year);
        this.setAutors(authors);
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setAutors(String... authors) {
        List<String> newAuthors = new ArrayList<>();
        for (String author : authors) {
            newAuthors.add(author);
        }
        this.autors = newAuthors;
    }

    public List<String> getAutors() {
        return autors;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public int compareTo(Book other) {
        int titlesEquality = this.title.compareTo(other.title);
        if (titlesEquality != 0) {
            return titlesEquality;
        }
        return Integer.compare(this.year, other.year);
    }

    @Override
    public String toString() {
        return String.format("title: %s, year %d", this.title, this.year);
    }
}

