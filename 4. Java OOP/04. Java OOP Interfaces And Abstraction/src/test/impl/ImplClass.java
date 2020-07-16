package test.impl;

public class ImplClass implements Interface {

    @Override
    public Double calculateSomething() {
        return null;
    }

    public static void main(String[] args) {
        ImplClass implClass = new ImplClass();
        implClass.sayHello();
    }
}
