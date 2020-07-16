package GenericBoxInteger;

public class GenericBox<T> {
    T element;

    public GenericBox(T element) {
        this.element = element;
    }

    @Override
    public String toString() {
        return element.getClass().getName() + ": " + element;
    }
}
