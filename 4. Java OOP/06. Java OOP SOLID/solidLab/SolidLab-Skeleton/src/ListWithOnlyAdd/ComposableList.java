package ListWithOnlyAdd;

import java.util.List;

public class ComposableList<T> implements ListWithOnlyAdd<T> {
    private List<T> list;

    ComposableList(List<T> list) {
        this.list = list;
    }

    @Override
    public void add(T element) {
        list.add(element);
    }
}
