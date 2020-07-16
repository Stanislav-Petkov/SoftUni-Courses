import java.util.Comparator;

public class BookComparator implements Comparator<Book> {

    @Override
    public int compare(Book first, Book second) {
        int titlesEquality = first.getTitle().compareTo(second.getTitle());
        if (titlesEquality != 0) {
            return titlesEquality;
        }
        return Integer.compare(first.getYear(), second.getYear());
    }
}
