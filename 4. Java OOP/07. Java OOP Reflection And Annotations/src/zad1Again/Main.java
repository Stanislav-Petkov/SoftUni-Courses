package zad1Again;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException,
            InvocationTargetException, InstantiationException {
        Class<Reflection> clazz = Reflection.class;
        System.out.println(clazz);
        Class<? super Reflection> superClazz = clazz.getSuperclass();
        System.out.println(superClazz);
        Class<?>[] interfaces = clazz.getInterfaces();
        for (Class<?> iface : interfaces) {
            System.out.println(iface);
        }

        Constructor<?>[] ctors = clazz.getDeclaredConstructors();
        for (Constructor<?> ctor : ctors) {
            System.out.println(ctor);
        }

        Constructor<?> ctor = clazz.getDeclaredConstructor();
        System.out.println(ctor.newInstance());

        Constructor<?> ctor1 = clazz.getDeclaredConstructor(String.class, String.class, String.class);
        System.out.println(ctor1.newInstance("Foo", "Bar", "Zar"));

        //compile time safety
        Constructor<Reflection> ctor2 = clazz.getDeclaredConstructor();
        Reflection reflection = ctor2.newInstance();
        System.out.println(reflection);

        Constructor<?> ctor3 = clazz.getDeclaredConstructor();
        Reflection reflection2 = ctor2.newInstance();
        System.out.println(reflection);
    }
}















