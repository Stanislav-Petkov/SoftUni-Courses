@Deprecated(since = "42", forRemoval = false)
public class Reflection {
    public static void main(String[] args) {
        Class<Reflection> reflectionClass = Reflection.class;
        Deprecated annotation = reflectionClass.getAnnotation(Deprecated.class);
        boolean b = annotation.forRemoval();
        String since = annotation.since();
        System.out.println();
    }
}

