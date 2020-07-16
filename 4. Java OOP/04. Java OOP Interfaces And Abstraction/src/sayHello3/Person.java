package sayHello3;

public interface Person {
    String getName();

    default String sayHello() {
        return "Hello";
    }
}
