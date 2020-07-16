package ListWithOnlyAdd;

import java.util.ArrayList;

public interface ListWithOnlyAdd<T> {

    default ComposableList<T> createNewOnlyAddListImpl() {
        return new ComposableList<T>(new ArrayList<>());
    }

    void add(T t);
}
