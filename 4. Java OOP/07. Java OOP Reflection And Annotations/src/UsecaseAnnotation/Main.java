package UsecaseAnnotation;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Class<Foo> reflectionFoo = Foo.class;
        Arrays.stream(reflectionFoo.getInterfaces())
                .filter(claz -> claz.equals(Bootstrapable.class))
                .findFirst()
                .ifPresent(aClass -> {
                    try {
                       Bootstrapable anInstance = (Bootstrapable) aClass.getDeclaredConstructor().newInstance();
                       anInstance.perform();
                    } catch (InstantiationException e) {
                        e.printStackTrace();
                    } catch (Exception e) {
                       // failed to bootstrap e.printStackTrace();
                    }
                });
    }
}
