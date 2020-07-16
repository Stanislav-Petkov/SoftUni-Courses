import java.util.Comparator;

public class DescendingBookComparator implements Comparator<Book> {

    @Override
    public int compare(Book first, Book second) {
        if (first.getAutors().size() == second.getAutors().size()) {
            return 0;
        } else if (first.getAutors().size() > second.getAutors().size()) {
            return -1;
        } else {
            return 1;
        }
    }
}
