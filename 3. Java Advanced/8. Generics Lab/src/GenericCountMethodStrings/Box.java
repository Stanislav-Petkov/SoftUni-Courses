package GenericCountMethodStrings;

public class Box<T extends Comparable<T>> implements Comparable<Box<T>> {
    T value;

    public Box(T value) {
        this.value = value;
    }

    @Override
    public int compareTo(Box<T> other) {//sravnqva valueto s koet e inicializiral obekta s drugiq obekt
        return this.value.compareTo(other.value);
    }

    public T getValue() {
        return value;
    }
}












