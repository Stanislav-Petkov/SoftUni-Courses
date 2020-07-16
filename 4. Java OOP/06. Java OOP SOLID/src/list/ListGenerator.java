package list;

import java.util.ArrayList;
import java.util.LinkedList;

public class ListGenerator {
    public ArrayList<String> generateList() {
        var list = new ArrayList<String>();
        list.add("Alice");
        list.add("Bob");
        return list;
    }

    public LinkedList<String> generateLinkedList() {
        var list = new LinkedList<String>();
        list.add("Linked Alice");
        list.add(" Linked Bob");
        return list;
    }
}
