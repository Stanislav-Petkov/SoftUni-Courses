package reflection;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException {
        Class<Foo> reflectionFoo = Foo.class;
        Class<?> getDynamicFoo = Class.forName("reflection.Foo");
        System.out.println(reflectionFoo);
        System.out.println(getDynamicFoo);
    }
}
