package inheritance;

public class Person {
    String name;

    Person() {
        this("Alice");
    }

    Person(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Person p = new Person("Bob");
        System.out.println(p.name);
        Person pp = new Person();
        System.out.println(pp.name);
    }
}
