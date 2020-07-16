package Book;

import java.util.Comparator;

public class BookComparator implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        if (0 == o1.title.compareTo(o2.title)) {
            return Integer.compare(o1.year, o2.year);
        }
        return o1.title.compareTo(o2.title);
    }
}
