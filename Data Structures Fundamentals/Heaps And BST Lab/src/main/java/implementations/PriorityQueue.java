package implementations;

import interfaces.AbstractQueue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PriorityQueue<E extends Comparable<E>> implements AbstractQueue<E> {

    private List<E> elements;

    public PriorityQueue() {
        this.elements = new ArrayList<>();
    }

    @Override
    public int size() {
        return this.elements.size();
    }

    @Override
    public void add(E element) {
        this.elements.add(element);
        this.heapifyUp(this.size() - 1);
    }

    private void heapifyUp(int index) {

        while (index > 0 && isLess(getParentIndex(index), index)) {
            Collections.swap(this.elements, getParentIndex(index), index);
            index = getParentIndex(index);
        }
    }

    private boolean isLess(int first, int second) {
        return getAt(first).compareTo(getAt(second)) < 0;
    }

    private E getAt(int index) {
        return this.elements.get(index);
    }

    private int getParentIndex(int index) {
        return (index - 1) / 2;
    }

    private void ensureNonEmpty() {
        if (this.size() == 0) {
            throw new IllegalStateException("Heap is empty upon peek/poll attempt");
        }
    }

    @Override
    public E peek() {
        ensureNonEmpty();
        return this.getAt(0);
    }

    @Override
    public E poll() {
        ensureNonEmpty();
        E returnedValue = getAt(0);//kopira purviq
        Collections.swap(this.elements, 0, this.size() - 1); //razmenq purviq i posledni
        this.elements.remove(this.size() - 1);//trie posledniq
        this.heapifyDown(0);
        return returnedValue;

    }

    private int getLeftChildIndex(int index) {
        return (2 * index) + 1;
    }

    private int getRightChildIndex(int index) {
        return (2 * index) + 2;
    }

    private E getLeftChild(int index) {
        return this.elements.get(this.getLeftChildIndex(index));
    }

    private E gerRightChild(int index) {
        return this.elements.get(this.getRightChildIndex(index));
    }

    private void heapifyDown(int index) {
        while (getLeftChildIndex(index) < this.size() && isLess(index, getLeftChildIndex(index))) {
            int child = getLeftChildIndex(index);
            int rightChildIndex = getRightChildIndex(index);
            if (rightChildIndex < this.size() && isLess(child, rightChildIndex)) {
                child = rightChildIndex;
            }
            Collections.swap(this.elements, index, child);
            index = child;
        }
    }
}
