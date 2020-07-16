import java.lang.reflect.Method;
import java.util.Arrays;

public class MainOld {

    public static void main(String[] args) {
        Class<Reflection> clazz = Reflection.class;
        Method[] methods = clazz.getDeclaredMethods();
        Arrays.stream(methods)
                .filter(a -> a.getName().startsWith("get"))
                .sorted((a, b) -> a.getName().compareTo(b.getName()))
                .forEach(e -> System.out.println(e.getName() + " will return class " + e.getReturnType().getSimpleName()));
    }
}
