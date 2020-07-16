package zooMain;

import zooMain.zoo.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Animal> animals = new ArrayList<>();

        animals.add(new Snake("Python"));
        animals.add(new Lizard("Gangald"));
        animals.add(new Gorilla("King kong"));
        animals.add(new Bear("meco puk"));

        for (Animal animal : animals) {
            animal.feedAnimal();
        }
    }
}
