package AnimalDemo;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();

        AnimalList<Cat> list = new AnimalList();

        list.add(new Cat());
        list.add(new Cat());
        list.makeAllAnimalsMakeNoise();
    }
}
