package implementations;

import interfaces.Heap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MaxHeap<E extends Comparable<E>> implements Heap<E> {

    private List<E> elements;

    public MaxHeap() {
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

    private boolean isLess(int parentIndex, int childIndex) {
        return getAt(parentIndex).compareTo(getAt(childIndex)) < 0;
    }

    private E getAt(int index) {
        return this.elements.get(index);
    }

    private int getParentIndex(int index) {
        return (index - 1) / 2;
    }

    @Override
    public E peek() {
        if (this.size() == 0) {
            throw new IllegalStateException("Heap is empty upon peek attempt");
        }
        return getAt(0);
    }
}













/*
package implementations;

import interfaces.Heap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MaxHeap<E extends Comparable<E>> implements Heap<E> {
//trqbva aduljitelno elementite koito dobavqme da budat sravnimi po nqkakuv nachin

    private List<E> elements;

    public MaxHeap() {
        this.elements = new ArrayList<>();
    }

    @Override
    public int size() {
        return this.elements.size();
    }

    @Override
    public void add(E element) {
        this.elements.add(element); // dobavq na kraq na lista
        this.heapifyUp(this.size() - 1); // trugva ot posledni indeks
    }

    private void heapifyUp(int index) {
        //dokato  indeksa ne e stanal parent
        //ako indeksa stane 0 znachi e stanal parent
        //int parentIndex = getParentIndex(index);
        while (index > 0 && isLess(getParentIndex(index), index)){
            Collections.swap(this.elements,getParentIndex(index),index);//v elementite razmenqm indexa s parentIndex
            index = getParentIndex(index); //indexa ot koito produljavam e parentIndexa
        }
    }

    private boolean isLess( int parentIndex,int childIndex) {
        return getAt(parentIndex).compareTo(getAt(childIndex)) < 0;
        //parent shte bude po maluk dokato tova vrushta polojitelna stoinost
        //ako child e po golqm ot parent poluchavam otricatelna stoinost

    }

    private E getAt(int index){
        return this.elements.get(index);
    }
    private int getParentIndex(int index) {
        return (index - 1) / 2;
    }

    @Override
    public E peek() {
        if(this.size() == 0){
            throw new IllegalStateException("Heap is empty upon peek attempt");
        }
        return getAt(0);
    }
}


 */
