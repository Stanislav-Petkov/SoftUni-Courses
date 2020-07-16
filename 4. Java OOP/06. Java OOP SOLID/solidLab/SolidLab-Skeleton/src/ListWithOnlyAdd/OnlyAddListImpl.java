package ListWithOnlyAdd;

public class OnlyAddListImpl<T> extends AbstractUnimplementedList<T> {

    private T item;

    @Override
    public boolean add(T t) {
        this.item = t;
        return true;
    }

    @Override
    public String toString() {
        return "OnlyAddListImpl{" +
                "item=" + item +
                '}';
    }
}
