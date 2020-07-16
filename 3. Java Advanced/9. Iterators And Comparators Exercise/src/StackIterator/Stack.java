package StackIterator;

import java.util.Iterator;
import java.util.function.Consumer;

public class Stack<E> implements Iterable<E> {

    private Node<E> top;

    static class Node<E> {
        E element;
        Node<E> prev;

        public Node(E element) {
            this.element = element;
        }
    }

    Stack() {
    }

    public void push(E element) {
        Node<E> newNode = new Node<>(element);
        newNode.prev = this.top;
        this.top = newNode;
    }

    public E pop() {
        if (this.top == null) {
            throw new IndexOutOfBoundsException("No elements.");
        }
        E element = this.top.element;
        Node<E> prev = this.top.prev;
        this.top.prev = null;
        this.top = prev;
        return element;
    }

    @Override
    public Iterator<E> iterator() {
        return new StackIterator<E>(this.top);
    }

    @Override
    public void forEach(Consumer<? super E> action) {
        Iterator<E> iterator = this.iterator();
        while (iterator.hasNext()) {
            action.accept(iterator.next());
        }
    }

    public static class StackIterator<E> implements Iterator<E> {
        private Node<E> current;

        StackIterator(Node<E> current) {
            this.current = current;
        }

        @Override
        public boolean hasNext() {
            return this.current != null;
        }

        @Override
        public E next() {
            E element = this.current.element;
            this.current = this.current.prev;
            return element;
        }
    }
}
