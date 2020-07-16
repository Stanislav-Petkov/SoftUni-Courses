package GenericCountMethodDoubles6;

public class Box<T extends Comparable<T>> implements Comparable<Box<T>> {
    T value;

    public Box(T element) {
        this.value = element;
    }

    @Override
    public String toString() {
        return value.getClass().getName() + ": " + value;
    }

    public T getValue(Box<T> element) {
        return value;
    }

    @Override
    public int compareTo(Box<T> other) {
        return this.value.compareTo(other.value);
    }
}
