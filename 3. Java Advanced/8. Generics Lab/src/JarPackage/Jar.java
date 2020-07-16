package JarPackage;

import java.util.ArrayDeque;

public class Jar<E> {

    private E element;
    ArrayDeque<E> stack = new ArrayDeque<>();

    public void add(E element) {
        this.element = element;
        stack.addLast(element);
    }

    public E remove() {
        return stack.removeFirst();
    }
}
