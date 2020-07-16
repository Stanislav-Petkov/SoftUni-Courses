package AnimalDemo;

import java.util.ArrayList;

public class AnimalList<T extends Cat> {

    ArrayList<T> list;

    public AnimalList() {
        this.list = new ArrayList<>();
    }

    public void add(T animal) {
        this.list.add(animal);
    }

    public void makeAllAnimalsMakeNoise() {
        for (T animal : list) {
            animal.doCatThings();
            animal.makeNoise();
        }
    }
}
