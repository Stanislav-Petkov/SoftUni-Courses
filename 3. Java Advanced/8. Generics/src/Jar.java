import java.util.ArrayDeque;
import java.util.Deque;

public class Jar<T> implements Jarrable<T> {
    private Deque<T> jarStack = new ArrayDeque<>();

    @Override
    public T remove() {
        return jarStack.remove();
    }

    @Override
    public void add(T element) {
        this.addElement(element);
    }

    public void addElement(T element) {
        this.jarStack.add(element);
    }

    public T removePickles() {
        return this.jarStack.remove();
    }
}
