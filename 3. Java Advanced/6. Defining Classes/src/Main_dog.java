import java.util.Scanner;

public class Main_dog {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Dog dog = new Dog(5);
        System.out.println(dog.name);
        System.out.println(dog.breed);
        System.out.println(dog.weightKG);
    }
}
