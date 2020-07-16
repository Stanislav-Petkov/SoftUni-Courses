package printableLists;

import java.util.ArrayList;

public class PrintableList<T> extends ArrayList<T> {
    public void printAll() {
        for (int i = 0; i < this.size(); i++) {
            System.out.println(this.get(i));
        }
    }

    void foo() {
        System.out.println("I am fooo");
    }
}
