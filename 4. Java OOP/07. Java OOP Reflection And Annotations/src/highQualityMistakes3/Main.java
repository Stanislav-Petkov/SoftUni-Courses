package highQualityMistakes3;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Class<Reflection> clazz = Reflection.class;
        Field[] fields = clazz.getDeclaredFields();
        Arrays.stream(fields)
                .filter(field -> !Modifier.isPrivate(field.getModifiers()))
                .sorted(Comparator.comparing(Field::getName))
                .forEach(field -> System.out.println(String.format(
                        "%s must be private!", field.getName()
                )));

        Method[] methods = clazz.getDeclaredMethods();

        Arrays.stream(methods)
                .filter(method -> method.getName().startsWith("get"))
                .filter(method -> !Modifier.isPublic(method.getModifiers()))
                .sorted(Comparator.comparing(Method::getName))
                .forEach(method -> System.out.println(
                        String.format("%s have to be public!", method.getName())));

        Arrays.stream(methods)
                .filter(method -> method.getName().startsWith("set"))
                .filter(method -> method.getParameterTypes().length == 1)
                .filter(method -> !Modifier.isPrivate(method.getModifiers()))
                .sorted(Comparator.comparing(Method::getName))
                .forEach(method -> System.out.println(
                        String.format("%s have to be private!",
                                method.getName())
                ));
    }
}

/*
package highQualityMistakes3;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Class<Reflection> clazz = Reflection.class;

        Field[] fields1 = clazz.getDeclaredFields();

        Field[] fields = Arrays.stream(fields1)
                .sorted(Comparator.comparing(Field::getName))
                .toArray(Field[]::new);

        for(Field field : fields){
            int fieldModifier = field.getModifiers();
            if(!Modifier.isPrivate(fieldModifier)){
                System.out.println(field.getName() + " must be private!");
            }
        }

        Method[] methods1 = clazz.getDeclaredMethods();

        Method[] methods = Arrays.stream(methods1)
                .sorted(Comparator.comparing(Method::getName))
                .toArray(Method[]::new);

        for (Method method : methods) {
            int modifier = method.getModifiers();
            if(method.getName().startsWith("get") && !Modifier.isPublic(modifier)){
                System.out.println(method.getName() + " have to be public!");
            }else if(method.getName().startsWith("set") && !Modifier.isPrivate(modifier)){
                System.out.println(method.getName() + " have to be private!");
            }
        }

    }
}

 */