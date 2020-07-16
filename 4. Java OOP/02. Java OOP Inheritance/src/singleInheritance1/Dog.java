package singleInheritance1;

public class Dog extends Mammal {

    public String name = "Dog name";

    void bark() {
        System.out.println("barking...");
    }

    @Override
    public void eat() {
        super.eat();
    }

    public void printDogName() {
        String name = "Asd";
        System.out.println(name);
        System.out.println(this.name);
    }

    public void printSuperName() {
        System.out.println(super.name);
    }
}
