package zad1;


import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Main {

    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<Reflection> clazz = Reflection.class;
        System.out.println(clazz);

        Class<? super Reflection> superClazz = clazz.getSuperclass();
        System.out.println(superClazz);

        Class<?>[] interfaces = clazz.getInterfaces();
        for (Class<?> anInterface : interfaces) {
            System.out.println(anInterface);
        }

        Constructor<Reflection> ctor = clazz.getDeclaredConstructor();
        ctor.setAccessible(true);
        Reflection x = ctor.newInstance();
        System.out.println(x);
    }
}
