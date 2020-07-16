package SwapMethodStrings3;

public class Box<T> {
    T element;

    public Box(T element) {
        this.element = element;
    }

    @Override
    public String toString() {
        return element.getClass().getName() + ": " + element;
    }
}
