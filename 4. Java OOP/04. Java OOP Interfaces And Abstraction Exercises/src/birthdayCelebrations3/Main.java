package birthdayCelebrations3;


import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        List<Birthable> birthables = new ArrayList<>();
        while (!line.equals("End")) {
            String[] tokens = line.split("\\s+");
            if (tokens[0].equals("Robot")) {
                line = scanner.nextLine();
                continue;
            }
            try {
                Class<?> clazz = Class.forName(tokens[0]);
                Constructor<?> constructor = clazz.getDeclaredConstructors()[0];
                constructor.setAccessible(true);
                Birthable birthable;
                if (constructor.getParameterCount() == 4) {
                    birthable = (Birthable) constructor.newInstance(tokens[1], Integer.parseInt(tokens[2]),
                            tokens[3], tokens[4]);
                } else {
                    birthable = (Birthable) constructor.newInstance(tokens[1], tokens[2]);
                }
                birthables.add(birthable);
                System.out.println();
            } catch (ClassNotFoundException | IllegalAccessException | InstantiationException |
                    InvocationTargetException e) {
                e.printStackTrace();
            }
            line = scanner.nextLine();
        }
        String year = scanner.nextLine();
        for (Birthable birthable : birthables) {
            if (birthable.getBirthDate().endsWith(year)) {
                System.out.println(birthable.getBirthDate());
            }
        }
    }
}
