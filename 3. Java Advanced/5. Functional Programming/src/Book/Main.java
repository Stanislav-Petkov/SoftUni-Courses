package Book;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Title", 1887);
        Book book2 = new Book("Title", 1889);
        Iterator<Integer> iterator = new Iterator<Integer>() {
            @Override
            public boolean hasNext() {
                return false;
            }

            @Override
            public Integer next() {
                return null;
            }
        };
        Comparator<Book> bookComparator = (o1, o2) -> {
            if (book1.title.compareTo(book2.title) == 0) {
                return Integer.compare(book1.year, book2.year);
            }
            return o1.title.compareTo(o2.title);
        };
        List<Book> stringList = new ArrayList<>();
        stringList.sort(bookComparator);
        int result = bookComparator.compare(book1, book2);
        System.out.println(result);
    }
}

