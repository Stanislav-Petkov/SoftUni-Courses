package ListIterator;

import java.util.Arrays;
import java.util.List;

public class ListIteratorTest {
    private List<String> strings;
    private int index;

    public ListIteratorTest(String... tokens) {
        this.strings = Arrays.asList(tokens);
        this.index = 0;
    }

    public boolean move() {
        if (hasNext()) {
            index = index + 1;
            return this.index < this.strings.size();
        }
        return false;
    }

    public boolean hasNext() {
        return this.index < this.strings.size() - 1;
    }

    public void print() {
        if (this.strings.size() == 0) {
            throw new UnsupportedOperationException("Invalid Operation!");
        }
        System.out.println(this.strings.get(index));
    }
}
