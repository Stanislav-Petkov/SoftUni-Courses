package UsecaseAnnotation.Access;

import java.lang.reflect.Modifier;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Class<AccessableClass> clazz = AccessableClass.class;
        Arrays.stream(clazz.getDeclaredMethods())
                .filter(method -> Modifier.isPublic(method.getModifiers()))
                .filter(method -> method.getDeclaredAnnotation(Access.class) == null)
                .findAny()
        .ifPresent((method) -> {
             throw new RuntimeException("All public methods must be annotaded wi");
        });
    }
}
