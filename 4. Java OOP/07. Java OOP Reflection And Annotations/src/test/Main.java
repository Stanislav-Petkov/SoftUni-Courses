package test;

import java.lang.reflect.Array;
import java.lang.reflect.Modifier;
import java.util.ArrayDeque;

public class Main {

    public static void main(String[] args) {
        Class<Reflection> clazz = Reflection.class;
        int[] intArr = (int[]) Array.newInstance(int.class,3);
        Array.set(intArr,0,7);
        Array.set(intArr,1,3);
        System.out.println(intArr[0]);
        int modPrivate = clazz.getModifiers();
        System.out.println(modPrivate);
        System.out.println(Modifier.isPrivate(modPrivate));

        int modProtected = clazz.getModifiers();
        System.out.println(modProtected);
        System.out.println(Modifier.isProtected(modProtected));

        int modPublic = clazz.getModifiers();
        System.out.println(modPublic);
        System.out.println(Modifier.isPublic(modPublic));

        System.out.println(Modifier.isProtected(clazz.getModifiers()));
        System.out.println(Modifier.isPublic(clazz.getModifiers()));
    }
}













