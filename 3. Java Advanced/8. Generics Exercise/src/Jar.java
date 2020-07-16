
public class Jar<E> implements Jarrable<E> {
    private E element;
    private Deque<E> jarStack = new ArrayDeque<>();

    @Override
    public void add(E element) {
        this.addElement(element);
    }

    public void addElement(E element) {
        this.jarStack.add(element);
    }

    @Override
    public E remove() {
        return jarStack.remove();
    }
}
