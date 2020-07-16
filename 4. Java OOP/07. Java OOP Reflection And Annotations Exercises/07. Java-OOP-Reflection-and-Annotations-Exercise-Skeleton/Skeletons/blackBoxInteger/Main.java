package blackBoxInteger;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        BlackBoxInt blackBoxInt;
        try {
            Constructor<?> ctor = BlackBoxInt.class.getDeclaredConstructor(int.class);
            ctor.setAccessible(true);
            blackBoxInt = (BlackBoxInt) ctor.newInstance(0);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
            throw new Exception(e);
        }
        Map<String, Method> methodByName =
                Arrays.stream(blackBoxInt.getClass().getDeclaredMethods())
                        .peek(m -> m.setAccessible(true))
                        .collect(Collectors.toMap(m -> m.getName(), m -> m));

        String line = scanner.nextLine();
        while (!line.equals("END")) {
            String[] tokens = line.split("_");
            String command = tokens[0];
            int param = Integer.parseInt(tokens[1]);
            Method method = methodByName.get(command);
            method.invoke(blackBoxInt, param);
            Field innerValue = BlackBoxInt.class.getDeclaredField("innerValue");
            innerValue.setAccessible(true);
            int value = (int) innerValue.get(blackBoxInt);
            System.out.println(value);
            line = scanner.nextLine();
        }
    }
}