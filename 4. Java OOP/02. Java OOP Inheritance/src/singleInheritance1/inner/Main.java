package singleInheritance1.inner;

import singleInheritance1.Animal;
import singleInheritance1.Dog;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();

        Animal animal = new Animal();
        animal.eat();
    }
}
