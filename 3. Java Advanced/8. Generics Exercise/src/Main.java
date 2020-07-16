import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String[] array = ArrayCreator.create(5, "alice");
        String[] array2 = ArrayCreator.create(String.class, 5, "Bob");
        for (int i = 0; i < array2.length; i++) {
            System.out.println(array2[i]);
        }
    }
}
