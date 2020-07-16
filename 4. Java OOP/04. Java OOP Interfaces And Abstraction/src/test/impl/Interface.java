package test.impl;

public interface Interface {
    public abstract Double calculateSomething();

    default String sayHello() {
        return "Hello";
    }
}
