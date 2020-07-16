package animalDemo;

import java.util.ArrayList;

public class AnimalList<T> {
    ArrayList<T> list;

    public AnimalList() {
        this.list = new ArrayList<>();
    }

    public void add(T animal) {
        this.list.add(animal);
    }

}












