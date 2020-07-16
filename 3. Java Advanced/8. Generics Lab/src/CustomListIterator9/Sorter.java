package CustomListIterator9;

public class Sorter<E extends Comparable<E>> {
    public void sort(ArrayList<E> elements) {
        for (int i = 0; i < elements.size(); i++) {
            E element = elements.get(i);
            for (int j = 0; j < elements.size(); j++) {
                if (element.compareTo(elements.get(j)) < 0) {
                    elements.swap(i, j);
                }
            }
        }
    }
}
