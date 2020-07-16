package printableLists;

import java.util.ArrayList;

public class DelegationPrintableList<T> {
    private ArrayList<T> container;

    DelegationPrintableList() {
        this.container = new ArrayList<>();
    }

    public void add(T t) {
        this.container.add(t);
    }

    public void printAll() {
        for (int i = 0; i < this.container.size(); i++) {
            System.out.println(this.container.get(i));
        }
    }
}
